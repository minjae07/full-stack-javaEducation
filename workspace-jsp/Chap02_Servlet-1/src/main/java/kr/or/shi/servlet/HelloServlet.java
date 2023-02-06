package kr.or.shi.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * URL매핑코드가 @wevServlet 어노테이션에 표기됨.
 * 서블릿은 HttpServlet 클래스를 자동으로 상속 받음.
 */
//@WebServlet 어노테이션보다 web.xml에서 지정한 매핑코드가 우선순위 훨씬 높음.
@WebServlet("/HServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HelloServlet() {
     
    }

    /*
     * 여기서 2가지 메서드가 나옴 -- doGet(), doPost()임, 이것은 이 서블릿파일이 처리되는 부분임.
     * 이 서블릿을 호출할때 즉 클라이언트에서 요청이 들어올 때, get방식이냐, post방식이냐에 따라 호출이 달라짐.
     * 보통, doGet()메서드는 폼을 그냥 출력하는 형태로 많이 쓰이고, 
     * doPost()메서드는 데이터를 가공하거나 처리코드를 실행할때 많이 사용됨.
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello Servelt!");
		System.out.println("doGet()");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	/*
	 * 소결론 
	 * 1. jsp파일 : HTML파일내에 jsp코드를 넣는 것.
	 * 2. servlet파일 : 자바파일이고, 반드시 매핑을 해서 사용해야 한다.
	 */

}
