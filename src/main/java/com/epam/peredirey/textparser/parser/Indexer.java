package com.epam.peredirey.textparser.parser;

import com.epam.peredirey.textparser.entity.TextPart;
import com.epam.peredirey.textparser.util.RegExPatternManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class Indexer {
    private final static Logger log = LoggerFactory.getLogger(Indexer.class);
    private List<Integer> breakPoints;

    public Indexer() {
        breakPoints = new ArrayList<>();
    }

    public <T extends TextPart> List<Integer> index(Class<T> clazz, String sourceStr) {

        try {
            T operation = clazz.newInstance();
            RegExPatternManager pm = new RegExPatternManager("regex.properties");
            String pattern = "";

            if (clazz.getSimpleName().equals("Paragraph")) {
                pattern = pm.getPattern("paragraph");
            }

            if (clazz.getSimpleName().equals("Sentence")) {
                pattern = pm.getPattern("sentence");
            }

            if (clazz.getSimpleName().equals("Word")) {
                pattern = pm.getPattern("word");
            }

            if (clazz.getSimpleName().equals("Symbol")) {
                pattern = pm.getPattern("symbol");
            }

            Pattern p = Pattern.compile(pattern, Pattern.UNICODE_CHARACTER_CLASS);
            Matcher m = p.matcher(sourceStr);
            while (m.find()) {
                log.info(clazz.getSimpleName() + " Indexed! Start: " + m.start() + " End: " + m.end());
                breakPoints.add(m.end());
            }

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return breakPoints;
    }
}
