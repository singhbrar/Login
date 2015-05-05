/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author asi
 */
public class HelloWorldServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException ,NullPointerException{
       //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        PrintWriter out=resp.getWriter();
        String name=req.getParameter("name");
        String course=req.getParameter("course");
        String q=req.getParameter("java");
        String w=req.getParameter("c#");
        String e=req.getParameter("c++");
        String qwe="";
        String qweqwe=req.getParameter("bagay");
        //out.println("Hello World");
        if(q!=null)
            qwe+=q+" ";
        if(w!=null)
            qwe+=w+" ";
        if(e!=null)
            qwe+=e+" ";
        out.print("Hello "+ name);
        out.println("Graduate  na og "+course);
        
        out.println("Learn "+qwe);
        if(qweqwe==null)
             out.print("you have no fighter");
        else if(qweqwe.equals("floyd"))
                out.print("daog floyd");
        else 
               out.print("pildi manny");
           
        
    }
    
    
    
    
}
