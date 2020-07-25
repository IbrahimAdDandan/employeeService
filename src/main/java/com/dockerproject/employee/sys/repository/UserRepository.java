package com.dockerproject.employee.sys.repository;


import com.dockerproject.employee.sys.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUsername(String username);

    public User findByEmail(String email);
}