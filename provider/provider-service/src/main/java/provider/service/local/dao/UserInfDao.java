package provider.service.local.dao;

import java.util.List;

import org.base.common.entities.UserInf;


public interface UserInfDao {
	/**
	 * ��¼
	 * @param userInf
	 * @return
	 */
	public List<UserInf> checkUserInf(UserInf userInf);

	/**
	 * ע��
	 * @param userInf
	 */
	public void register(UserInf userInf);
}
