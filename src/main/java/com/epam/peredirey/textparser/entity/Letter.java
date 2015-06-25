package com.epam.peredirey.textparser.entity;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class Letter extends Symbol {

    //todo "-" is a letter too, when use dual words, semi-particelar etc
    public Letter(Character value){
        super(value);
    }

    public Letter(){
        super();
    }
}
