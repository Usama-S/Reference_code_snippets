
public class Main {
	
	public static void main(String[] args){
		
		Thread thread = new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 5; i++){
					System.out.println("Printing " + i + " from a worker thread");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		thread.start();
		
		for (int i = 0; i < 5; i++){
			System.out.println("Printing " + i + " from main thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
