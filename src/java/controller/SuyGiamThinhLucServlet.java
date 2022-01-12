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
@WebServlet(urlPatterns = {"/suy-giam-thinh-luc", "/ket-luan-6"})
public class SuyGiamThinhLucServlet extends HttpServlet{
    private static final long serialVersionUID = 2L;

    public SuyGiamThinhLucServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("suy-giam-thinh-luc.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String q6 = req.getParameter("q6");
        String q6_1 = req.getParameter("q6-1");
        List<FactPair> facts = new ArrayList<>();
        facts.add(new FactPair(q6, ""));
        facts.add(new FactPair(q6_1, ""));
        if(q6_1.equals("q6-1b")){     
            String q6_2 = req.getParameter("q6-2");
            facts.add(new FactPair(q6_2, ""));
            if(!q6_2.equals("q6_2a")){
                String[] q6_3 = req.getParameterValues("q6-3");
                if(q6_3 != null){
                    for(int i=0; i<q6_3.length; i++){
                        facts.add(new FactPair(q6_3[i], ""));
                    }
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
