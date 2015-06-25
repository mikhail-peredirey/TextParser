package com.epam.peredirey.textparser.entity;


import java.util.List;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class Sentence extends AbstractCompoundText<SentencePart> implements TextPart, ParagraphPart, Comparable<Sentence> {

    public Sentence(List<SentencePart> components){
        super(components);
    }

    public Sentence(){
        super();
    }

    @Override
    public int compareTo(Sentence o){
        return 0;
    }
}
