package com.medical.hospital.controller;

import com.medical.hospital.dto.Patient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/reception")
public class PatientController {


//    @RequestMapping("/patients")
//    private Mono<Patient> getPatient() {
//        return new Patient("test", 36.6);
//    }
}
