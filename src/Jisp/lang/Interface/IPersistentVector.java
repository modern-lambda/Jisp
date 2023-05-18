package Jisp.lang.Interface;

public interface IPersistentVector extends Associative, Sequential, IPersistentStack, Reversible, Indexed {
    int length();

    IPersistentVector assocN(int i, Object val);

    IPersistentVector cons(Object o);
}
