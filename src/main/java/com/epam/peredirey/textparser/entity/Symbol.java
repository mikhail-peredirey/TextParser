package com.epam.peredirey.textparser.entity;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class Symbol implements WordPart {

    private final Character value;

    public Symbol(Character value) {
        this.value = value;
    }

    public Symbol(){
        this.value = '\0';
    }

    @Override
    public String toSourceString(){
        return toString();
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
