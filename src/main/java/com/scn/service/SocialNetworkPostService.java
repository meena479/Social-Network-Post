package com.scn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scn.entity.SocialNetworkPost;
import com.scn.repository.SocialNetworkPostRepository;

import java.util.List;

@Service
public class SocialNetworkPostService {

    @Autowired
    private SocialNetworkPostRepository repository;

    public List<SocialNetworkPost> getTop10PostsByCategory(String category) {
        return repository.findTop10ByCategoryOrderByViewCountDesc(category).stream().limit(10).toList();
    }

    public List<SocialNetworkPost> getPostsByAuthor(String author) {
        return repository.findByAuthor(author);
    }
}
