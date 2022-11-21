package br.mpfn.service;

import br.mpfn.model.Post;
import br.mpfn.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

public class PostServiceImpl {
    @Service
    public class PostServicelmpl implements PostService {

        @Autowired
        PostRepository postRepository;

        @Override
        public List<Post> findAll() {
            return postRepository.findAll();
        }

        @Override
        public Post findById(Long id) {
            Post func = postRepository.findById(id).get();
            return func != null ? func : new Post();
        }

        @Override
        public Post save(Post post) {
            try {
                return postRepository.save(post);
            } catch (Exception e) {
                throw e;
            }
        }

        @Override
        public void deleteById(Long id) {
            try {
                postRepository.deleteById(id);
            } catch (Exception e) {
                throw e;
            }
        }

    }
}
