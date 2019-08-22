package provider.service.local.dao;

import java.util.List;

/**
 * 通用查询
 * @author xjl
 */
public interface BaseDao {
	
	/**
	 * 分页查询所有信息
	 * @param <T>
	 * @param tableInf
	 * @return
	 */
	public <T> List<T> queryPageAll(T t);
	
	/**
	 * 查询总数
	 * @param t
	 * @return
	 */
	public <T> int queryCount(T t);
	
	/**
	 * 查询所有表信息
	 * 2018-12-13 17:38:07
	 * @return
	 */
	public <T> List<T> queryAll(T t);
}
