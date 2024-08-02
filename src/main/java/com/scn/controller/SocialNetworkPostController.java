package com.scn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.scn.entity.SocialNetworkPost;
import com.scn.service.SocialNetworkPostService;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class SocialNetworkPostController {

    @Autowired
    private SocialNetworkPostService service;

    @GetMapping("/top10/{category}")
    public List<SocialNetworkPost> getTop10PostsByCategory(@PathVariable String category) {
        return service.getTop10PostsByCategory(category);
    }

    @GetMapping("/author/{author}")
    public List<SocialNetworkPost> getPostsByAuthor(@PathVariable String author) {
        return service.getPostsByAuthor(author);
    }
}
