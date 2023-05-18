package Jisp.lang.Interface;

public interface Indexed extends Counted{
    Object nth(int i);

    Object nth(int i, Object notFound);
}
