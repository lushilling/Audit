package com.qa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.persistance.entity.Search;
import com.qa.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private SearchService service;
	
	@Autowired
	public SearchController(SearchService service) {
		this.service = service;
	}
	
	@GetMapping("/all")
	public Collection<Search> returnAll(){
		return service.returnAll();
	}
	
}
