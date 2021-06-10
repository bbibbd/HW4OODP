package edu.handong.csee.oodp.HW6;

public class Blackbox {

	private static Blackbox blackbox = new Blackbox();
	StringBuilder alarm = new StringBuilder("\n +++ Major Checking and Action from BlackBox +++\n");
	private int i=1;
	
	private Blackbox() {
		
	}
	
	public static Blackbox getBlackbox() {
		return blackbox;
	}
	
	public void addAlarm(String str) {
		alarm.append(i+": "+str+"\n");
		i++;
	}
	
	public String getAlarm() {
		System.out.println(alarm);
		return alarm.toString();
	}
}
