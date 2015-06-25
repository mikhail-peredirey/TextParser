package com.epam.peredirey.textparser.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public abstract class AbstractCompoundText<T extends TextPart> implements CompoundText<T> {
    private List<T> components;

    public AbstractCompoundText(List<T> components){
        this.components = components;
    }

    public AbstractCompoundText(){
        this.components = new ArrayList<>();
    }

    @Override
    public String toSourceString(){
    StringBuilder builder = new StringBuilder();
        for (T component : components){
            builder.append(component.toSourceString());
        }
    return builder.toString();
    }

    @Override
    public List<T> getAllElements(){
        List<T> result = new ArrayList<>();
        result.addAll(components);
        return result;
    }

    @Override
    public boolean add(T element){
    return (this.components.add(element));
    }

    @Override
    public T getElement(int index){
        return this.components.get(index);
    }

    @Override
    public String toString(){
        return components.toString();
    }
}