package com.example.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.model.Cec;

@Repository
public interface CecRepository extends JpaRepository<Cec, Long> {

	
}
