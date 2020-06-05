package com.medical.hospital.repo;

import com.medical.hospital.dto.Patient;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashSet;

@Repository
public class PatientRepo {
    HashSet<Patient> patients = new HashSet<>(Arrays.asList(new Patient("Иванов И.И.", 36.6),
            new Patient("Петров П.П.", 39.8),
            new Patient("Козлов А.В.", 39.8),
            new Patient("Сидоров С.Г.", 35.4)));


}
