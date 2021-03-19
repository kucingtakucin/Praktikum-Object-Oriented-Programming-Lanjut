package d3ti.oop.thread;


public class MethodSinkronisasi extends Thread {

	public MethodSinkronisasi(String name) {
		super(name);
	}
	
	public static synchronized void tampil(String nama) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("Thread: " + nama + " posisi: "  + i);
		}
	}
	
	public void run() {
		tampil(getName());
	}
	
	public static void main(String[] args) {
		Thread odong = new Thread(new MethodSinkronisasi("odong"));
		Thread andong = new Thread(new MethodSinkronisasi("andong"));
		odong.start();
		andong.start();
	}
}
