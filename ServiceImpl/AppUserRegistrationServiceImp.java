package com.doctor.ServiceImpl;


import com.doctor.DTO.AppUserRegistrationDTO;
import com.doctor.Repository.AppUserRegistrationRepository;
import com.doctor.Service.AppUserService;
import com.doctor.entity.AppUserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AppUserRegistrationServiceImp implements AppUserService {


    @Autowired
    private AppUserRegistrationRepository repository;


    @Override
    public ResponseEntity<AppUserRegistration> setRegistration(@RequestBody AppUserRegistrationDTO dto) {
        AppUserRegistration appUserRegistration = new AppUserRegistration();
       appUserRegistration.setId(dto.getId());
        appUserRegistration.setUsername(dto.getUsername());
        appUserRegistration.setPassword(dto.getPassword());
        appUserRegistration.setEmail(dto.getEmail());
        appUserRegistration.setPhoneNumber(dto.getPhoneNumber());
        appUserRegistration.setRole(dto.getRole());

        return new ResponseEntity<>(appUserRegistration, HttpStatus.CREATED);
    }
}
