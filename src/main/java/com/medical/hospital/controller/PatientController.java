package com.medical.hospital.controller;

import com.medical.hospital.dto.Patient;
import com.medical.hospital.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/reception")
public class PatientController {

    @Autowired
    private PatientRepo patientRepo;

    @RequestMapping("/patients")
    private Flux<Patient> getPatients() {
        return patientRepo.getAllPatients();
    }
}
