package Jisp.lang;

import Jisp.lang.Abstract.ASeq;
import Jisp.lang.Interface.*;

import java.io.Serializable;

final public class Cons extends ASeq implements Serializable {

    private static final long serialVersionUID = 6682587018567831263L;

    private final Object _first;
    private final ISeq _more;

    public Cons(Object first, ISeq _more){
        this._first = first;
        this._more = _more;
    }


    public Cons(IPersistentMap meta, Object _first, ISeq _more){
        super(meta);
        this._first = _first;
        this._more = _more;
    }

    public Object first(){
        return _first;
    }

    public ISeq next(){
        return more().seq();
    }

    public ISeq more(){
        if(_more == null)
            return PersistentList.EMPTY;
        return _more;
    }

    public int count(){
        return 1 + RT.count(_more);
    }

    public Cons withMeta(IPersistentMap meta){
        if(meta() == meta)
            return this;
        return new Cons(meta, _first, _more);
    }
}