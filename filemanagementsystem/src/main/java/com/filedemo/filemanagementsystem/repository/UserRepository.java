package com.filedemo.filemanagementsystem.repository;
import com.filedemo.filemanagementsystem.model.UserDao;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}