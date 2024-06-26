class ChildThread implements Runnable{	
	String name;
	Thread t;
	ChildThread(String name){
		t = new Thread(this, name);
		t.start();
	}
	public void run(){
		for(int i=1; i<=5; i++){
			try{
				if(t.getName().equals("First Thread")){
					Thread.sleep(1000);
					System.out.println(t.getName()+ ": Good Morning");
				}
				else if(t.getName().equals("Second Thread")){
					Thread.sleep(2000);
					System.out.println(t.getName()+": Hello");
				}
				else{
					Thread.sleep(3000);
					System.out.println(t.getName()+": Welcome");
				}
			}
			catch(InterruptedException e){
				System.out.println(t.getName()+" is interrupted");
			}
		}
	}
}	
class ThreeThreads{
	public static void main(String args[]){
		ChildThread one = new ChildThread("First Thread");
		ChildThread two = new ChildThread("Second Thread");
		ChildThread three = new ChildThread("Third Thread");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
}
