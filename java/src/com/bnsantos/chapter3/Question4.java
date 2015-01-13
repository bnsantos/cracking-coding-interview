package com.bnsantos.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
	public static class HanoiTower{
		private static final int TOWERS = 3;
		private Tower mTowers[];
		private final int mDisksCount;
		
		public HanoiTower(int disks){
			mDisksCount = disks;
			mTowers = new Tower[TOWERS];
			for(int i=0;i<TOWERS;i++){
				mTowers[i] = new Tower();
			}
			for(int i=mDisksCount-1;i>=0;i--){
				mTowers[0].addDisk(i);
			}
		}

		@Override
		public String toString() {
			StringBuffer hanoi = new StringBuffer();
			int tower = 1;
			for(Tower t:mTowers){
				hanoi.append("Tower["+(tower++)+"]");
				hanoi.append(t);
			}
			return hanoi.toString();
		}
		
		public void solve(){
			moveDisks(mDisksCount, 0, 2, 1);
		}
		
		private void moveDisks(int disks, int origin, int destination, int buffer){
			if(disks>0){
				moveDisks(disks-1, origin, buffer, destination);
				moveTopDisk(origin, destination);
				moveDisks(disks-1, buffer, destination, origin);
			}
		}
		
		private void moveTopDisk(int origin, int destination){
			mTowers[destination].addDisk(mTowers[origin].removeDisk());
		}
		   
		private class Tower{
			private List<Integer> mDisks;
			private int mTop;
			
			public Tower(){
				mDisks = new ArrayList<Integer>();
				mTop = -1;
			}
			
			public void addDisk(int disk){
				mDisks.add(disk);
				mTop++;
			}
			
			public int removeDisk(){
				if(mTop==-1){
					return -1;
				}
				return mDisks.remove(mTop--);
			}

			@Override
			public String toString() {
				StringBuffer tower = new StringBuffer(" ");
				for(Integer i:mDisks){
					tower.append(i + " ");
				}
				return tower.toString();
			}
		}
	}
}
