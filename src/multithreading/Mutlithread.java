package multithreading;

public class Mutlithread {

	public void printTable(int i) {
		int n = 1;
		int y = 0;
		while (n <= 5) {
			try {
				System.out.println(Thread.currentThread().getName() + "sleeping.");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			y = i * n;

			n++;
			System.out.println(y + " >>> " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		new Thread(new MyTask(10), "Thread-10").start();
		new Thread(new MyTask(12), "Thread-12").start();
		new Thread(new MyTask(11), "Thread-11").start();
		new Thread(new MyTask(2), "Thread-2").start();
	}

}

class MyTask implements Runnable {
	final int num;

	public MyTask(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		Mutlithread m = new Mutlithread();
		m.printTable(num);

	}

}
