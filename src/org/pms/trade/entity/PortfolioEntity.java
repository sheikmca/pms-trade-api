package org.pms.trade.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;

@Entity
@Table(name = "portfolio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PortfolioEntity {
    @Id
    private String id;
    private String portfolio_number;
    private String invest_strategy;
    private Double current_performace;
    private BigDecimal portfolio_value;
    private String customer_name;
    private String customer_id;

}
