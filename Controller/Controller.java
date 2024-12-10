package com.doctor.Controller;
import com.doctor.DTO.AppUserRegistrationDTO;
import com.doctor.Service.AppUserService;

import com.doctor.entity.AppUserRegistration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller {


    private AppUserService appUserService;
    public Controller(AppUserService appUserService) {
        this.appUserService = appUserService;
    }
    @PostMapping("/set")
    public ResponseEntity<String> SetData(@RequestBody AppUserRegistrationDTO dto){
        appUserService.setRegistration(dto);
        return new ResponseEntity<>("Data is created",HttpStatus.OK);
    }
}