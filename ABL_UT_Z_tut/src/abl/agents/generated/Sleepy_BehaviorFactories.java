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
public class Sleepy_BehaviorFactories {
   static public Behavior behaviorFactory0(int __$behaviorID, Object[] __$args, Hashtable __$boundVars, GoalStep __$parentGoal, String __$signature) {
      switch (__$behaviorID) {
         case 0: {
            // sleep_1

            final __StepDesc[] __$steps = {new __StepDesc(0, Sleepy.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 0, null, __$steps);
         }
         case 1: {
            // notSleep_1

            final __StepDesc[] __$steps = {new __StepDesc(1, Sleepy.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 1, null, __$steps);
         }
         case 2: {
            // Sleepy_RootCollectionBehavior

            final __StepDesc[] __$steps = {new __StepDesc(2, Sleepy.__$stepFactory0_rfield), new __StepDesc(3, Sleepy.__$stepFactory0_rfield), new __StepDesc(4, Sleepy.__$stepFactory0_rfield)};
            return new CollectionBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 2, null, __$steps, 3);
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
