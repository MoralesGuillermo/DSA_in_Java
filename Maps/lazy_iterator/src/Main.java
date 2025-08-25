
import map.SortedTableMap;
import util.Entry;

public class Main {
    public static void main(String[] args){
        SortedTableMap<String, Integer> map = new SortedTableMap<>();
        map.put("Hello", 1);
        map.put("Hi", 2);
        map.put("Greetings", 3);
        for (Entry<String, Integer> entry: map.lazyEntrySet()){
            System.out.println("Key: '" + entry.getKey() + "'' Value: " + entry.getValue());
        }
    }
}
