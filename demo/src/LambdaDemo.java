
class Task implements Runnable {
	public void run() {
		System.out.println("In Thread 1");
	}
}

public class LambdaDemo {

	public static void print() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new Task());
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("In Thread 2");
			}
		});
		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("In Thread 3"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});

		t4.start();
		
		// Method reference 
		Thread t5 = new Thread(LambdaDemo::print);
		t5.start();
		
				

	}

}
