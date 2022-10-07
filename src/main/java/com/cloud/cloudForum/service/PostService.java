package com.cloud.cloudForum.service;

import com.cloud.cloudForum.domain.Post;

import java.util.List;

public interface PostService {
    List<Post> listAllPosts();

    List<Post> listPostsByUseId(int userId);

    int makePost(Post post);


}
