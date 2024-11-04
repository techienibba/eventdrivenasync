package com.eventsourcing.eventsourcing.PatientDischarge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class patientdischargeserviceevent {

	
	
	@Autowired
	private ApplicationEventPublisher eventpub;
	
	
	public String dischargeservice(String patientname,String patientid)
	{
		eventpub.publishEvent(new PatientDischargeEvent(this,patientname,patientid));
		return "Event published";
		
		
	}
	
	
}
