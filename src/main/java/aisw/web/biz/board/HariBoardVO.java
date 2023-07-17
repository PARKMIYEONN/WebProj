package aisw.web.biz.board;

public class HariBoardVO {
	
	
	private String p_category;
	private String p_no;
	private String p_writer;
	private String p_title;
	private String p_contents;
	private String p_reg_Date;
	private String p_hit;
	
	
	public String getP_category() {
		return p_category;
	}
	public void setP_category(String p_category) {
		this.p_category = p_category;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getP_writer() {
		return p_writer;
	}
	public void setP_writer(String p_writer) {
		this.p_writer = p_writer;
	}
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public String getP_contents() {
		return p_contents;
	}
	public void setP_contents(String p_contents) {
		this.p_contents = p_contents;
	}
	public String getP_reg_Date() {
		return p_reg_Date;
	}
	public void setP_reg_Date(String p_reg_Date) {
		this.p_reg_Date = p_reg_Date;
	}
	public String getP_hit() {
		return p_hit;
	}
	public void setP_hit(String p_hit) {
		this.p_hit = p_hit;
	}
	public HariBoardVO(String p_category, String p_no, String p_writer, String p_title, String p_contents,
			String p_reg_Date, String p_hit) {
		super();
		this.p_category = p_category;
		this.p_no = p_no;
		this.p_writer = p_writer;
		this.p_title = p_title;
		this.p_contents = p_contents;
		this.p_reg_Date = p_reg_Date;
		this.p_hit = p_hit;
	}
	public HariBoardVO() {
		super();
	}
	
	@Override
	public String toString() {
		return "HariBoardVO [p_category=" + p_category + ", p_no=" + p_no + ", p_writer=" + p_writer + ", p_title="
				+ p_title + ", p_contents=" + p_contents + ", p_reg_Date=" + p_reg_Date + ", p_hit=" + p_hit + "]";
	}
	
	
	
	
	
	
	
	

}
