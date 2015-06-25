package com.epam.peredirey.textparser.entity;

import java.util.List;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public interface CompoundText<T extends TextPart> {
    public abstract T getElement(int index);

    public abstract List<T> getAllElements();

    public abstract boolean add(T element);

    public abstract String toSourceString();

}
