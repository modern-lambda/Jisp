package Jisp.lang;

public class ArityException extends IllegalArgumentException {

    private static final long serialVersionUID = 2265783180488869950L;

    final public int actual;

    final public String name;

    public ArityException(int actual, String name) {
        this(actual, name, null);
    }

    public ArityException(int actual, String name, Throwable cause) {
        super("Wrong number of args (" + (actual <= 20 ? actual : "> 20") + ") passed to: " + Compiler.demunge(name), cause);
        this.actual = actual;
        this.name = name;
    }
}
