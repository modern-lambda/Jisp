package Jisp.lang.Interface;

public interface ISeq extends IPersistentCollection {

    Object first();

    ISeq next();

    ISeq more();

    ISeq cons(Object o);
}
