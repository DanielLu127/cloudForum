package com.cloud.cloudForum.dao;

import com.cloud.cloudForum.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao {

    /**
     * get all posts
     * @return
     */
    List<Post> listAllPosts();

    /**
     * get posts by a user id
     * @param userId
     * @return
     */
    List<Post> listPostsByUserId(int userId);

    /**
     * make a post
     * @param post
     * @return
     */
    int makePost(Post post);

}
