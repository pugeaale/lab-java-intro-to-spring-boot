package com.ironhack.labweek8.controller;

import com.ironhack.labweek8.model.Patient;
import com.ironhack.labweek8.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/patients")
@RequiredArgsConstructor
public class PatientControllerImpl implements PatientControllerInterface {

    private final PatientService patientService;

    @Override
    @GetMapping("all")
    public List<Patient> getPatients() {
        return patientService.getAllPatients();
    }

    @Override
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable(name = "id") int id) {
        return patientService.getPatientById(id);
    }


}
