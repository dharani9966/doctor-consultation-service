package com.myapp.springcloud.service;

import java.util.List;

import com.myapp.springcloud.entity.Consultation;

public interface DoctorService {
	
	public  Consultation saveConsultation(Consultation consultation);
	public Consultation updateConsultation(Consultation consultation);
	public void deleteConsultation(Consultation consultation);
	public Consultation findById(int id);
	public List<Consultation>findAll();
	public List<Consultation>findBYpatientid(int patientid);

}
