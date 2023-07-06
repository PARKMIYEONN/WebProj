package aisw.web.biz.board;

public class BoardVO {

	@Override
	public String toString() {
		return "BoardVO [postNo=" + postNo + ", userId=" + userId + ", content=" + content + ", postRegDate="
				+ postRegDate + ", postTitle=" + postTitle + ", postPermission=" + postPermission + ", postHit="
				+ postHit + "]";
	}
	private int postNo;
	private String userId;
	private String content;
	private String postRegDate;
	private String postTitle;
	private int postPermission;
	private int postHit;
	
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPostRegDate() {
		return postRegDate;
	}
	public void setPostRegDate(String postRegDate) {
		this.postRegDate = postRegDate;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public int getPostPermission() {
		return postPermission;
	}
	public void setPostPermission(int postPermission) {
		this.postPermission = postPermission;
	}
	public int getPostHit() {
		return postHit;
	}
	public void setPostHit(int postHit) {
		this.postHit = postHit;
	}
	public BoardVO(int postNo, String userId, String content, String postRegDate, String postTitle, int postPermission,
			int postHit) {
		super();
		this.postNo = postNo;
		this.userId = userId;
		this.content = content;
		this.postRegDate = postRegDate;
		this.postTitle = postTitle;
		this.postPermission = postPermission;
		this.postHit = postHit;
	}
	public BoardVO() {
		super();
	}
	
	
	
	
	
	
}
