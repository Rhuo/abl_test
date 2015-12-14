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
public class Sleepy_Preconditions {
   static public boolean precondition0(int __$behaviorID, Object[] __$args, Hashtable __$variableTable, final BehavingEntity __$thisEntity) {
      switch (__$behaviorID) {
         case 0: {
            // sleep_1
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("SleepyWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  SleepyWME wme__0 = (SleepyWME)wmeIter0.next();
                  if (
                     ( wme__0.getTired() == true )
                  )

                  {
                     return true;
                  }

               }


            return false;
         }
         case 1: {
            // notSleep_1
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("SleepyWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  SleepyWME wme__0 = (SleepyWME)wmeIter0.next();
                  if (
                     ( wme__0.getTired() == false )
                  )

                  {
                     return true;
                  }

               }


            return false;
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
