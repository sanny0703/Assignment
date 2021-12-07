package assignment;

public class Deadlock {

	public static void main(String[] args) {
		final Object resource1 = new Object();
		final Object resource2 = new Object();
		
		Thread thread1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("thread1 locked resource1!!");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						
					}
					System.out.println("thread1 waiting for resource2!!");
				
				synchronized(resource2) {
					System.out.println("thread1 locked resource1 & resource2!!");
				}
				
			}}
		};
		Thread thread2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("thread2 locked resource2!!");
					try {
						Thread.sleep(1000);
					}
					catch(InterruptedException e) {
						
					}
					System.out.println("thread2 waiting for resource1!!");
				
				synchronized(resource1) {
					System.out.println("thread2 locked resource1 & resource2!!");
				}
				
			}}
		};
		thread1.start();
		thread2.start();
	}
}
