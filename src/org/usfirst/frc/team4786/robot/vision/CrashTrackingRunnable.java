package org.usfirst.frc.team4786.robot.vision;

public abstract class CrashTrackingRunnable implements Runnable {
	
	@Override
	public final void run(){
		try{
			runCrashTracked();
		} catch(Throwable t){
//			CrashTracker.logThrowableCrash(t);
			throw t;
		}
	}
	
	public abstract void runCrashTracked();

}
