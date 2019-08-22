package provider.web.one.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class TestServlet extends HttpServlet{
	
	private Logger log = Logger.getLogger(TestServlet.class);
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		log.info(config.getInitParameter("filePath"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info("servlet get!");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().append("Served at: ").append(req.getContextPath()).append(", Õ®÷™” œ‰£∫"
		+this.getServletContext().getInitParameter("noticeEmail"));
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info("servlet post!");
		doGet(req, resp);
	}

	

	
}
