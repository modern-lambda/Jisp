package Jisp.lang.Interface;

public interface IPersistentCollection extends Seqable {

    int count();

    IPersistentCollection cons(Object o);

    IPersistentCollection empty();

    boolean equiv(Object o);
}
