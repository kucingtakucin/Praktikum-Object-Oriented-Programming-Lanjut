package d3ti.oop.thread;

public class Tugas {

	public static void main(String[] args) {
		Thread I1 = new Thread(new MethodSinkronisasi("I1"));
		Thread I2 = new Thread(new ThreadInterface("I2"));
		Thread I3 = new Thread(new MethodSinkronisasi("I3"));
		Thread I4 = new Thread(new ThreadInterface("I4"));
		I1.start();
		I3.start();
		I2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		I4.start();
	
	}
}
