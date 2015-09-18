package com.unicamp.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unicamp.entity.Patient;
import com.unicamp.repository.PatientRepository;

@Path("patient")
public class PatientController {

	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Patient> getPatient() {
		
		PatientRepository repository = new PatientRepository();
        return repository.getAllPatients();
    }
}
