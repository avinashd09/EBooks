
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class BooksCatalog extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         PrintWriter out=resp.getWriter();
        File F=new File("C:\\BOOKS");
        String s[]=F.list();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>SEARCH BOOKS</h3>");
        out.println("<form action=ShowBooks");
        out.println("<pre>");
        out.println("BOOKS <select name=bname>");
            for(String tmp:s)
            {
        out.println("<option>");        
        out.print(tmp);
            }
        out.println("</option>");
        out.println("</select>");
        out.println("<input type=submit value=search");
        out.println("</pre>");
        out.println("<form>");
        out.println("<a href=index.html>HOME</a>");
        out.println("</body>");
        out.println("</html>");
    }

   
    }


