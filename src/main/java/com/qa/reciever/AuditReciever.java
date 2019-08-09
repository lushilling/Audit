package com.qa.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.persistance.entity.Search;
import com.qa.persistance.repository.SearchDatabaseRepository;

@Component
public class AuditReciever {

	@Autowired
	private SearchDatabaseRepository searchRepo;

	@Autowired
	public AuditReciever(SearchDatabaseRepository searchRepo) {
		this.searchRepo = searchRepo;
	}

	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(Search search) {
		searchRepo.save(search);
	}
}
