package com.FinalCodeGravityProject.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import mvc.dataAccessLayer.User;
import mvc.service.BusinessSignin;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Uicontroller {
	
	@Autowired
	BusinessSignin bs;

	@GetMapping("/Employee")
    public List<User> getEmployee() {
        return bs.getUser();
    }
	
	@GetMapping("/getEmployeeById/{id}")
    public User getEmployeeById(@PathVariable Long Id) {
        return bs.getUserById(Id);
    }
	
	@PostMapping("/addEmployee")
    public User addEmployee(@RequestBody User employee) {
        return bs.addUser(employee);
    }

    @DeleteMapping("/deleteEmployee/{Id}")
    public void deleteEmployee(@PathVariable Long Id) {
        bs.deleteUser(Id);
    }

    @PutMapping("/updateEmployee/{Id}")
    public User updateEmployee(@PathVariable Long Id, @RequestBody User correctedEmployee) {
        return bs.updateUser(Id, correctedEmployee);
    }

}