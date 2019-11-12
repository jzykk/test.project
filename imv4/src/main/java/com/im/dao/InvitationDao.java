package com.im.dao;

import java.util.List;

import com.im.pojo.Invitation;

/**
 * @author JinZiyang
 * @category 帖子的数据访问接口
 */
public interface InvitationDao {
	/**
	 * 查询所有帖子
	 * 
	 * @return
	 */
	public List<Invitation> find();

	/**
	 * 查询一篇帖子
	 * 
	 * @param id
	 * @return
	 */
	public Invitation findById(int id);

	/**
	 * 增加一篇帖子
	 * 
	 * @param invitation
	 * @return
	 */
	public int insert(Invitation invitation);

	/**
	 * 删除帖子
	 * 
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);

	/**
	 * 修改帖子
	 * 
	 * @param invitation
	 * @return
	 */
	public int update(Invitation invitation);
}
