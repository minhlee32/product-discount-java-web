import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet",urlPatterns = "/calculate")
public class ProductDiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String description = request.getParameter("description");

        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));

        double discountAmount = price * percent * 0.01;

        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<h2> Discount Amount: " + discountAmount + "</h2>");
        writer.print("</html>");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
