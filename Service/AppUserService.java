package com.doctor.Service;

import com.doctor.DTO.AppUserRegistrationDTO;
import com.doctor.entity.AppUserRegistration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface AppUserService {

    public ResponseEntity<AppUserRegistration> setRegistration(@RequestBody AppUserRegistrationDTO dto);
}
