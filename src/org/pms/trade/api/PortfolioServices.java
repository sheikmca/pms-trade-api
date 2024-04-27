package org.pms.trade.api;


import org.pms.trade.entity.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;

public interface PortfolioServices {


    // define your DTO to return to front end
    void getPortfolio();

}
