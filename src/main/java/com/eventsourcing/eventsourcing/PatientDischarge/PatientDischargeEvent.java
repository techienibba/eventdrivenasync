package com.eventsourcing.eventsourcing.PatientDischarge;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDischargeEvent extends ApplicationEvent {
	





	private String name;
	private String id;
	
	public PatientDischargeEvent(Object source,String pname,String pid) {
		super(source);
		this.name=pname;
		this.id=pid;
		// TODO Auto-generated constructor stub
	}
	

}
