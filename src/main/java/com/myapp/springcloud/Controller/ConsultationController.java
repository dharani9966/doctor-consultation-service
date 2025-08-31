package com.myapp.springcloud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.springcloud.dto.Patient;
import com.myapp.springcloud.entity.Consultation;
import com.myapp.springcloud.restclient.PatientRegRestClient;
import com.myapp.springcloud.service.DoctorService;

@RestController
@RequestMapping("/consultations")
public class ConsultationController {
	
	@Autowired
	private DoctorService doctorService;
	@Autowired
    private PatientRegRestClient patientRegRestClient;
	
	
	@PostMapping
	public String registerConsultation(@RequestBody Consultation consultation)
	{
		
		//it needs to know the patient details
		
		Patient patient = patientRegRestClient.getpatientDetails(consultation.getPatientid());
		
		System.out.println("patientDetails:/n"+patient);
	
		doctorService.saveConsultation(consultation);
		return "Registered sucessfully";
		
		
		
	}
	
	@PutMapping
	public  String UpdateConsultation(@RequestBody Consultation consultation) 
	
	{
		
		Consultation UpdateConsultation=doctorService.updateConsultation(consultation);
		
		
		return "Updated successful";
		
	}
	
	@DeleteMapping("{id}")
	public void deleteConsultation(@PathVariable int id )
	{
		Consultation consultation=doctorService.findById(id);
		
		doctorService.deleteConsultation(consultation);
		
	}
	
	@GetMapping("/{id}")
	public Consultation getConsultation(@PathVariable("id")int id)
	{
		Consultation consultation =doctorService.findById(id);
		
		return consultation;
		
	}
	
	
	

}
