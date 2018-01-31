package tickets;

public class SellTickets implements Runnable  {
	int count = 30;
	//Object obj = new Object();
	public synchronized void sell() {
		System.out.println(Thread.currentThread().getName()+"卖出了第"+count+"张票");
		count--;
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(count>0) {
			sell();
			if(count==0) {
				break;
			}
			
		}
	}
}
