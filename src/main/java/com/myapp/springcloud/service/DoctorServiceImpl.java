package com.myapp.springcloud.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.springcloud.entity.Consultation;
import com.myapp.springcloud.repo.DoctorRepo;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private  DoctorRepo doctorRepo;
	@Override
	public Consultation saveConsultation(Consultation consultation) {
		return doctorRepo.save(consultation);
	}

	@Override
	public Consultation updateConsultation(Consultation consultation) {
		// TODO Auto-generated method stub
		return doctorRepo.save(consultation);
	}

	@Override
	public void deleteConsultation(Consultation consultation) {
		doctorRepo.delete(consultation);
	}

	@Override
	public Consultation findById(int id) {
		// TODO Auto-generated method stub
		return doctorRepo.findById(id).get();
	}

	@Override
	public List<Consultation> findAll() {
		// TODO Auto-generated method stub
		return doctorRepo.findAll();
	}

	

	@Override
	public List<Consultation> findBYpatientid(int patientid) {
		// TODO Auto-generated method stub
		return doctorRepo.findByPatientid(patientid) ;
	}

	

	

}
