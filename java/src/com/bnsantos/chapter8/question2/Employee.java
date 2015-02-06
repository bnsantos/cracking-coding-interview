package com.bnsantos.chapter8.question2;

public abstract class Employee {
	protected final Rank mRank;
	protected final String mName;
	protected Call mCall;
	
	public Employee(Rank rank, String name){
		mRank = rank;
		mName = name;
	}

	public Rank getRank() {
		return mRank;
	}

	public String getName() {
		return mName;
	}
	
	public void setCall(Call mCall) {
		this.mCall = mCall;
	}

	public boolean isAvailable(){
		return mCall==null;
	}
	
	public void transferCall(){
		mCall = null;
	}
}
