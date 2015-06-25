package com.epam.peredirey.textparser.util;

import com.epam.peredirey.textparser.entity.Text;
import com.epam.peredirey.textparser.parser.RegExParser;

/**
 * Created by mikhail.peredirey on 24.06.2015.
 */


public class Test {
    public static void main(String[] args) {
        // String text = "???:[]<>Lorem ipsum dolor sit amet\n" +
        //         "Nulla facilisi. vel lacinia lectus scelerisque.\n" +
        //         "\n" +
        //         "Vivamus ean posuere convallis pellentesque. \n" +
        //         "\n" +
        //         "\n" +
        //         "Donec at122145 h ??";
//
        // String text = "Par1. Sentence1! Sentence2?\nPar2. Sentence1! Sentence2? \nPar3. Sentence1! Sentence2? \n Par4. Sentence1! Sentence2?\n ";
        String text = "Lorem ipsum.\n Consec-tetur 123.6 ds .37 d. SSD!\nInteger 100% et. Ante mollis dui. tempus luctus.";
        // String text = "L     O...";
        //Text wrd = Parser.parseText(text);
        // System.out.println("wrd = " + WRD);

        // List<String> list = new ArrayList<>();
        // list.add("one");
        // list.add("twi");
        // list.add("trhee");
        // Paragraph par0 = new Paragraph();
        // Paragraph par1 = new Paragraph(Arrays.asList(new Sentence(Arrays.asList(new Word(Arrays.asList(new Symbol()))))));
        // // Text txt0 = new Text();
        // Text txt1 = new Text(Arrays.asList(par0, par1));
        // System.out.println("txt0 = " + txt0);
        // System.out.println("txt1 = " + txt1);
        //  Sentence sent = new Sentence();
        //  System.out.println("txt0 = " + txt1.getElement(0));

        //  Indexer indx = new Indexer();
        //  indx.index(Paragraph.class, text);
        //  indx.index(Sentence.class, text);

        RegExParser parser = new RegExParser();
        Text txt = parser.parseText(text);
        // System.out.println(txt.toString());
        System.out.println(txt.toSourceString());


    }
}
