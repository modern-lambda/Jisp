package Jisp.lang.Interface;

public interface IPersistentStack extends IPersistentCollection {
    Object peek();

    IPersistentStack pop();
}
