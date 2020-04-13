package com.example.springbootdemo.service;

import java.util.List;

import com.example.springbootdemo.model.Cec;

public interface CecService {
	
	public List<Cec> findAll();
	
	public Cec findCecById(Long id);

}
