package com.saxo.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.saxo.assignment.portfolio.Portfolio;
import com.saxo.assignment.portfolio.PortfolioService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private PortfolioService portfolioService;

	@Autowired
	public Application(PortfolioService portfolioService) {
		this.portfolioService = portfolioService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args).close();;
	}

	@Override
	public void run(String... strings) throws Exception {
		Portfolio portfolio = Portfolio.builder().clientId(1).clientFirstName("Saurabh").clientLastName("Rawal").build();
		portfolioService.addPortfolio(portfolio);
		portfolioService.updatePortfolio(portfolio);
	}
}
