package com.demo.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TimerTest02 {
	Timer timer;

	public TimerTest02() {
		Date time = getDate();
		System.out.println("指定时间time= " + time);
		this.timer = new Timer();
		timer.schedule(new TimerTask01(), time);
	}

	
	public Date getDate(){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY	, 15);
		c.set(Calendar.MINUTE, 44);
		c.set(Calendar.SECOND, 10);
		return c.getTime();
	}
	
	public static void main(String[] args) {
		System.out.println("timer begin....");
		new TimerTest02();
	}

}
