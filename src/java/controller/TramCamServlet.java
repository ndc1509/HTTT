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
@WebServlet(urlPatterns = {"/tram-cam", "/ket-luan-5"})
public class TramCamServlet extends HttpServlet{
    private static final long serialVersionUID = 2L;

    public TramCamServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("tram-cam.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q5 = req.getParameter("q5");
        String[] q5_1 = req.getParameterValues("q5-1");
        List<FactPair> facts = new ArrayList<>();
        facts.add(new FactPair(q5, ""));
        facts.add(new FactPair("q5-score", q5_1.length));
        if(q5_1.length > 2){     
            String[] q5_2 = req.getParameterValues("q5-2");
            if(q5_2.length > 0){
                for(int i=0; i<q5_2.length; i++){
                    facts.add(new FactPair(q5_2[i], ""));
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

