package com.epam.peredirey.textparser.entity;

import java.util.List;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart {

    public Paragraph(List<Sentence> components) {
        super(components);
    }

    public Paragraph() {
        super();
    }
}
