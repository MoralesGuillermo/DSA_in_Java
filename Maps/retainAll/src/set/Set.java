package set;

import java.util.Iterator;

public interface Set<K> extends Iterable<K>{

    boolean add(K element);

    boolean remove(K element);

    boolean contains(K element);

    Iterator<K> iterator();

    boolean retainAll(Set<K> T);
}
