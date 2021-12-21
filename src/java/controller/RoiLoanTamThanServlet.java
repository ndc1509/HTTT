/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import engine.Data;
import common.Fact;
import engine.RuleEngine;
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

@WebServlet(urlPatterns = {"/roi-loan-tam-than", "/ket-luan-3"})
public class RoiLoanTamThanServlet extends HttpServlet{
    private static final long serialVersionUID = 3L;

    public RoiLoanTamThanServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ask_more", false);
        req.getRequestDispatcher("roi-loan-tam-than.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int form = Integer.parseInt(req.getParameter("form"));
        if(form == 1){
            String q3 = req.getParameter("q3");
            String[] q3_1 = req.getParameterValues("q3-1");
            int score_1 = 0;
            if(q3_1 != null)
                score_1 = q3_1.length;
            List<FactPair> facts = new ArrayList<>();
            facts.add(new FactPair(q3, "")); 
            facts.add(new FactPair("q3-score-1", score_1));
            
            Fact fact = new DefaultFact(new FactPairs(facts));
            Data d = new Data();
            String advice = d.run(fact);
            
            if(!advice.equals("")){
                req.setAttribute("data", advice);
                req.getRequestDispatcher("ket-luan.jsp").forward(req, resp);
            } else {
                req.setAttribute("ask_more", true);
                req.setAttribute("q3", "q3a");
                req.setAttribute("score", 3);
                req.getRequestDispatcher("roi-loan-tam-than.jsp").forward(req, resp);
            }
        } else{
            String q3 = req.getParameter("q3");
            int score_1 = Integer.parseInt(req.getParameter("q3-score-1"));
            String[] q3_2 = req.getParameterValues("q3-2");
            int score_2 = 0;
            if(q3_2 != null)
                score_2 = q3_2.length;
            List<FactPair> facts = new ArrayList<>();
            facts.add(new FactPair(q3, "")); 
            facts.add(new FactPair("q3-score-1", score_1));
            facts.add(new FactPair("q3-score-2", score_2));
            
            Fact fact = new DefaultFact(new FactPairs(facts));
            Data d = new Data();
            String advice = d.run(fact);

            req.setAttribute("data", advice);
            req.getRequestDispatcher("ket-luan.jsp").forward(req, resp);
        }        
    }
}
