import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by liujiashu on 16/5/10.
 */
public class PrimitiveServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.printf("init");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = servletResponse.getWriter();
        out.println("hello xyz!");
        out.print("bye xyz!");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
