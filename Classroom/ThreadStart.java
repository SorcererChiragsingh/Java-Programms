class MyThread extends Thread{
	public void run(){
System.out.println("Current thread name: "+Thread.currentThread().getName());
		System.out.println("run() method called");
	}
}
class ThreadStart{
	public static void main(String args[]){
		MyThread t= new MyThread();
		try{
			t.run();
			t.run();
		}
		catch(IllegalThreadStateException e){	
		}
	}
}
