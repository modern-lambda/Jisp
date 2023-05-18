package Jisp.lang.Interface;

public interface IReference extends IMeta {
    IPersistentMap alterMeta(IFn alter, ISeq args) ;
    IPersistentMap resetMeta(IPersistentMap m);
}