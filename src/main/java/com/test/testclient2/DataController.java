package com.test.testclient2;

import com.test.testclient2.Repository.UserDataRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller to interact with DAO Repository for User Data
 *
 * Also Used by Client1 using @FeignClient
 */

@RestController
public class DataController {
   @Autowired
   private UserDataRepository userRepo; //DAO Repository

    @Value("${projectName}") //gets the cloud property
   private String project;
    //TO get all data stored in DB
    @RequestMapping("/all")
     public List<DataUserModel> getAll()
     {

         return (List<DataUserModel>) userRepo.findAll();
     }

    //Gets data using its Name
    @RequestMapping(value="/byName/{name}",method = RequestMethod.GET)
    public DataUserModel getByName(@PathVariable String name)
    {
        String paramName1=name;
        return userRepo.findByUsername(paramName1);
    }

    //TO Save Data in DB
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<DataUserModel> loadDetails(@RequestBody DataUserModel user)
    {

        user.setProjectName(project);
        userRepo.save(user);
        return (List<DataUserModel>) userRepo.findAll();
    }

}

