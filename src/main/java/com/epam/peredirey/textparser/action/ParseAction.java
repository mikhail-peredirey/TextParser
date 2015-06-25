package com.epam.peredirey.textparser.action;

import com.epam.peredirey.textparser.entity.Text;
import com.epam.peredirey.textparser.parser.RegExParser;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public class ParseAction implements Action {
    @Override
    public String execute(HttpServletRequest request){
        String reqText = request.getParameter("text");
        RegExParser parser = new RegExParser();
        Text txt;
        txt = parser.parseText(parser.clean(reqText));
        request.setAttribute("test", txt);
        return "/WEB-INF/output.jsp";
    }
}
