package com.example.server.rs;

import com.example.manager.IUserManager;
import com.example.model.User;
import com.example.server.path.PathConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.server.ServerNotActiveException;

/**
 * Created by levont on 25/10/2016.
 */
@RequestMapping(value = PathConstants.SERVICE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class UserService extends BaseService {

    @Autowired
    private IUserManager userManager;


    @RequestMapping(value = PathConstants.TEST, method = RequestMethod.POST)
    public void test(@RequestParam("name") String name,
                     @RequestParam("country") String country) {
        try {
            User user = new User();
            user.setName(name);
            user.setCountry(country);
            userManager.addUser(user);
        } catch (ServerNotActiveException e) {
            e.printStackTrace();
        }
    }

}
