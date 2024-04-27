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
@Table(name = "position")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PositionEntity {
    @Id
    private String id;
    private String transaction_ref;
    private String instrument_Id;
    private String trade_type;
    private Integer unit;

}
