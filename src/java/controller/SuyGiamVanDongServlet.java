/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.Fact;
import engine.Data;
import fact.DefaultFact;
import fact.FactPair;
import fact.FactPairs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cuong
 */
    @WebServlet(urlPatterns = {"/suy-giam-van-dong", "/ket-luan-4"})
public class SuyGiamVanDongServlet extends HttpServlet{
    private static final long serialVersionUID = 2L;

    public SuyGiamVanDongServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("suy-giam-van-dong.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q4 = req.getParameter("q4");
        String q4_1 = req.getParameter("q4-1");
        List<FactPair> facts = new ArrayList<>();
        if(q4_1.equals("q4-1a")){     
            facts.add(new FactPair(q4, ""));
            facts.add(new FactPair(q4_1, ""));
        } else{
            int q4_2_1 = Integer.parseInt(req.getParameter("q4-2-1")); 
            int q4_2_2 = Integer.parseInt(req.getParameter("q4-2-2")); 
            int q4_2_3 = Integer.parseInt(req.getParameter("q4-2-3")); 
            int q4_2_4 = Integer.parseInt(req.getParameter("q4-2-4")); 
            int q4_2_5 = Integer.parseInt(req.getParameter("q4-2-5")); 
            int sum = q4_2_1 + q4_2_2 + q4_2_3 + q4_2_4 + q4_2_5;
            facts.add(new FactPair(q4, ""));
            facts.add(new FactPair(q4_1, ""));
            facts.add(new FactPair("q4-2", sum));
            String[] q4_3 = req.getParameterValues("q4-3");
            if(q4_3 != null){
                for(int i=0; i<q4_3.length; i++){
                    facts.add(new FactPair(q4_3[i], ""));
                }
            }
        }
            
            
            
        Fact fact = new DefaultFact(new FactPairs(facts));
        Data d = new Data();
        String advice = d.run(fact);

        req.setAttribute("data", advice);
        req.getRequestDispatcher("ket-luan.jsp").forward(req, resp);
            
    } 



}


