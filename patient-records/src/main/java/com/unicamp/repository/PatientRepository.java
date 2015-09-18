package com.unicamp.repository;

import java.util.List;

import org.hibernate.Session;

import com.unicamp.entity.Patient;
import com.unicamp.util.HibernateUtil;

public class PatientRepository implements IPatientRepository {

	@Override
	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatients() {
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		List<Patient> patients = session.createCriteria(Patient.class).list();
		
		session.close();
		
		return patients;
	}
	
}
