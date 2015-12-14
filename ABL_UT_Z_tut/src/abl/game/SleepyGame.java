package abl.game;


import abl.agents.generated.Sleepy;


public class SleepyGame{
	//Alle wichtigen globalen Variablen
	private static SleepyGame sleepyGame;
	private static Sleepy sleepy;
	//tired auf true gesetzt, damit die Precondition erfüllt ist
	private boolean tired = true;

	//Aufruf in abl.sensors.SleepySensor
	public static SleepyGame getInstance() {
		return sleepyGame;
	}
	

	//Getter 
	public boolean getTiredGame(){
		return tired;
		
	}
	

	//Main Funktion. Feuer Sequentiell Anweisungen ab.
	public static void main(String[] args) {
		
		sleepyGame = new SleepyGame();
		
		//Methode weiter unten definiert
		sleepyGame.startAgent();

	}
	
	//startet den Agenten in Sleepy.abl
	public void startAgent(){
		sleepy = new Sleepy();
		//Konsolenausgabe von tired
		System.out.println(tired+ " game");
		
		sleepy.startBehaving();
		
	}
	
}