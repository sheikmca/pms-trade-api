package org.pms.trade.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "PositionServices")
@RestController
@RequestMapping("/PositionServices")
public interface PositionServices {

    @PostMapping(path = "/savePosition")
    @Operation(summary = "savePosition", description = "")
    public Boolean savePosition(
            @RequestHeader("transactionRef") String transactionRef, @RequestHeader("instrumentId") String instrumentId, @RequestHeader("tradeType") String tradeType, @RequestHeader("unit") Integer unit);
}