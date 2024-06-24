package com.sp.app.blog;

import java.util.List;

public interface BlogService {
	public List<Blog> listBlog();
	public Blog findById(long blogIdx);
}
