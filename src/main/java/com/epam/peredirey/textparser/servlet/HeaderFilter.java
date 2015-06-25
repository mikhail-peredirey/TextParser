package com.epam.peredirey.textparser.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mikhail.peredirey on 24.06.2015.
 */
public abstract class HeaderFilter implements Filter {
    public void destroy(){
    }

    public void doFilter(ServletException req, ServletResponse res, FilterChain chain) throws ServletException, IOException{
        HttpServletResponse response = (HttpServletResponse) res;
        response.addHeader("author", "mikhail.peredirey@gmail.com");
        response.addHeader("project", "WEB-TextParser-Task-2");
        res.setCharacterEncoding("UTF-8");
        chain.doFilter((ServletRequest) req, response);
    }

    public void init(FilterConfig filterConfig) {
    }
    }

