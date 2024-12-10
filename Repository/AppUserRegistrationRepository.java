package com.doctor.Repository;

import com.doctor.entity.AppUserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRegistrationRepository extends JpaRepository<AppUserRegistration, Long> {
}