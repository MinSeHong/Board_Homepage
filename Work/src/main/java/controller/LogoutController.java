package controller;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.JWTOkens;

@WebServlet("/Logout")
public class LogoutController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//■■■■■■■■■■■■■■■쿠키 삭제■■■■■■■■■■■■■■■
		JWTOkens.removeToken(req, resp);
		resp.sendRedirect("/Login");
	}
}
