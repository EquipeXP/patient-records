-- Insert all the new fields of the in the table Patients
ALTER TABLE 'patient' ADD 'phone' VARCHAR( 255 ) after 'name'  
ALTER TABLE 'patient' ADD 'genderAdm' VARCHAR( 255 ) after 'phone'  
ALTER TABLE 'patient' ADD 'birthDate' VARCHAR( 255 ) after 'genderAdm'  
ALTER TABLE 'patient' ADD 'address' VARCHAR( 255 ) after 'birthDate'  
ALTER TABLE 'patient' ADD 'maritalStatus' VARCHAR( 255 ) after 'address'  
ALTER TABLE 'patient' ADD 'breed' VARCHAR( 255 ) after 'maritalStatus'  
ALTER TABLE 'patient' ADD 'ethnicGro' VARCHAR( 255 ) after 'breed'