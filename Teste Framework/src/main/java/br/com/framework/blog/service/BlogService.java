package br.com.framework.blog.service;

import br.com.framework.blog.model.Post;
import java.util.List;

public interface BlogService {
    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
