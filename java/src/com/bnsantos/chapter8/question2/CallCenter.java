package com.bnsantos.chapter8.question2;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {
	private final List<Employee> mRespondents;
	private final List<Employee> mManager;
	private final List<Employee> mDirectors;
	private List<Thread> mPoolCalls;
	
	public CallCenter(int respondents, int managers, int directors){
		mRespondents = initRespondents(respondents);
		mManager = initManagers(managers);
		mDirectors = initDirectors(directors);
		mPoolCalls = new ArrayList<Thread>();
	}
	
	public List<Employee> initRespondents(int max){
		List<Employee> respondents = new ArrayList<Employee>();
		for(int i=0;i<max;i++){
			respondents.add(new Respondent("Respondent_"+i));
		}
		return respondents;
	}
	
	public List<Employee> initManagers(int max){
		List<Employee> managers = new ArrayList<Employee>();
		for(int i=0;i<max;i++){
			managers.add(new Manager("Manager_"+i));
		}
		return managers;
	}
	
	public List<Employee> initDirectors(int max){
		List<Employee> directors = new ArrayList<Employee>();
		for(int i=0;i<max;i++){
			directors.add(new Director("Director_"+i));
		}
		return directors;
	}
	
	private Employee getAvailableRespondent(){
		return getAvailable(mRespondents);
	}
	
	private Employee getAvailableManager(){
		return getAvailable(mManager);
	}
	
	private Employee getAvailableDirector(){
		return getAvailable(mDirectors);
	}
	
	private Employee getAvailable(List<Employee> employeList){
		for(Employee e: employeList){
			if(e.isAvailable()){
				return e;
			}
		}
		return null;
	}
	
	public void handleCall(Call call){
		Thread thread = new Thread(new CallRunnable(call));
		thread.start();
		mPoolCalls.add(thread);
	}
	
	public void waitCalls(){
		for(Thread t:mPoolCalls){
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private class CallRunnable implements Runnable{
		private final Call mCall;
		
		public CallRunnable(Call call) {
			mCall = call;
		}
		
		@Override
		public void run() {
			while(!mCall.isDone()){
				mCall.transferCall();
				
				Respondent respondent = (Respondent)getAvailableRespondent();
				if(respondent!=null&&!mCall.alreadyTalked(respondent)){
					System.out.println("Caller ["+mCall.getCaller().getName()+"] is being attendant by Respondent");
					mCall.addAttendant(respondent);
				}else{
					Manager manager = (Manager) getAvailableManager();
					if(manager!=null&&!mCall.alreadyTalked(manager)){
						System.out.println("Caller ["+mCall.getCaller().getName()+"] is being attendant by Manager");
						mCall.addAttendant(manager);
					}else{
						Director director = (Director)getAvailableDirector();
						if(director!=null){
							System.out.println("Caller ["+mCall.getCaller().getName()+"] is being attendant by Director");
							mCall.addAttendant(director);
						}	
					}
				}
			}
		}
	}
}

