package com.unicamp.repository;

import java.util.List;

import com.unicamp.entity.Patient;

public interface IPatientRepository {

	List<Patient> getAllPatients();
}
