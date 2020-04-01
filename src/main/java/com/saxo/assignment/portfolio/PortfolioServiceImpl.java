package com.saxo.assignment.portfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PortfolioServiceImpl implements PortfolioService {
    
	private final Logger LOG = LoggerFactory.getLogger("ClientServiceImpl");
	 
	@Override
	public Portfolio addPortfolio(Portfolio portfolio) {
		LOG.info("Client portfolio added");
		return portfolio;
	}

	@Override
	public boolean updatePortfolio(Portfolio portfolio) {
		LOG.info("Client portfolio updated");
		return false;	
		
	}

	@Override
	public boolean deletePortfolio(int id) {
		LOG.info("Client portfolio deleted");
		return false;			
	}
	
}
