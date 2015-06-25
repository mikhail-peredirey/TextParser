package com.epam.peredirey.textparser.servlet;

import com.epam.peredirey.textparser.action.Action;
import com.epam.peredirey.textparser.action.ActionFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mikhail.peredirey on 24.06.2015.
 */
public class Controller extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String actionName = request.getParameter("action");
        Action action = ActionFactory.getAction(actionName);
        String result = action.execute(request);
        request.getRequestDispatcher(result).forward(request,response);
    }
}
