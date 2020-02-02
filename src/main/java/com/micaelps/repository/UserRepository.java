package com.micaelps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micaelps.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
