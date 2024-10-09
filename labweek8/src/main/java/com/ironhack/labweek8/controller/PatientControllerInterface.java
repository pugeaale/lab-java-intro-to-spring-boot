package com.ironhack.labweek8.controller;

import com.ironhack.labweek8.model.Patient;

import java.util.List;

public interface PatientControllerInterface {
  List<Patient> getPatients();
  Patient getPatientById(int id);
}