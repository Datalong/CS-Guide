package cn.ItTest.Basic.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Auther: Datalong
 * @Date: 2021/4/15 - 04 -15 -10:11
 * @Dscription: 使用LinkedHashMap的构造方法将accessOrder设置为true,开启LRU顺序：
 * 重写removeEBIdestEntry方法实现，在节点多于MAX_ENTRIES就会将最近最久未使用的数据移除
 * @version: 1.0
 */
public class LRUCache<k,v> extends LinkedHashMap<k,v> {
    private static final int MAX_ENTRIES = 3;

    protected boolean removeEldesEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }

    LRUCache() {
        super(MAX_ENTRIES, 0.75f, true);
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>();
        cache.put(1,"a");
        cache.put(2,"b");
        cache.put(3,"c");
        cache.get(1);
        cache.put(4,"d");
        System.out.println(cache.keySet());
    }
}
