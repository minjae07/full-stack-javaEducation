package kr.or.shi.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 호출됨");
		
		//클라이언트가 요청한 파라매터 값들을 인코딩을 설정해주는 코드가 된다.
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
//		//출력스트림 획득
//		PrintWriter writer = response.getWriter();
//		writer.print("안녕하세요");
//		writer.println("<html>");
//		writer.println("<head>");
//		writer.println("<body>");
//		writer.println("<h1>doGet방식입니다. 반갑습니다.");
//		
//		
//		writer.println("</h1>");
//		writer.println("</body>");
//		writer.println("</head>");
//		writer.println("</html>");
//		
//		writer.close();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + password + "<br/>");
		writer.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 호출됨");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		PrintWriter writer = response.getWriter();
		writer.println("아이디 : " + id + "<br/>");
		writer.println("비밀번호 : " + password + "<br/>");
		writer.close();
	}

}
