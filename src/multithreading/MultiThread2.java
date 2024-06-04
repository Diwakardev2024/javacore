package multithreading;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class MultiThread2 {

	private Deque<Integer> dq = new ArrayDeque<>(10);

	public static void main(String[] args) {
		MultiThread2 m = new MultiThread2(); // Shared Resource
//		m.handleList();
		Producer p = new Producer(m);
		Consumer c = new Consumer(m);
		p.start();
		c.start();
	}

	public void handleList() {
		producer();
		consumer();
	}

	public void producer() {
		// load data into the list
		IntStream.rangeClosed(1, 10).forEach(num -> dq.offer(num));
	}

	public void consumer() {
		// consume data
		while (dq.size() > 0) {
			System.out.println(dq.poll()); 
		}
	}

}

class Producer extends Thread {
	MultiThread2 mobj;

	public Producer(MultiThread2 mobj) {
		this.mobj = mobj;
	}

	@Override
	public void run() {
		mobj.producer();
	}

}

class Consumer extends Thread {
	MultiThread2 mobj;

	public Consumer(MultiThread2 mobj) {
		this.mobj = mobj;
	}

	@Override
	public void run() {
		mobj.consumer();
	}

}
