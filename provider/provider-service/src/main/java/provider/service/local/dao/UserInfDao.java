package provider.service.local.dao;

import java.util.List;

import org.base.common.entities.UserInf;


public interface UserInfDao {
	/**
	 * µÇÂ¼
	 * @param userInf
	 * @return
	 */
	public List<UserInf> checkUserInf(UserInf userInf);

	/**
	 * ×¢²á
	 * @param userInf
	 */
	public void register(UserInf userInf);
}
