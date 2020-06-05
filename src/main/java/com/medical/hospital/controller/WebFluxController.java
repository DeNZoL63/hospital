package com.medical.hospital.controller;

import com.medical.hospital.dto.Patient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reception")
public class WebFluxController {


    @RequestMapping("/patient")
    private Patient getPatient() {
        return new Patient("test", 36.6);
    }
}
