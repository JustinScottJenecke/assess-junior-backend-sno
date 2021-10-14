package sno.assess.backendjr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sno.assess.backendjr.entity.User;
import sno.assess.backendjr.service.userService.UserService;

@RestController
@RequestMapping("backendjr.assess.sno/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String userIndex() {
        return "/create - /read/{id} - /update - /delete/{id}";
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        User newUser = new User.Builder().copy(user).build();

        return this.userService.create(newUser);
    }

    @GetMapping("/read/{id}")
    public User read(@PathVariable String id) {
        return this.userService.read(id);
    }

    @PutMapping("/update")
    public User update(@RequestBody User user) {
        User newUser = new User.Builder().copy(user).build();

        return this.userService.update(newUser);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return this.userService.delete(id);
    }
}
