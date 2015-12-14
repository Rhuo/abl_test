package abl.actions;
import abl.runtime.PrimitiveAction;


public class ConsoleMessage extends PrimitiveAction{
	

	
	/**  
	 * Performs the physcial act. 
	 */
	public void execute(Object[] args){
		System.out.println("Zzzzzzzzzzzzzzzz");
		
	}
	
	public void completionCallback(boolean status){
		
		
	}



	/**
	 * Returns that the action has completed successfully. 
	 */
    public synchronized int getCompletionStatus() {
    	return completionStatus = SUCCESS;
    }
	
	
	
}