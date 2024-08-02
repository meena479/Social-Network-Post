package com.scn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.scn.entity.SocialNetworkPost;

import java.util.List;

@Repository
public interface SocialNetworkPostRepository extends JpaRepository<SocialNetworkPost, Long> {

    List<SocialNetworkPost> findByAuthor(String author);

    @Query("SELECT p FROM SocialNetworkPost p WHERE p.postCategory = ?1 ORDER BY p.viewCount DESC")
    List<SocialNetworkPost> findTop10ByCategoryOrderByViewCountDesc(String postCategory);
}
