package com.unicamp.repository;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import com.unicamp.entity.Patient;

public class PatientRepository implements IPatientRepository {

	@Inject
	private javax.inject.Provider<Session> _session;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatients() {
		
		Session session = _session.get();
		session.beginTransaction();
		
		List<Patient> patients = session.createCriteria(Patient.class).list();
		
		session.close();
		
		return patients;
	}

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
