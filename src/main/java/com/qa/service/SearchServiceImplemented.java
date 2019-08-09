package com.qa.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistance.entity.Search;
import com.qa.persistance.repository.SearchDatabaseRepository;

@Service
public class SearchServiceImplemented implements SearchService {
	
	@Autowired
	private SearchDatabaseRepository searchRepo;
	
	@Autowired
	public SearchServiceImplemented(SearchDatabaseRepository searchRepo) {
		this.searchRepo = searchRepo;
	}


	public Collection<Search> returnAll() {
		return searchRepo.findAll();
	}

}
