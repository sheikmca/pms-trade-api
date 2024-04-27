package org.pms.trade.api;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.pms.trade.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


// Thang Le

@Tag(name = "UserServices")
@RestController
@RequestMapping("/UserServices")
public interface UserServices {

    @PostMapping(path = "/verifyUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "verifyUser", description = "")
    public Boolean verifyUser(
            @RequestHeader("email") String email, @RequestHeader("password") String password);


}
