package Servlets1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(value = "/food")
public class Food extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();

        out.print("<form action='/data' method='get'>");
        out.print("<p>NAME   <input type='text' style='width: 300px; height:50px; margin-left:30px'  name='name'/></p>");
        out.print("<p>SURNAME   <input type='text' style='width: 300px; height:50px;' name='surname'/></p>");
        out.print("<p>FOOD       <select name='food' style='width: 300px; height:50px;margin-left:35px' >" +
                "<option>Burger 2000-KZT</option>"+
                "<option>Pizza  4000-KZT</option>"+
                "<option>Cola   500-KZT</option>"+
                "<option>Meat   8000-KZT</option>"+
                "<option>Orange 400-KZT</option>"+
                "</option>" +
                "</select>");
        out.print("<p>" +
                "<button type='submit' style='width: 100px; height:50px; background-color:blue;margin-left:280px'>ORDER FOOD</button>"
                +"</p>");
        out.print("</form>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
