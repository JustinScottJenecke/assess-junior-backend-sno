package sno.assess.backendjr.service.userService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sno.assess.backendjr.entity.User;
import sno.assess.backendjr.repository.IUserRepository;

/**
 * Author: Justin Scott Jenecke
 * UserService class which adds methods and functionality to business layer
 * Date: 14/10/2021
 * */

@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @Override
    public User create(User object) {
        return this.userRepository.save(object);
    }

    @Override
    public User read(String s) {
        return this.userRepository.findById(s).orElseGet(null);
    }

    @Override
    public User update(User object) {
        return this.userRepository.save(object);
    }

    @Override
    public Boolean delete(String s) {

        this.userRepository.deleteById(s);

        if (this.userRepository.existsById(s))
            return false;
        else
            return true;
    }
}
