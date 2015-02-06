package com.bnsantos.chapter8.question2;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {
	private final List<Employee> mRespondents;
	private final List<Employee> mManager;
	private final List<Employee> mDirectors;
	
	public CallCenter(int respondents, int managers, int directors){
		mRespondents = initRespondents(respondents);
		mManager = initManagers(managers);
		mDirectors = initDirectors(directors);
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
		while(!call.isDone()){
			Respondent respondent = (Respondent)getAvailableRespondent();
			if(respondent!=null&&!call.alreadyTalked(respondent)){
				call.addAttendant(respondent);
				
				wait(1000);
				if(!call.isDone()){
					respondent.transferCall();
				}
			}else{
				Manager manager = (Manager) getAvailableManager();
				if(manager!=null&&!call.alreadyTalked(manager)){
					call.addAttendant(manager);
					
					wait(700);
					if(!call.isDone()){
						manager.transferCall();
					}
				}else{
					Director director = (Director)getAvailableDirector();
					if(director!=null){
						call.addAttendant(director);
						wait(500);
					}	
				}
			}
		}
	}
	
	private void wait(int milli){
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

