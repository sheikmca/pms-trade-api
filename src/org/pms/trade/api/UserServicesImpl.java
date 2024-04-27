package org.pms.trade.api;

import org.pms.trade.entity.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServicesImpl")
public class UserServicesImpl implements UserServices {

    @Autowired
    UsersService usersService;

    @Override
    public Boolean verifyUser(String email, String password) {
        Boolean ret = false;

        var user = usersService.findByEmail(email);


        if (user != null && user.getPassword().equals(password)) {
            ret = true;
        }

        return ret;
    }
}
