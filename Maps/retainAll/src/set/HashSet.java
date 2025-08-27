package set;

import java.util.Iterator;


import map.AbstractHashMap;
import map.ProbeHashMap;

public class HashSet<K> implements Set<K> {
    
    private AbstractHashMap<K, Object> set = new ProbeHashMap<>();
    
    @Override
    public boolean add(K element){
        return set.put(element, new Object()) != null;
    }

    @Override
    public boolean remove(K element){
        return set.remove(element) != null;
    }

    @Override
    public boolean contains(K element){
        return set.get(element) != null;

    }

    @Override
    public Iterator<K> iterator(){
        return set.keySet().iterator();
    }

    @Override
    public boolean retainAll(Set<K> T){
        boolean changed = false;
        for (K element: T){
            if (!contains(element)){
                remove(element);
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public String toString(){
        StringBuilder stringSet = new StringBuilder("{");
        for (K element: this){
            stringSet.append(element);
            stringSet.append(",");
        }
        // Remove trailing comma
        stringSet.deleteCharAt(stringSet.length() - 1);
        stringSet.append("}");
        return stringSet.toString();
    }    
}
