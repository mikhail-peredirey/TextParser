package com.epam.peredirey.textparser.parser;

import com.epam.peredirey.textparser.entity.*;
import com.epam.peredirey.textparser.util.RegExPatternManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class RegExParser implements Parser {
    private final static Logger log = LoggerFactory.getLogger(Parser.class);

    public RegExParser(){

    }

    public String clean(String textStr){
        RegExPatternManager pm = new RegExPatternManager("regex.properties");
        textStr = textStr.replaceAll(pm.getPattern("multiply.spaces"), " ");
        textStr = textStr.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        return textStr;
    }

        public Text parseText (String sourceText){
            Text text = new Text();
            Indexer indxr = new Indexer();
            Paragraph parsedPar = new Paragraph();
            int startPoint = 0;
            int endPoint = 0;

    for (Integer breakPoint : indxr.index(Paragraph.class, sourceText)) {
        endPoint = breakPoint;
        parsedPar = parseParagraph(sourceText.substring(startPoint, endPoint));
        text.add(parsedPar);
        startPoint = endPoint;
    }

    return text;
}

    @Override
    public Paragraph parseParagraph(String str) {

        Paragraph par = new Paragraph();
        Indexer indxr = new Indexer();
        Sentence parsedSent = new Sentence();
        int startPoint = 0;
        int endPoint = 0;

        for (Integer breakPoint : indxr.index(Sentence.class, str)) {
            endPoint = breakPoint;
            parsedSent = parseSentence(str.substring(startPoint, endPoint));
            par.add(parsedSent);
            startPoint = endPoint;
        }

        return par;
    }

    @Override
    public Sentence parseSentence(String sentence) {

        Sentence sent = new Sentence();
        Indexer indxr = new Indexer();
        Word parsedWord = new Word();
        int startPoint = 0;
        int endPoint = 0;

        for (Integer breakPoint : indxr.index(Word.class, sentence)) {
            endPoint = breakPoint;
            parsedWord = parseWord(sentence.substring(startPoint, endPoint));
            sent.add(parsedWord);
            startPoint = endPoint;
        }

        return sent;
    }

    @Override
    public Word parseWord(String str) {

        Word wrd = new Word();
        Indexer indxr = new Indexer();
        Symbol parsedSymb = new Symbol();
        int startPoint = 0;
        int endPoint = 0;

        for (Integer breakPoint : indxr.index(Symbol.class, str)) {
            endPoint = breakPoint;
            parsedSymb = parseSymbol(str.substring(startPoint, endPoint));
            wrd.add(parsedSymb);
            startPoint = endPoint;
        }
        return wrd;
    }

    @Override
    public Symbol parseSymbol(String str) { // !letter or puncto or whitespace!
        //define type of SYMBOL and return it

        Symbol symb = new Symbol();
        RegExPatternManager pm = new RegExPatternManager("regex.properties");
        Pattern whiteSpacePattern = Pattern.compile(pm.getPattern("whitespace"), Pattern.UNICODE_CHARACTER_CLASS);
        Pattern punctuationPattern = Pattern.compile(pm.getPattern("punctuation"), Pattern.UNICODE_CHARACTER_CLASS);

        Matcher whiteSpaceMatcher = whiteSpacePattern.matcher(str);
        Matcher punctuationMatcher = punctuationPattern.matcher(str);

        if (whiteSpaceMatcher.find()) {
            symb = new WhiteSpace();
            return symb;
        }

        if (punctuationMatcher.find()) {
            symb = new PunctuationMark(str.toCharArray()[0]);
            return symb;
        }

        Character charctr = '\0';
        for (char o : str.toCharArray()) {
            charctr = o;
        }

        return new Symbol(charctr);
    }

    @Override
    public PunctuationMark parsePunctuationMark(String str) {
        return null;
    }

    @Override
    public WhiteSpace parseWhiteSpace(String str) {


        return new WhiteSpace();
    }
}

