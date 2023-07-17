package aisw.web.biz.board;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonCreator;

public class JoyBoardVO {
	
	@Override
	public String toString() {
		return "JoyBoardVO [post_cd=" + post_cd + ", u_id=" + u_id + ", post_title=" + post_title + ", post_content="
				+ post_content + ", post_date=" + post_date + "]";
	}
	
	public String getPost_cd() {
		return post_cd;
	}
	public void setPost_cd(String post_cd) {
		this.post_cd = post_cd;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_content() {
		return post_content;
	}
	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	private String post_cd;
	private String u_id;
	private String post_title;
	private String post_content;
	private Date post_date;
	

	public JoyBoardVO() {
		super();
	}
	
	
	
	public JoyBoardVO(String post_cd, String u_id, String post_title, String post_content, Date post_date) {
		super();
		this.post_cd = post_cd;
		this.u_id = u_id;
		this.post_title = post_title;
		this.post_content = post_content;
		this.post_date = post_date;
	}


	
	
	
	
	
	
	

}
