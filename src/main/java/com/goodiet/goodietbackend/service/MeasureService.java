package com.goodiet.goodietbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodiet.goodietbackend.repository.MeasureRepository;

@Service
public class MeasureService {
	
	@Autowired
	private MeasureRepository measureRepository;

}
