package com.eventsourcing.eventsourcing.PatientDischarge;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class notoficationserivice {
	
	@EventListener
	@Async
	public void notify(PatientDischargeEvent event)
	{
		System.out.println("Notification sent to "+ event.getId()+ ""+Thread.currentThread().getName());
		
		
	}

}
