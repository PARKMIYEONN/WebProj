package aisw.web.biz.board;

import java.util.Date;

public class EziBoardVO {
	
	@Override
	public String toString() {
		return "EziBoardVO [nc_no=" + nc_no + ", nc_title=" + nc_title + ", nc_id=" + nc_id + ", nc_content="
				+ nc_content + ", nc_date=" + nc_date + ", nc_views=" + nc_views + "]";
	}
	private String nc_no;
	private String nc_title;
	private String nc_id;
	private String nc_content;
	private Date nc_date;
	private String nc_views;
	
	public String getNc_no() {
		return nc_no;
	}
	public void setNc_no(String nc_no) {
		this.nc_no = nc_no;
	}
	public String getNc_title() {
		return nc_title;
	}
	public void setNc_title(String nc_title) {
		this.nc_title = nc_title;
	}
	public String getNc_id() {
		return nc_id;
	}
	public void setNc_id(String nc_id) {
		this.nc_id = nc_id;
	}
	public String getNc_content() {
		return nc_content;
	}
	public void setNc_content(String nc_content) {
		this.nc_content = nc_content;
	}
	public Date getNc_date() {
		return nc_date;
	}
	public void setNc_date(Date nc_date) {
		this.nc_date = nc_date;
	}
	public String getNc_views() {
		return nc_views;
	}
	public void setNc_views(String nc_views) {
		this.nc_views = nc_views;
	}
	public EziBoardVO(String nc_no, String nc_title, String nc_id, String nc_content, Date nc_date, String nc_views) {
		super();
		this.nc_no = nc_no;
		this.nc_title = nc_title;
		this.nc_id = nc_id;
		this.nc_content = nc_content;
		this.nc_date = nc_date;
		this.nc_views = nc_views;
	}
	public EziBoardVO() {
		super();
	}
	
	

	
	
	
	

}
