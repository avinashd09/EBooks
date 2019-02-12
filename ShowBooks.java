 import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowBooks extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bname=req.getParameter("bname");
    String ctype="application/vnd.ms-powerpoint";
    if(bname.endsWith(".docx"))
            {
            ctype="application/msword";
            }
    resp.setContentType(ctype);
    String Fname="C:\\BOOKS\\"+bname;
    FileInputStream FIS=new FileInputStream(Fname);
    int n=FIS.available();
    byte b[]=new byte[n];
    FIS.read();
    FIS.close();
    ServletOutputStream out=resp.getOutputStream();
    out.write(b);
    out.close();
    }

   


}
