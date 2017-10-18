package Vodafon.Storefront.Utils;

import java.util.HashMap;

/**
 * Created by Grzegorz Gałuszka on 01.06.2017.
 */
public class LowerCaseHashMap<K,V> extends HashMap<K,V> {

    @Override
    public boolean containsKey(Object key) {
        if (key instanceof String) {
            key = ((String) key).toLowerCase();
        }
        return super.containsKey(key);
    }

    @Override
    public V get(Object key) {
        if (key instanceof String) {
            key = ((String) key).toLowerCase();
        }
        return super.get(key);
    }

    @Override
    public V put(K key, V value) {
        if (key instanceof String) {
            key = (K) ((String) key).toLowerCase();
        }
        return super.put(key, value);
    }
}
