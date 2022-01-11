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

@WebServlet(urlPatterns = {"/suy-giam-nhan-thuc", "/ket-luan-2"})
public class SuyGiamNhanThucServlet extends HttpServlet{
    private static final long serialVersionUID = 2L;

    public SuyGiamNhanThucServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ask_more", false);
        req.getRequestDispatcher("suy-giam-nhan-thuc.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String q2 = req.getParameter("q2a");
        int q2_1 = Integer.parseInt(req.getParameter("q2-1"));
        int q2_2 = Integer.parseInt(req.getParameter("q2-2")); 
        int score = q2_1 + q2_2;
        List<FactPair> facts = new ArrayList<>();
        facts.add(new FactPair(q2, "")); //"hay quen" Hoặc "khoxacdinhkhongthoigian"
        facts.add(new FactPair("q2-score", score));

        if(score < 4){
            String[] q2_3 = req.getParameterValues("q2-3");
            if(q2_3 != null){
                for(String str:q2_3){
                    facts.add(new FactPair(str, ""));
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
