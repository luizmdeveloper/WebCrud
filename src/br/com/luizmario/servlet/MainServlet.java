package br.com.luizmario.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="main", urlPatterns={"/main"})
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String dispacher = null;
		if ("consultar".equals(acao)){
			dispacher = "consulta.jsp";
		} else if ("sair".equals(acao)){
			dispacher = "sair.jsp";
		} else if ("sobre".equals(acao)){
			dispacher = "sobre.jsp";
		}else if ("inicio".equals(acao)){
			dispacher = "index.jsp";
		}else if("sobre".equals(acao)){
			dispacher = "sobre.jsp";
		}
		request.getRequestDispatcher(dispacher).forward(request, response);
	}

}
