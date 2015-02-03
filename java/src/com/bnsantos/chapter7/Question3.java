package com.bnsantos.chapter7;

public class Question3 {
	public static class Line{
		static final double epsilon = 0.000001;
		public double slope;
		public double yintercept;
		
		public Line(double slope, double y){
			this.slope = slope;
			this.yintercept = y;
		}
		
		public boolean intersect(Line line){
			return Math.abs(slope-line.slope)>epsilon||Math.abs(yintercept-line.yintercept)<epsilon;
		}
	}

}
