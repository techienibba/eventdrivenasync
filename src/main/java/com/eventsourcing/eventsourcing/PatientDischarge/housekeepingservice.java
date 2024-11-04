package com.eventsourcing.eventsourcing.PatientDischarge;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class housekeepingservice {
	
	@EventListener
	@Async
	public void housekeeping(PatientDischargeEvent event)
	{
		System.out.println("Housekeeping initiated for " + event.getName()+""+Thread.currentThread().getName());
		
		
	}
	
	
	
	
	

}
