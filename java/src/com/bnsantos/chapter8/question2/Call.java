package com.bnsantos.chapter8.question2;

import java.util.ArrayList;
import java.util.List;

public class Call {
	private final Caller mCaller;
	private final Rank mRank;
	private List<String> mHistory;
	private final int mTimeToHandle;
	private Employee mAttendant;
	private boolean mDone;
	
	public Call(Caller caller, Rank rank, int timeMillis){
		mCaller = caller;
		mRank = rank;
		mHistory = new ArrayList<String>();
		mDone = false;
		mTimeToHandle = timeMillis;
	}
	
	public void setFinished(Employee e){
		mDone = true;
		mHistory.add("-Finished!");
		e.setCall(null);
	}
	
	public void addAttendant(Employee e){
		mAttendant = e;
		mHistory.add(e.getClass().getSimpleName());
		e.setCall(this);
		checkCallDone(e);
	}

	private void checkCallDone(Employee e) {
		switch (mRank) {
		case RESPONDENT:
			wait(mTimeToHandle);
			setFinished(e);
			break;
		case MANAGER:
			if(e instanceof Manager){
				wait(mTimeToHandle);
				setFinished(e);
			}
		case DIRECTOR:
			if(e instanceof Director){
				wait(mTimeToHandle);
				setFinished(e);
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

	public int getTimeToHandle() {
		return mTimeToHandle;
	}

	public void transferCall() {
		if(mAttendant!=null){
			mAttendant.transferCall();
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
