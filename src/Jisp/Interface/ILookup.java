package Jisp.Interface;

public interface ILookup {

    Object valAt(Object key);

    Object valAt(Object key, Object notFound);
}
