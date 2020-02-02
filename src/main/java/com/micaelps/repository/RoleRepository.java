package com.micaelps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.micaelps.entities.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
