package com.demo.timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest03 {
	 private Timer timer;
     public long start;   

     public TimerTest03(){
         this.timer = new Timer();
         start = System.currentTimeMillis();
     }

     public void timerOne(){
         timer.schedule(new TimerTask() {
             public void run() {
                 System.out.println("timerOne invoked ,the time:" + (System.currentTimeMillis() - start));
                 try {
                     Thread.sleep(4000);    //线程休眠4000
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }, 1000);
     }

     public void timerTwo(){
         timer.schedule(new TimerTask() {
             public void run() {
                 System.out.println("timerTwo invoked ,the time:" + (System.currentTimeMillis() - start));
             }
         }, 3000);
      }

     public static void main(String[] args) throws   Exception {
         TimerTest03 test = new TimerTest03();

         test.timerOne();
         test.timerTwo();
     }

}
