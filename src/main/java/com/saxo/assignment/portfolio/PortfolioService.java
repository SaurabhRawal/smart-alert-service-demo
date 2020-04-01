package com.saxo.assignment.portfolio;

public interface PortfolioService {
	
	Portfolio addPortfolio(Portfolio portfolio);
	boolean updatePortfolio(Portfolio portfolio);
	boolean deletePortfolio(int id);

}
