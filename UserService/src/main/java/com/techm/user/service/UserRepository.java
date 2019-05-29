package com.techm.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techm.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
