package org.pms.trade.api;

import org.pms.trade.entity.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PortfolioServicesImpl")
public class PortfolioServicesImpl implements PortfolioServices{

    @Autowired
    PortfolioService portfolioService;


    @Override
    public void getPortfolio() {

    }
}
