package com.bnsantos.chapter8.question2;

import java.util.ArrayList;
import java.util.List;

public class Call {
	private final Caller mCaller;
	private final Rank mRank;
	private List<String> mHistory;
	private boolean mDone;
	
	public Call(Caller caller, Rank rank){
		mCaller = caller;
		mRank = rank;
		mHistory = new ArrayList<String>();
		mDone = false;
	}
	
	public void setFinished(){
		mDone = true;
		mHistory.add("-Finished!");
	}
	
	public void addAttendant(Employee e){
		mHistory.add(e.getClass().getSimpleName());
		e.setCall(this);
		checkCallDone(e);
	}

	private void checkCallDone(Employee e) {
		switch (mRank) {
		case RESPONDENT:
			setFinished();
			break;
		case MANAGER:
			if(e instanceof Manager){
				setFinished();
			}
		case DIRECTOR:
			if(e instanceof Director){
				setFinished();
			}
		}
	}
	
	public String printHistory(){
		StringBuffer sb = new StringBuffer();
		for(String s:mHistory){
			sb.append(s);
			sb.append("-");
		}
		return sb.toString();
	}

	public Caller getCaller() {
		return mCaller;
	}

	public Rank getRank() {
		return mRank;
	}
	
	public boolean isDone(){
		return mDone;
	}
	
	public boolean alreadyTalked(Employee e){
		return mHistory.contains(e.getClass().getSimpleName());
	}
}
