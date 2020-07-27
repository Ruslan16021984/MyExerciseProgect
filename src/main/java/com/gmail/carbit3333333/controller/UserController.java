package com.gmail.carbit3333333.controller;

import com.gmail.carbit3333333.model.Basslocation;
import com.gmail.carbit3333333.model.CustomUser;
import com.gmail.carbit3333333.model.UserRole;
import com.gmail.carbit3333333.services.LocationService;
import com.gmail.carbit3333333.services.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private UserService userService;


    @Modifying
    @RequestMapping(value = "/updateLocation", method = RequestMethod.POST)
    public Basslocation saveLocation(@RequestBody Basslocation location) {
        return locationService.saveLocation(location);
    }
//------------------------------
    @RequestMapping(value = "/getBasById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Basslocation> getBasById(@PathVariable("id") int remindID) {
        return locationService.getBasById(remindID);
    }
//------------------------------
    @RequestMapping(value = "/findByPassword/{password}", method = RequestMethod.GET)
    @ResponseBody
    public boolean findByPass(@PathVariable("password") String password) {
        List<CustomUser> customUsers = new ArrayList<>();
        boolean checkPassword;
        customUsers = locationService.findAll();
        for (CustomUser customUser : customUsers) {
            System.out.println(customUser.getPassword());
            checkPassword = checkPass(password, customUser.getPassword());
            if (checkPassword) {
                return true;
            }
        }
        return false;
    }
    //------------------------------
    @RequestMapping(value = "/putOnPassword", method = RequestMethod.POST)
    public CustomUser saveUser(@RequestBody CustomUser customUser) {
        System.out.println("saveUser go on");
        String passHash = hashPassword(customUser.getPassword());
        CustomUser customUser1 = new CustomUser();
        customUser1.setUsername(customUser.getUsername());
        customUser1.setPassword(passHash);
        customUser1.setUserRole(UserRole.USER);
        return locationService.saveUser(customUser1);
    }
//--------------------------------
    private boolean checkPass(String plainPassword, String password1) {
        if (BCrypt.checkpw(plainPassword, password1)) {
            System.out.println("The password matches.");
            return true;
        } else {
            System.out.println("The password does not match.");
            return false;
        }
    }
    @RequestMapping(value = "/questions/addUser", method = RequestMethod.POST)
    public void addUser(CustomUser user) {
        userService.addUser(user);
    }

//-------------------------------
    private String hashPassword(String plainTextPassword) {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }
}
