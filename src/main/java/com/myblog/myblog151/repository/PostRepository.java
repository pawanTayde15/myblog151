package com.myblog.myblog151.repository;

import com.myblog.myblog151.controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
