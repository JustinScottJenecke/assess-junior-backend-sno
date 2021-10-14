package sno.assess.backendjr.service.postService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.repository.IPostRepository;

/**
 * Author: Justin Scott Jenecke
 * PostService class which adds methods and functionality to business layer
 * Date: 14/10/2021
 * */

@Service
public class PostService implements IPostService {

    @Autowired
    IPostRepository postRepository;

    @Override
    public Post create(Post object) {
        return this.postRepository.save(object);
    }

    @Override
    public Post read(String s) {
        return this.postRepository.findById(s).orElseGet(null);
    }

    @Override
    public Post update(Post object) {
        return this.postRepository.save(object);
    }

    @Override
    public Boolean delete(String s) {

        this.postRepository.deleteById(s);

        if (this.postRepository.existsById(s))
            return false;
        else
            return true;
    }
}
