package org.pms.trade.dto;

import lombok.*;
import org.pms.trade.entity.Strategy;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioDto {
    private Long id;
    private String portfolioNumber;
    private Strategy investStrategy;
    private double currentPerformance;
    private String customerId;
    private String customerName;
    private int portfolioValue;
}
