package provider.web.one.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import provider.service.local.server.IndexControllerService;
import remote.api.dubbo.TestRemoteAPI;

@Controller
public class IndexController {
	
	private Logger log = Logger.getLogger(IndexController.class);
	
	@Autowired
	private TestRemoteAPI testRemoteAPI;
	
	@Autowired
	private IndexControllerService indexControllerService;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(HttpServletRequest request) {
		log.info("welcome come to !");
		indexControllerService.index();
		testRemoteAPI.postMsg("msg");
		return "/index/first";
	}
}
