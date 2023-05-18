package Jisp.lang.Abstract;

import Jisp.lang.Interface.*;
import Jisp.lang.RT;

import java.io.Serializable;
import java.util.Comparator;

public abstract class AFunction extends AFn implements IObj, Comparator, Fn, Serializable {

    private static final long serialVersionUID = 4469383498184457675L;

    public volatile MethodImplCache __methodImplCache;

    public IPersistentMap meta(){
        return null;
    }

    public IObj withMeta(final IPersistentMap meta){
        if(meta == null)
            return this;
        return new RestFn(){
            protected Object doInvoke(Object args) {
                return AFunction.this.applyTo((ISeq) args);
            }

            public IPersistentMap meta(){
                return meta;
            }

            public IObj withMeta(IPersistentMap newMeta){
                if(meta == newMeta)
                    return this;
                return AFunction.this.withMeta(newMeta);
            }

            public int getRequiredArity(){
                return 0;
            }
        };
    }

    public int compare(Object o1, Object o2){
        Object o = invoke(o1, o2);

        if(o instanceof Boolean)
        {
            if(RT.booleanCast(o))
                return -1;
            return RT.booleanCast(invoke(o2,o1))? 1 : 0;
        }

        Number n = (Number) o;
        return n.intValue();
    }
}
