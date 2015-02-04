package com.bnsantos.chapter7;

import java.awt.Point;

public class Question5 {
	public static class Line{
		private final Point mStart;
		private final Point mEnd;
		
		public Line(Point start, Point end){
			mStart = start;
			mEnd = end;
		}

		public Point getStart() {
			return mStart;
		}

		public Point getEnd() {
			return mEnd;
		}
	}
	
	public static class Square{
		private final Point mTopRight;
		private final Point mBottomLeft;
		
		public Square(Point topRight, Point bottomLeft){
			mTopRight = topRight;
			mBottomLeft = bottomLeft;
		}
		
		public Point middle(){
			return new Point((mTopRight.x+mBottomLeft.x)/2, (mTopRight.y+mBottomLeft.y)/2);
		}
		
		public int getSize(){
			return Math.abs(mTopRight.x-mBottomLeft.x);
		}
		
		
		/**
		 * @param mid1 middle point of square 1
		 * @param mid2 middle point of square 2
		 * @param size 
		 * @return Return the point where the line segment connecting mid1 and mid2 intercepts the edge of square 1.
		 * That is, draw a line from mid2 to mid1, and continue it out until the edge of the square
		 */
		public Point extend(Point mid1, Point mid2, double size){
			double xdir = mid1.x < mid2.x ? -1:1;
			double ydir = mid1.y < mid2.y ? -1:1;
			
			if(mid1.x==mid2.x){
				return new Point(mid1.x, (int)(mid1.y+ydir*size/2));
			}
			
			double slope = (mid1.y-mid2.y)/(mid1.x-mid2.x);
			double x1=0;
			double y1=0;
			
			if(Math.abs(slope)==1){
				x1=mid1.x+xdir*size/2;
				y1=mid1.y+ydir*size/2;
			}else if(Math.abs(size)<1){
				x1=mid1.x+xdir*size/2;
				y1=slope*(x1-mid1.x)+mid1.y;
			}else{
				x1=(y1-mid1.y)/slope+mid1.x;
				y1=mid1.y+ydir*size/2;
			}
			return new Point((int)x1, (int)y1);
		}
		
		public Line cut(Square other){
			Point p1 = extend(this.middle(), other.middle(), getSize());
			Point p2 = extend(this.middle(), other.middle(), -1*getSize());
			Point p3 = extend(other.middle(), this.middle(), other.getSize());
			Point p4 = extend(other.middle(), this.middle(), -1*other.getSize());
			
			Point start = p1;
			Point end = p2;
			Point[] points = {p2, p3, p4};
			for(Point p: points){
				if(p.x<start.x||(p.x==start.x&&p.y<start.y)){
					start = p;
				}else if(p.x>end.x||(p.x==end.x&&p.y>end.y)){
					end = p;
				}
			}
			return new Line(start, end);
		}
	}
}
