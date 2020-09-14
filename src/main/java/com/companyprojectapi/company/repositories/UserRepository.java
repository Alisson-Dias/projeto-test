package com.companyprojectapi.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyprojectapi.company.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
