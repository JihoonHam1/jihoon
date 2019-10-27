package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class traing
 */
@WebServlet(name = "order", urlPatterns = { "/order" })
public class traing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public traing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int mainmenu = Integer.parseInt(request.getParameter("main"));
		int sidemenu = Integer.parseInt(request.getParameter("side"));
		int drink = Integer.parseInt(request.getParameter("drink"));
		
		String mainm = "";
		String sidem = "";
		String drinkm = "";
		
		int bprice = 0;
		int sprice = 0;
		int dprice = 0;
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title><b>감사합니다</b></title></head>");
		out.println("<body>");
		switch (mainmenu) {
		case 5000 : 
			mainm = "한우버거";
			bprice = 5000;
		break;
		case 4500 :
			mainm = "밥버거";
			bprice = 4500;
		break;
		case 4000 :
			mainm = "치즈버거";
			bprice = 4000;
		break;
		}
		
		switch (sidemenu) {
		case 1500 :
			sidem = "감자튀김";
			sprice = 1500;
		break;
		case 1700 :
			sidem = "어니언링";
			sprice = 1700;
		}
		
		switch(drink) {
		case 1000 :
			drinkm = "콜라 or 사이다";
			sprice = 1000;
		break;
		case 1500 :
			drinkm = "커피";
			dprice = 1500;
		break;
		case 2500 :
			drinkm = "밀크쉐이크";
			dprice = 2500;
		}
		
		
		out.println("<h2>감사합니다</h2>"); 
		out.println(mainm + "  " + sidem + " " + drinkm+ " " + "을 주문 하셨습니다. <br>");
		out.println("총 결제금액은 " +(bprice + sprice + dprice) + "원 입니다.");
		
		
		out.println("</body>");
		out.println("</html>");
	}	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
