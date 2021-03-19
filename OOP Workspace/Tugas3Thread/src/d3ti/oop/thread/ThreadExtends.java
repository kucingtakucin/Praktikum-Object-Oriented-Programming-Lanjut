package d3ti.oop.thread;

public class ThreadExtends extends Thread{
	public ThreadExtends(String name){
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 5; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread: "+getName()+" posisi: "+i);
		}
	}
	
	public static void main(String args[]){
		Thread vespa = new Thread(new ThreadExtends("vespa"));
		vespa.start();
		Thread sepeda = new Thread(new ThreadExtends("sepeda"));
		sepeda.start();
	}
}
