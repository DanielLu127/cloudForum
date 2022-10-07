package com.cloud.cloudForum.controller;

import com.cloud.cloudForum.domain.Post;
import com.cloud.cloudForum.domain.User;
import com.cloud.cloudForum.service.PostService;
import com.cloud.cloudForum.service.UserService;
import com.cloud.cloudForum.utility.MD5Utils;
import com.cloud.cloudForum.utility.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pri/user")
public class UserController {

    @Autowired
    public UserService userService;

    @Autowired
    public PostService postService;

    /**
     * login user
     * localhost:8080/pri/user/signup
     * @param user
     * @return
     */
    @PostMapping("signup")
    public Response signup(@RequestBody User user) {

        // adapt MD5 algorithm to user password
        if (userService.findUserByEmail(user.getEmail()) != null) {
            return Response.buildError("user exists");
        }
        user.setPassword(MD5Utils.MD5(user.getPassword()));
        int row = userService.signup(user);

        return row > 0 ? Response.buildSuccess(user.getName()): Response.buildError("cannot signup");
    }

    /**
     * login user
     * localhost:8080/pri/user/login
     * @param user
     * @return
     */
    @PostMapping("login")
    public Response login(@RequestBody User user, HttpServletRequest request, HttpServletResponse response) {
        String crypPassword = MD5Utils.MD5(user.getPassword());
        User loggedinUser = userService.login(user.getEmail(),  crypPassword);
        if (loggedinUser != null) {
            return Response.buildSuccess(loggedinUser);
        }
        return Response.buildError("Password or username invalid");
    }


    /**
     * get all posts of a given user
     * localhost:8080/pri/user/list_posts_by_user_id
     * @return
     */
    @GetMapping("list_posts_by_user_id")
    public Response listProductByUserId(@RequestBody User user) {
        List<Post> postsList = postService.listPostsByUseId(user.getId());
        return Response.buildSuccess(postsList);
    }


    @PostMapping("make_post")
    public Response sellProduct(@RequestBody Post post) {
        post.setPostDate(new Date());
        int row = postService.makePost(post);
        return Response.buildSuccess(row);
    }
}
