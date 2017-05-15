package com.demo.concurrent;

public class MyWaitNotify {

	MonitorObject monitor = new MonitorObject();
	boolean wasSignalled = false;
	
	public void doWait(){
		synchronized (monitor) {
			if(!wasSignalled){
				try{
					monitor.wait();
				}catch (InterruptedException  e) {
				}
			}
			wasSignalled = false;
		}
	}
	
	public void doNotify(){
		synchronized (monitor) {
			wasSignalled = true;
			monitor.notify();
		}
	}
}
