package provider.service.remote.test;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import remote.api.dubbo.TestRemoteAPI;

@Service
public class TestRemoteAPIImpl implements TestRemoteAPI{
	
	private Logger log = Logger.getLogger(TestRemoteAPIImpl.class);

	public void postMsg(String msg) {
		// TODO Auto-generated method stub
		log.info(msg);
	}

	public String getMsg(String msg) {
		// TODO Auto-generated method stub
		log.info(msg);
		return "Had received From "+msg+"Message!";
	}

}
