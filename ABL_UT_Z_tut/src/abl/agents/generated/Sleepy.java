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

public class Sleepy extends BehavingEntity {
   private final static Object[] __$tempObjArray = new Object[1];
   private final static Class[] __$sensorFactoryArgArray = new Class[1];
   private final static Class[] __$behFactoryArgArray = new Class[5];
   private final static Class[] __$preconditionArgArray = new Class[4];
   private final static Class[] __$continuousConditionArgArray = new Class[3];
   private final static Class[] __$stepFactoryArgArray = new Class[3];
   private final static Class[] __$argumentStepExecuteArgArray = new Class[3];
   private final static Class[] __$mentalStepExecuteArgArray = new Class[4];
   private final static Class[] __$reinforcementSignalArgArray = new Class[3];
   private final static Class[] __$rlPolicyArgArray = new Class[6];
   private final static Class[] __$stateWMEArgArray = new Class[3];
   private final static Class[] __$successConditionArgArray = new Class[3];
   private final static Class __$Sleepy_BehaviorFactories_rfield;
   final static Method __$behaviorFactory0_rfield;
   private final static Class __$Sleepy_Preconditions_rfield;
   final static Method __$precondition0_rfield;
   private final static Class __$Sleepy_PreconditionSensorFactories_rfield;
   final static Method __$preconditionSensorFactory0_rfield;
   private final static Class __$Sleepy_ContextConditions_rfield;
   final static Method __$contextCondition0_rfield;
   private final static Class __$Sleepy_ContextConditionSensorFactories_rfield;
   final static Method __$contextConditionSensorFactory0_rfield;
   private final static Class __$Sleepy_StepFactories_rfield;
   final static Method __$stepFactory0_rfield;
   private final static Class __$Sleepy_ArgumentStepExecute_rfield;
   final static Method __$argumentExecute0_rfield;
   private final static Class __$Sleepy_MentalStepExecute_rfield;
   final static Method __$mentalExecute0_rfield;
   private final static Class __$Sleepy_SuccessTests_rfield;
   final static Method __$successTest0_rfield;
   private final static Class __$Sleepy_SuccessTestSensorFactories_rfield;
   final static Method __$successTestSensorFactory0_rfield;
   private final static Class __$Sleepy_ReinforcementSignals_rfield;
   final static Method __$reinforcementSignal0_rfield;
   private final static Class __$Sleepy_ReinforcementSignalSensorFactories_rfield;
   final static Method __$reinforcementSignalSensorFactory0_rfield;
   private final static Class __$Sleepy_RLPolicy_rfield;
   final static Method __$rlPolicy0_rfield;
   private final static Class __$Sleepy_StateWMEs_rfield;
   final static Method __$stateWME0_rfield;
   private final static Class __$Sleepy_StateWMESensorFactories_rfield;
   final static Method __$stateWMESensorFactory0_rfield;
   private final static Class __$Sleepy_SuccessConditions_rfield;
   final static Method __$successCondition0_rfield;
   private final static Class __$Sleepy_SuccessConditionSensorFactories_rfield;
   final static Method __$successConditionSensorFactory0_rfield;
   static String[] __$conflictSet1;

   static {
      try {
         __$sensorFactoryArgArray[0] = Integer.TYPE;
         __$behFactoryArgArray[0] = Integer.TYPE;
         __$behFactoryArgArray[1] = __$tempObjArray.getClass();
         __$behFactoryArgArray[2] = Class.forName("java.util.Hashtable");
         __$behFactoryArgArray[3] = Class.forName("abl.runtime.GoalStep");
         __$behFactoryArgArray[4] = Class.forName("java.lang.String");
         __$preconditionArgArray[0] = Integer.TYPE;
         __$preconditionArgArray[1] = __$tempObjArray.getClass();
         __$preconditionArgArray[2] = Class.forName("java.util.Hashtable");
         __$preconditionArgArray[3] = Class.forName("abl.runtime.BehavingEntity");
         __$continuousConditionArgArray[0] = Integer.TYPE;
         __$continuousConditionArgArray[1] = __$tempObjArray.getClass();
         __$continuousConditionArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$stepFactoryArgArray[0] = Integer.TYPE;
         __$stepFactoryArgArray[1] = Class.forName("abl.runtime.Behavior");
         __$stepFactoryArgArray[2] = __$tempObjArray.getClass();
         __$argumentStepExecuteArgArray[0] = Integer.TYPE;
         __$argumentStepExecuteArgArray[1] = __$tempObjArray.getClass();
         __$argumentStepExecuteArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$mentalStepExecuteArgArray[0] = Integer.TYPE;
         __$mentalStepExecuteArgArray[1] = __$tempObjArray.getClass();
         __$mentalStepExecuteArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$mentalStepExecuteArgArray[3] = Class.forName("abl.runtime.MentalStep");
         __$reinforcementSignalArgArray[0] = Integer.TYPE;
         __$reinforcementSignalArgArray[1] = __$tempObjArray.getClass();
         __$reinforcementSignalArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$rlPolicyArgArray[0] = Integer.TYPE;
         __$rlPolicyArgArray[1] = Class.forName("java.lang.Object");
         __$rlPolicyArgArray[2] = Integer.TYPE;
         __$rlPolicyArgArray[3] = Class.forName("java.lang.Object");
         __$rlPolicyArgArray[4] = Double.TYPE;
         __$rlPolicyArgArray[5] = Boolean.TYPE;
         __$stateWMEArgArray[0] = Integer.TYPE;
         __$stateWMEArgArray[1] = __$tempObjArray.getClass();
         __$stateWMEArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
         __$successConditionArgArray[0] = Integer.TYPE;
         __$successConditionArgArray[1] = __$tempObjArray.getClass();
         __$successConditionArgArray[2] = Class.forName("abl.runtime.BehavingEntity");
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_BehaviorFactories_rfield = Class.forName("abl.agents.generated.Sleepy_BehaviorFactories");
         __$behaviorFactory0_rfield = __$Sleepy_BehaviorFactories_rfield.getDeclaredMethod("behaviorFactory0", __$behFactoryArgArray);
         __$behaviorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_Preconditions_rfield = Class.forName("abl.agents.generated.Sleepy_Preconditions");
         __$precondition0_rfield = __$Sleepy_Preconditions_rfield.getDeclaredMethod("precondition0", __$preconditionArgArray);
         __$precondition0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_PreconditionSensorFactories_rfield = Class.forName("abl.agents.generated.Sleepy_PreconditionSensorFactories");
         __$preconditionSensorFactory0_rfield = __$Sleepy_PreconditionSensorFactories_rfield.getDeclaredMethod("preconditionSensorFactory0", __$sensorFactoryArgArray);
         __$preconditionSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_ContextConditions_rfield = Class.forName("abl.agents.generated.Sleepy_ContextConditions");
         __$contextCondition0_rfield = __$Sleepy_ContextConditions_rfield.getDeclaredMethod("contextCondition0", __$continuousConditionArgArray);
         __$contextCondition0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_ContextConditionSensorFactories_rfield = Class.forName("abl.agents.generated.Sleepy_ContextConditionSensorFactories");
         __$contextConditionSensorFactory0_rfield = __$Sleepy_ContextConditionSensorFactories_rfield.getDeclaredMethod("contextConditionSensorFactory0", __$sensorFactoryArgArray);
         __$contextConditionSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_StepFactories_rfield = Class.forName("abl.agents.generated.Sleepy_StepFactories");
         __$stepFactory0_rfield = __$Sleepy_StepFactories_rfield.getDeclaredMethod("stepFactory0", __$stepFactoryArgArray);
         __$stepFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_ArgumentStepExecute_rfield = Class.forName("abl.agents.generated.Sleepy_ArgumentStepExecute");
         __$argumentExecute0_rfield = __$Sleepy_ArgumentStepExecute_rfield.getDeclaredMethod("argumentExecute0", __$argumentStepExecuteArgArray);
         __$argumentExecute0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_MentalStepExecute_rfield = Class.forName("abl.agents.generated.Sleepy_MentalStepExecute");
         __$mentalExecute0_rfield = __$Sleepy_MentalStepExecute_rfield.getDeclaredMethod("mentalExecute0", __$mentalStepExecuteArgArray);
         __$mentalExecute0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_SuccessTests_rfield = Class.forName("abl.agents.generated.Sleepy_SuccessTests");
         __$successTest0_rfield = __$Sleepy_SuccessTests_rfield.getDeclaredMethod("successTest0", __$continuousConditionArgArray);
         __$successTest0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_SuccessTestSensorFactories_rfield = Class.forName("abl.agents.generated.Sleepy_SuccessTestSensorFactories");
         __$successTestSensorFactory0_rfield = __$Sleepy_SuccessTestSensorFactories_rfield.getDeclaredMethod("successTestSensorFactory0", __$sensorFactoryArgArray);
         __$successTestSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_ReinforcementSignals_rfield = Class.forName("abl.agents.generated.Sleepy_ReinforcementSignals");
         __$reinforcementSignal0_rfield = __$Sleepy_ReinforcementSignals_rfield.getDeclaredMethod("reinforcementSignal0", __$reinforcementSignalArgArray);
         __$reinforcementSignal0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_ReinforcementSignalSensorFactories_rfield = Class.forName("abl.agents.generated.Sleepy_ReinforcementSignalSensorFactories");
         __$reinforcementSignalSensorFactory0_rfield = __$Sleepy_ReinforcementSignalSensorFactories_rfield.getDeclaredMethod("reinforcementSignalSensorFactory0", __$sensorFactoryArgArray);
         __$reinforcementSignalSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_RLPolicy_rfield = Class.forName("abl.agents.generated.Sleepy_RLPolicy");
         __$rlPolicy0_rfield = __$Sleepy_RLPolicy_rfield.getDeclaredMethod("rlPolicy0", __$rlPolicyArgArray);
         __$rlPolicy0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_StateWMEs_rfield = Class.forName("abl.agents.generated.Sleepy_StateWMEs");
         __$stateWME0_rfield = __$Sleepy_StateWMEs_rfield.getDeclaredMethod("stateWME0", __$stateWMEArgArray);
         __$stateWME0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_StateWMESensorFactories_rfield = Class.forName("abl.agents.generated.Sleepy_StateWMESensorFactories");
         __$stateWMESensorFactory0_rfield = __$Sleepy_StateWMESensorFactories_rfield.getDeclaredMethod("stateWMESensorFactory0", __$sensorFactoryArgArray);
         __$stateWMESensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_SuccessConditions_rfield = Class.forName("abl.agents.generated.Sleepy_SuccessConditions");
         __$successCondition0_rfield = __$Sleepy_SuccessConditions_rfield.getDeclaredMethod("successCondition0", __$successConditionArgArray);
         __$successCondition0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }

   static {
      try {
         __$Sleepy_SuccessConditionSensorFactories_rfield = Class.forName("abl.agents.generated.Sleepy_SuccessConditionSensorFactories");
         __$successConditionSensorFactory0_rfield = __$Sleepy_SuccessConditionSensorFactories_rfield.getDeclaredMethod("successConditionSensorFactory0", __$sensorFactoryArgArray);
         __$successConditionSensorFactory0_rfield.setAccessible(true);
      
      } catch (Exception e) { throw new AblRuntimeError("Error in static initializer", e); }
   }


   private static void __$initConflictSet0() {
      __$conflictSet1 = new String[]{"consoleMessage"};
   }

   private static void registerBehaviors_0(BehaviorLibrary behaviorLibrary) {
      behaviorLibrary.registerBehavior(new __BehaviorDesc(0, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "sleep()", new String[] {"sleep()"}, null, (short)0));
      behaviorLibrary.registerBehavior(new __BehaviorDesc(1, __$behaviorFactory0_rfield, __$precondition0_rfield, null, "notSleep()", new String[] {"notSleep()"}, null, (short)0));
      behaviorLibrary.registerBehavior(new __BehaviorDesc(2, __$behaviorFactory0_rfield, null, null, "Sleepy_RootCollectionBehavior()", new String[] {"Sleepy_RootCollectionBehavior()"}, null, (short)0));
   }

   private static void registerBehaviors_1(BehaviorLibrary behaviorLibrary) {
   }

   public static void main(String[] args) {
      new Sleepy().startBehaving();
   }

   public Sleepy() {
      individualBehaviorLibrary = new BehaviorLibrary(6);
      jointBehaviorLibrary = new BehaviorLibrary(0);
      registerBehaviors_0(individualBehaviorLibrary);
      registerBehaviors_1(jointBehaviorLibrary);
      __$initConflictSet0();
      ABT = (CollectionBehavior)Sleepy_BehaviorFactories.behaviorFactory0(2, null, null, null, "Sleepy_RootCollectionBehavior()");
      startWMEReflection(ABT);
      ABT.initRootBehavior();
      registerEntity("Sleepy", this);
   }

}
