package com.demo.timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 
Timer 是基于绝对时间的，对系统时间比较敏感，而 ScheduledThreadPoolExecutor 则是基于相对时间；
Timer 是内部是单一线程，而 ScheduledThreadPoolExecutor 内部是个线程池，所以可以支持多个任务并发执行。 
Timer 的任务是按序进行的，前一个未完成，后一个不会开始。 而ScheduledThreadPoolExecutor不会有这个问题
 */
public class ScheduledExecutorTest {
	private ScheduledExecutorService scheduExec;
	public long start;
	
	ScheduledExecutorTest(){
		this.scheduExec = Executors.newScheduledThreadPool(2);
		this.start = System.currentTimeMillis();
	}
	
	public void timerOne(){
		scheduExec.schedule(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("timerOne,the time:" + (System.currentTimeMillis() - start));				
				
				try {
					Thread.sleep(4000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, 1000, TimeUnit.MILLISECONDS);
	}
	
	public void timerTwo(){
		scheduExec.schedule(new Runnable() {
            public void run() {
                System.out.println("timerTwo,the time:" + (System.currentTimeMillis() - start));
            }
        },2000,TimeUnit.MILLISECONDS);
	}
	
	public static void main(String[] args) {
		ScheduledExecutorTest test = new ScheduledExecutorTest();
		test.timerOne();
		test.timerTwo();
	}
}
