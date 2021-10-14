package sno.assess.backendjr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sno.assess.backendjr.entity.Post;
import sno.assess.backendjr.service.postService.PostService;

@RestController
@RequestMapping("/backendjr.assess.sno/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/")
    public String postIndex() {
        return "/create - /read/{id} - /update - /delete/{id}";
    }

    @PostMapping("/create")
    public Post create(@RequestBody Post post) {
        Post newPost = new Post.Builder().copy(post).build();

        return this.postService.create(newPost);
    }

    @GetMapping("/read/{id}")
    public Post read(@PathVariable String id) {
        return this.postService.read(id);
    }

    @PutMapping("/update")
    public Post update(@RequestBody Post post) {
        Post newPost = new Post.Builder().copy(post).build();

        return this.postService.update(newPost);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return this.postService.delete(id);
    }

}
