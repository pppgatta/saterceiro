package br.mpfn.service;

import br.mpfn.model.Post;
import java.util.List;

public interface PostService {
    public List<Post> findAll();
    public Post save(Post post);
    public Post findById(Long id);
    public void deleteById(Long id);
}
