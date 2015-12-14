package abl.wmes;

import wm.WME;

//Extend wichtig, da sonst kein ABL WME
public class SleepyWME extends WME {
	
	
	private boolean tired;	

	//Konstruktor
	public SleepyWME (boolean tired){
		this.tired = tired;
		
	}

	
	//Getter. Code übernommen von First_ABL
	public boolean getTired() {
		return tired;
	}

}