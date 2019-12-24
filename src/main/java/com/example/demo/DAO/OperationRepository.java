package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long> {

	
}
