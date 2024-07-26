package com.crud.fullstackBackend.repository;

import com.crud.fullstackBackend.exception.UserNotFoundException;
import com.crud.fullstackBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ControllerAdvice;



public interface UserRepository extends JpaRepository<User, Long> {

}
