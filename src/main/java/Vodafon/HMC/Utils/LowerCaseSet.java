package Vodafon.HMC.Utils;

import java.util.HashSet;

/**
 * Created by Grzegorz Gałuszka on 01.06.2017.
 */
public class LowerCaseSet<E> extends HashSet<E> {

    @Override
    public boolean add(E e) {
        if (e instanceof String) {
            e = (E) ((String) e).toLowerCase();
        }
        return super.add(e);
    }

    @Override
    public boolean contains(Object e) {
        if (e instanceof String) {
            e = (E) ((String) e).toLowerCase();
        }
        return super.contains(e);
    }
}
