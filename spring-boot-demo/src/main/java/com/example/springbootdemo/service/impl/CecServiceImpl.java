package com.example.springbootdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.model.Cec;
import com.example.springbootdemo.repository.CecRepository;
import com.example.springbootdemo.service.CecService;

@Service
@Transactional
public class CecServiceImpl implements  CecService{

	@Autowired
    private CecRepository repository;
	
	@Override
	public List<Cec> findAll() {
		
		 List<Cec> cities = (List<Cec>)repository.findAll();

	        return cities;
	        
	}

}
