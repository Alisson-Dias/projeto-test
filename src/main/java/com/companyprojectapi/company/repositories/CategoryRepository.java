package com.companyprojectapi.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyprojectapi.company.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
