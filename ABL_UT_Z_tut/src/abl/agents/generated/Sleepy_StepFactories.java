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
public class Sleepy_StepFactories {
   static public Step stepFactory0(int __$stepID, Behavior __$behaviorParent, final Object[] __$behaviorFrame) {
      switch (__$stepID) {
         case -3: {
            // default wait step
            return new WaitStep(-3, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null);
         }
         case -2: {
            // default fail step
            return new FailStep(-2, __$behaviorParent, false, false, false, (short)-32768, (short)0, false, null, null);
         }
         case -1: {
            // default succeed step
            return new SucceedStep(-1, __$behaviorParent, false, false, (short)-32768, (short)0, false, null, null);
         }
         case 0: {
            // sleep_1Step1
            return new PrimitiveStep(0, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, new ConsoleMessage(), Sleepy.__$conflictSet1, "consoleMessage");
         }
         case 1: {
            // notSleep_1Step1
            return new PrimitiveStep(1, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, new ConsoleMessage(), Sleepy.__$conflictSet1, "consoleMessage");
         }
         case 2: {
            // Sleepy_RootCollectionBehaviorStep1
            return new GoalStep(2, __$behaviorParent, true, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "notSleep()", null, (short)0);
         }
         case 3: {
            // Sleepy_RootCollectionBehaviorStep2
            return new GoalStep(3, __$behaviorParent, true, false, false, false, false, false, (short)-32768, (short)0, false, null, null, null, null, null, "sleep()", null, (short)0);
         }
         case 4: {
            // Sleepy_RootCollectionBehaviorStep3
            return new MentalStep(4, __$behaviorParent, false, false, false, false, false, false, (short)-32768, (short)0, false, null, Sleepy.__$mentalExecute0_rfield, null, null, null);
         }
      default:
         throw new AblRuntimeError("Unexpected stepID " + __$stepID);
      }
   }
}
