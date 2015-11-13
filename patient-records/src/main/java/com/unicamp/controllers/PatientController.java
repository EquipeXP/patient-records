package com.unicamp.controllers;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.*;
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

	@GET @Path("/{patientId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatientById(@PathParam("patientId") int patientId) {
        return _patientRepository.getPatientById(patientId);
    }

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createPatient(Patient patient) {
		
		patient.validate();
		_patientRepository.addPatient(patient);
	}
}
