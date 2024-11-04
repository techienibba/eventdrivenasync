package com.eventsourcing.eventsourcing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventsourcing.eventsourcing.DTO.patientdetails;
import com.eventsourcing.eventsourcing.PatientDischarge.PatientDischargeEvent;
import com.eventsourcing.eventsourcing.PatientDischarge.patientdischargeserviceevent;

@RestController
@RequestMapping
public class patientcontroller {
	
	
	@Autowired
	private patientdischargeserviceevent sce;
	
	@PostMapping("/patient")
	public String addpatient(@RequestBody patientdetails ptd)
	{
		sce.dischargeservice(ptd.getPatientname(),ptd.getPatientid());
		return "Patient Event has been done";
		
	}
	
	
	}
	
	
	
	


