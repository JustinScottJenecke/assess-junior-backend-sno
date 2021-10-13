package sno.assess.backendjr.service.commentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.repository.ICommentRepository;

/**
 * Author: Justin Scott Jenecke
 * CommentService class which adds methods and functionality to business layer
 * Date: 14/10/2021
 * */

@Service
public class CommentService implements ICommentService{

    @Autowired
    ICommentRepository commentRepository;

    @Override
    public Comment create(Comment object) {
        return this.commentRepository.save(object);
    }

    @Override
    public Comment read(String s) {
        return this.commentRepository.findById(s).orElseGet(null);
    }

    @Override
    public Comment update(Comment object) {
        return this.commentRepository.save(object);
    }

    @Override
    public Boolean delete(String s) {

        this.commentRepository.deleteById(s);

        if (this.commentRepository.existsById(s))
            return false;
        else
            return true;
    }
}
