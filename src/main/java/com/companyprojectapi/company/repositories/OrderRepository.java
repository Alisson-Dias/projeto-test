package com.companyprojectapi.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.companyprojectapi.company.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
