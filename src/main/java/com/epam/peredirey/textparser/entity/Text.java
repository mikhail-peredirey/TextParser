package com.epam.peredirey.textparser.entity;

import java.util.List;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class Text extends AbstractCompoundText<Paragraph> {

    public  Text(List<Paragraph> components) {
        super(components);
    }

    public Text(){
        super();
    }
}