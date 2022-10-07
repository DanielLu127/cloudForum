package com.cloud.cloudForum.service.impl;

import com.cloud.cloudForum.dao.PostDao;
import com.cloud.cloudForum.domain.Post;
import com.cloud.cloudForum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    @Override
    public List<Post> listAllPosts() {
        return postDao.listAllPosts();
    }

    @Override
    public List<Post> listPostsByUseId(int userId) {
        return postDao.listPostsByUserId(userId);
    }

    @Override
    public int makePost(Post post) {
        return postDao.makePost(post);
    }
}
