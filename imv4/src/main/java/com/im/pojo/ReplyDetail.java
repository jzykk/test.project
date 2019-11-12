package com.im.pojo;

import java.sql.Date;

/**
 * @author JinZiyang
 * @category 回复实体类
 */
public class ReplyDetail {
	/**
	 * 回复id
	 */
	private int id;
	/**
	 * 帖子id
	 */
	private int invid;
	/**
	 * 回复内容
	 */
	private String content;
	/**
	 * 回复人
	 */
	private String author;
	/**
	 * 回复日期
	 */
	private Date createdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInvid() {
		return invid;
	}

	public void setInvid(int invid) {
		this.invid = invid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public ReplyDetail() {
		super();
	}

	public ReplyDetail(int id, int invid, String content, String author, Date createdate) {
		super();
		this.id = id;
		this.invid = invid;
		this.content = content;
		this.author = author;
		this.createdate = createdate;
	}

}
