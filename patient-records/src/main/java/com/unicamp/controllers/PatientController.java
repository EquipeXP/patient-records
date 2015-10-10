package com.unicamp.controllers;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unicamp.entity.Patient;
import com.unicamp.repository.IPatientRepository;

@Path("patient")
public class PatientController {

	@Inject IPatientRepository _patientRepository;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Patient> getPatient() {
		return _patientRepository.getAllPatients();
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createPatient(Patient patient) {
		_patientRepository.addPatient(patient);
	}
}
