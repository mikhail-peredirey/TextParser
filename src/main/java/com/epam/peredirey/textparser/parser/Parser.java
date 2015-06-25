package com.epam.peredirey.textparser.parser;

import com.epam.peredirey.textparser.entity.*;

/**
 * Created by mikhail.peredirey on 24.06.2015.
 */
public interface Parser {
    public Text parseText(String str);

    public Paragraph parseParagraph(String str);

    public Sentence parseSentence(String str);

    public Word parseWord(String str);

    public Symbol parseSymbol(String str);

    public PunctuationMark parsePunctuationMark(String str);

    public WhiteSpace parseWhiteSpace(String str);

}