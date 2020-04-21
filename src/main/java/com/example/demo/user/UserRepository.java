package com.example.demo.user;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.user.UserEntity;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

}