package provider.service.local.dao;

import java.util.List;

/**
 * ͨ�ò�ѯ
 * @author xjl
 */
public interface BaseDao {
	
	/**
	 * ��ҳ��ѯ������Ϣ
	 * @param <T>
	 * @param tableInf
	 * @return
	 */
	public <T> List<T> queryPageAll(T t);
	
	/**
	 * ��ѯ����
	 * @param t
	 * @return
	 */
	public <T> int queryCount(T t);
	
	/**
	 * ��ѯ���б���Ϣ
	 * 2018-12-13 17:38:07
	 * @return
	 */
	public <T> List<T> queryAll(T t);
}
