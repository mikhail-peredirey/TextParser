package com.epam.peredirey.textparser.entity;

import java.util.List;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class Word extends AbstractCompoundText<Symbol> implements SentencePart {

    public Word(List<Symbol> components){
        super(components);
    }

    public Word(){
        super();
    }
}
