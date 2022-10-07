package com.cloud.cloudForum.controller;

import com.cloud.cloudForum.domain.Post;
import com.cloud.cloudForum.service.PostService;
import com.cloud.cloudForum.service.UserService;
import com.cloud.cloudForum.utility.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pub/post")
public class PostController {
    @Autowired
    public UserService userService;

    @Autowired
    public PostService postService;

    /**
     * list all posts
     * localhost:8080/pub/product/list_all_posts
     * @return
     */
    @GetMapping("list_all_post")
    public Response listAllProduct() {
        List<Post> productList = postService.listAllPosts();
        return Response.buildSuccess(productList);
    }
}
