package Jisp.lang.Interface;

public interface Associative extends IPersistentCollection, ILookup {

    boolean containsKey(Object key);

    IMapEntry entryAt(Object key);

    Associative assoc(Object key, Object val);

}
