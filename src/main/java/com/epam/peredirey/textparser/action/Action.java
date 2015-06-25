package com.epam.peredirey.textparser.action;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mikhail.peredirey on 23.06.2015.
 */
public interface Action {
    String execute(HttpServletRequest request);
}
