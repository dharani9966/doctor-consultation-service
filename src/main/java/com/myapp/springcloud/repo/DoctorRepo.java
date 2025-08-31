package com.myapp.springcloud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.springcloud.entity.Consultation;

public interface DoctorRepo extends JpaRepository<Consultation, Integer> {
	
	public List<Consultation> findByPatientid(int patientid);

}
