package Quiz3;

public class Triangle {
		private double side1 = 1.0;
		private double side2 = 1.0;
		private double side3 = 1.0;
		public Triangle(){	
		}
		public Triangle(int s1,int s2,int s3){
			side1 = s1;
			side2 = s2;
			side3 = s3;
		}
		public double getSide1() {
			return side1;
		}
		public void setSide1(double side1) {
			this.side1 = side1;
		}
		public double getSide2() {
			return side2;
		}
		public void setSide2(double side2) {
			this.side2 = side2;
		}
		public double getSide3() {
			return side3;
		}
		public void setSide3(double side3) {
			this.side3 = side3;
		}
		public double getPerimeter(){
			return(side1+side2+side3);
		}
		public double getArea(){
			//using Heron's formula
			double p = (side1+side2+side3)/2.0;
			double Area = (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
			return Area;
		}
		@Override
		public String toString(){
			return("This triangle has an area of "+getArea()+" and a perimeter of "+getPerimeter());
		}
		
}
