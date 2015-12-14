package abl.agents.generated;

import abl.runtime.*;
import wm.WME;
import java.util.*;
import java.lang.reflect.Method;
import abl.learning.*;
import abl.wmes.*;
import abl.actions.*;
import abl.sensors.*;
import abl.game.*;
import java.lang.*;
public class Sleepy_MentalStepExecute {
   static public void mentalExecute0(int __$stepID, final Object[] __$behaviorFrame, final BehavingEntity __$thisEntity, MentalStep __$thisStep) {
      switch (__$stepID) {
         case 4: {
            // Sleepy_RootCollectionBehaviorStep3
            System.out.println(SleepyGame.getInstance().getTiredGame() + " Sensor");
            System.out.println("Sleepy ist da");
            break;
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
