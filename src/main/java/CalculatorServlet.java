import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "CalculatorServlet", urlPatterns = "/display")
public class CalculatorServlet extends HttpServlet {
    private static double opreation(double number1, double number2, char opera) throws RuntimeException {
        switch (opera) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new RuntimeException("can not divide by 0");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double number1 = Double.parseDouble(request.getParameter("number1"));
        double number2 = Double.parseDouble(request.getParameter("number2"));
        char opera = request.getParameter("opera").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        try {
            double calculator = opreation(number1, number2, opera);
            writer.print("<h1 style = \"text-align: center;\">Result</h1>");
            writer.print("<h2 style = \"text-align: center;\">" + number1 + " + " + number2 + " = " + calculator + "</h2>");
        } catch (Exception e) {
            writer.print("error: " + e.getMessage());
        }
        writer.print("</html>");


    }
}
