package abl.sensors;

import abl.runtime.DefaultAsyncSensor;
import abl.runtime.BehavingEntity;
import abl.wmes.SleepyWME;
import abl.game.SleepyGame;


//Das extend ist wichtig sonst kein ABL Sensor.
public abstract class SleepySensor extends DefaultAsyncSensor{
	
	
	/*Definition der methode des Sleepy Sensors. Hier ist die verbindung zum "Game"
	Erst werden alle WME Eintr�ge gel�scht.
	Dann wird ein WME hinzugef�gt (Wie in Sleepy WME Konstruktor definiert).
	Hier m�sste Der Agent f�r den Sensor tired den Wert true bekommen. Bekommt er aber nicht.
	*/
	public void SenseSleepy(){
		BehavingEntity.getBehavingEntity().deleteAllWMEClass("SleepyWME");
		BehavingEntity.getBehavingEntity().addWME(new SleepyWME(SleepyGame.getInstance().getTiredGame()));
		
	}
	
	
	
	
	
	public void senseContinuous (Object[]args){
		//Kontinuierliches �berwachen aktualisiert das notwenige WME
		
		SenseSleepy(args);
	}
	
	private void SenseSleepy(Object[] args) {
		// TODO Auto-generated method stub
		SenseSleepy();
	}




	public void initializeContinuous (Object[]args){
		//wird aufgerufen sobald kontinuierliche �berwachung notwenidg ist (context condition oder success test)
		//Aktualisiert das notwendige WME
		
		
	}
	
	public void senseOneShot(Object[]args){
		// aufgerufen beim precondition test. Aktualisiert WME
		
		SenseSleepy(args);
		
	}
	
	public boolean canBeParallel(){
		//abfrage ob Sensor paralell funktionierne kann.
		return true;
		
		
	}
	
	
}