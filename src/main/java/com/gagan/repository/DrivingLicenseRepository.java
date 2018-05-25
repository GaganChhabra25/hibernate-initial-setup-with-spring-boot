package com.gagan.repository;


import com.gagan.entities.DrivingLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense, Long> {
}
