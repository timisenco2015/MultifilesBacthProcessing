package listener;

import javax.batch.api.chunk.listener.ItemReadListener;



public class ReaderListener implements ItemReadListener {

	@Override
	public void beforeRead() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---Error Read-+++-> ");
	}

	@Override
	public void afterRead(Object item) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---Error Read-***-> "+item);
	}

	@Override
	public void onReadError(Exception ex) throws Exception {
		System.out.println("---Error Read--> "+ex);
		
	}

	

}
