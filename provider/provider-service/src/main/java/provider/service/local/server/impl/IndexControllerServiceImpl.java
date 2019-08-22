package provider.service.local.server.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.base.common.entities.UserInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import provider.service.local.dao.UserInfDao;
import provider.service.local.server.IndexControllerService;

@Service
public class IndexControllerServiceImpl implements IndexControllerService{

	private Logger log = Logger.getLogger(IndexControllerServiceImpl.class);
	
	@Autowired
	private UserInfDao userInfDao;
	
	public void index() {
		// TODO Auto-generated method stub
		log.info("service ²ã");
		UserInf userInf = new UserInf();
		userInf.setUserName("admin");
		userInf.setUserPaw("admin");
		List<UserInf> list = userInfDao.checkUserInf(userInf);
		log.info(list);
	}

}
