package com.medical.hospital.controller;

import com.medical.hospital.dto.AverageReport;
import com.medical.hospital.dto.Patient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.math.MathContext;
import java.net.URI;

@RestController
@RequestMapping("/calculate")
public class CalculateController {

    @RequestMapping("/average")
    private Mono<AverageReport> calculateAverageTemperature() {
        BigDecimal accum = BigDecimal.ZERO;

        return Mono.create(cb -> WebClient.create()
                .get()
                .uri(URI.create("http://localhost:8080/reception/patients"))
                .retrieve()
                .bodyToFlux(Patient.class)
                .map(patient -> accum.add(BigDecimal.valueOf(patient.getTemperature())))
                .count()
                .map(aLong -> Mono.just(
                        new AverageReport(aLong, accum.divide(BigDecimal.valueOf(aLong), MathContext.DECIMAL32))
                )));
    }
}
