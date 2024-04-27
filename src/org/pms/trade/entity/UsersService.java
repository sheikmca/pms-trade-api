package org.pms.trade.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    private final UserRepository repository;

    @Autowired
    public UsersService(UserRepository repository) {
        this.repository = repository;

    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findByEmail(String email) {
        return repository.findByUserEmail(email);
    }


    public void delete(User entity) {
        // clear another cache if any
        repository.delete(entity);
    }

    public User saveAndUpdate(User entity) {
        return repository.save(entity);
    }


}
