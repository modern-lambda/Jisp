package Jisp.lang;

import Jisp.lang.Interface.IObj;
import Jisp.lang.Interface.IPersistentMap;

import java.io.Serializable;

public abstract class Obj implements IObj, Serializable {

    private static final long serialVersionUID = 802029099426284526L;

    final IPersistentMap _meta;

    public Obj(IPersistentMap meta) {
        this._meta = meta;
    }

    public Obj() {
        this._meta = null;
    }

    final public IPersistentMap meta() {
        return _meta;
    }

    abstract public Obj withMeta(IPersistentMap meta);
}
