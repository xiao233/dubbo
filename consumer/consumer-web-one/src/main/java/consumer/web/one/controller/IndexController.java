package consumer.web.one.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import remote.api.dubbo.TestRemoteAPI;


@Controller
public class IndexController {
	
	private Logger log = Logger.getLogger(IndexController.class);
	
	@Autowired
	private TestRemoteAPI testRemoteAPI;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String first(HttpServletRequest request) {
		log.info("welcome come to !");
		return "/index/first";
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(HttpServletRequest request) {
		log.info("welcome come to !");
		testRemoteAPI.postMsg(request.getServerName()+"∑¢ÀÕ«Î«Û!");
		log.info(testRemoteAPI.getMsg(request.getServerName()));
		return "/index/first";
	}
}
