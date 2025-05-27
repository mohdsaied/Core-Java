package EcecuterServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Methodexeciter {

	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		ExecutorService pool2 = Executors.newCachedThreadPool();
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		
		for(int i = 1; i<=10; i++) {
			MyTask myTask = new MyTask(i);
			
			scheduledThreadPool.execute(myTask);
		}
		scheduledThreadPool.shutdown();
	}
}

class MyTask implements Runnable{
	
	private int tastId;
	
	public MyTask(int id) {
		this.tastId=id;
	}

	@Override
	public void run() {
		System.out.println("Task is : " +tastId +"Corrent thread is : "+Thread.currentThread().getName());
	}
	
}
