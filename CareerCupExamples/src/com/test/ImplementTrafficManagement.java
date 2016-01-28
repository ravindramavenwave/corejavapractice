package com.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ImplementTrafficManagement {
	
  private Map<String,String> mao = new HashMap<String,String>();	
  private static class TrafficSignal {
	  private Lights state = Lights.RED ;
	  
	  public void setChangeState(){
		state =  (state == Lights.GREEN) ? Lights.RED : Lights.GREEN;
	  }
  }	
  
 
  public static void main(String[] args){
	  
	  Queue<TrafficSignal> trafficSystem = new LinkedList<TrafficSignal>();
	  
	  //Set one light to Green
	  TrafficSignal greenSignal = new TrafficSignal();
	  greenSignal.setChangeState();
	  trafficSystem.add(greenSignal);
	  trafficSystem.add(new TrafficSignal());
	  trafficSystem.add(new TrafficSignal());
	  trafficSystem.add(new TrafficSignal());
	
	  while(!Thread.interrupted()){
		  //Set the Timer here and block use the tasks Accordingly
	  }
	  
  }

}
