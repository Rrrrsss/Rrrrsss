package com.htgy.actions;

/*
 * Ìø×ªµ½regist.jspÒ³Ãæ
 */
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import org.springframework.web.servlet.ModelAndView;  
import org.springframework.web.servlet.mvc.Controller;  
public class ToRegistAction implements Controller {  
    @Override  
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {  
    return new ModelAndView("regist");
    }  
}