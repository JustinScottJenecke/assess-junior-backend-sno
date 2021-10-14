package sno.assess.backendjr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sno.assess.backendjr.entity.Comment;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.service.commentService.CommentService;
import sno.assess.backendjr.service.postService.PostService;

@RestController
@RequestMapping("backendjr.assess.sno/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/")
    public String commentIndex() {
        return "/create - /read/{id} - /update - /delete/{id}";
    }

    @PostMapping("/create")
    public Comment create(@RequestBody Comment comment) {
        Comment newComment = new Comment.Builder().copy(comment).build();

        return this.commentService.create(newComment);
    }

    @GetMapping("/read/{id}")
    public Comment read(@PathVariable String id) {
        return this.commentService.read(id);
    }

    @PutMapping("/update")
    public Comment update(@RequestBody Comment comment) {
        Comment newComment = new Comment.Builder().copy(comment).build();

        return this.commentService.update(newComment);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return this.commentService.delete(id);
    }

}
