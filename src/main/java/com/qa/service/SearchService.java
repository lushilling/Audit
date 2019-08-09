package com.qa.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.qa.persistance.entity.Search;

@Service
public interface SearchService {
	
	Collection<Search> returnAll();

}
