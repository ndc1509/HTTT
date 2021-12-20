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

@WebServlet(urlPatterns = {"/suy-dinh-duong", "/ket-luan-1"})
public class SuyDinhDuongServlet extends HttpServlet{
    private static final long serialVersionUID = 3L;

    public SuyDinhDuongServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("suy-dinh-duong.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q1 = req.getParameter("q1a");
        int q1_1 = Integer.valueOf(req.getParameter("q1-1"));
        int q1_2 = Integer.valueOf(req.getParameter("q1-2"));        
        int q1_3 = Integer.valueOf(req.getParameter("q1-3"));   
        int q1_4 = Integer.valueOf(req.getParameter("q1-4"));   
        int q1_5 = Integer.valueOf(req.getParameter("q1-5"));   
        int q1_6 = Integer.valueOf(req.getParameter("q1-6"));   
        
        List<FactPair> facts = new ArrayList<>();
        facts.add(new FactPair(q1, ""));
        facts.add(new FactPair("q1-score",q1_1 + q1_2 + q1_3 + q1_4 + q1_5 + q1_6));

        Fact fact = new DefaultFact(new FactPairs(facts));

        Data d = new Data();
        String advice = d.run(fact);
        
        req.setAttribute("data", advice);
        req.getRequestDispatcher("ket-luan.jsp").forward(req, resp);
    }
}
