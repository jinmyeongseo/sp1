package com.sp.app.blog;

public class Blog {
	private long blogIdx;
	private String blogName;
	private String userName;
	
	public Blog() {
	}
	
	public Blog(long blogIdx, String blogName, String userName) {
		this.blogIdx = blogIdx;
		this.blogName = blogName;
		this.userName = userName;
	}
	
	public long getBlogIdx() {
		return blogIdx;
	}
	public void setBlogIdx(long blogIdx) {
		this.blogIdx = blogIdx;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
