package com.sp.app.blog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Override
	public List<Blog> listBlog() {
		List<Blog> list = new ArrayList<>();
		
		list.add(new Blog(1001, "소금", "야옹"));
		list.add(new Blog(1002, "후추", "앍옹"));
		list.add(new Blog(1003, "로제", "갸갹"));
		list.add(new Blog(1004, "피츠", "왕왕"));
		list.add(new Blog(1005, "복댕", "멍멍"));
		
		return list;
	}

	@Override
	public Blog findById(long blogIdx) {
		List<Blog> list = listBlog();
		
		for(Blog b : list) {
			if(blogIdx == b.getBlogIdx()) {
				return b;
			}
		}
		return null;
	}

}
