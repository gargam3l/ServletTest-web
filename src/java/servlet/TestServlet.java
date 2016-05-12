/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 604772006
 */
public class TestServlet extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
   DBLogic db= new DBLogic();
       res.setContentType("text/plain");
    PrintWriter out = res.getWriter();
    //db.kapcsolatNyit();
    out.println(db.kapcsolatTeszt());
    //db.kapcsolatZár();
    //out.println("Hello world!");
  }
}
