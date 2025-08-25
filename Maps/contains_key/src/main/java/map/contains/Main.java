package map.contains;

import map.contains.map.ChainHashMap;
import map.contains.map.ProbeHashMap;
import map.contains.map.Map;

public class Main {
    public static void main(String[] args) {
        ChainHashMap<String, Integer> chainMap = new ChainHashMap<>();
        ProbeHashMap<String, Integer> probeMap = new ProbeHashMap<>();
        String key1 = "key1";
        int value1 = 1;
        String key2 = "key2";
        int value2 = 2;

        chainMap.put(key1, value1);
        chainMap.put(key2, value2);
        probeMap.put(key1, value1);
        probeMap.put(key2, value2);

        System.out.println("The Chain Map has the key " + key1 + ": " + chainMap.containsKey(key1));
        System.out.println("The Chain Map has the key " + "hello" + ": " + chainMap.containsKey("hello"));
        System.out.println("The Probe Map has the key " + key2 + ": " + probeMap.containsKey(key2));
        System.out.println("The Probe Map has the key " + "hello" + ": " + probeMap.containsKey("hello"));
    }
}