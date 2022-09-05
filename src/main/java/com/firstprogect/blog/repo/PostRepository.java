package com.firstprogect.blog.repo;

import com.firstprogect.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
