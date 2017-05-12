package com.demo.failFast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTest {
	private static List<Integer> list = new ArrayList<Integer>();

	private static class threadOne extends Thread {
		@Override
		public void run() {
			Iterator<Integer> iters = list.iterator();
			while (iters.hasNext()) {
				int i = iters.next();
				System.out.println("ThreadOne 遍历:" + i);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static class threadTwo extends Thread {
		public void run() {
			int i = 0;
			while (i < 6) {
				System.out.println("ThreadTwo run：" + i);
				if (i == 3) {
					list.remove(i);
				}
				i++;
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		new threadOne().start();
		new threadTwo().start();
	}

}
