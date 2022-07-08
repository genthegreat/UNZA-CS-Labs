class SimpleCircle {
	private double radius = 1;
	
	private static int numberOfObjects = 0;
	
	public SimpleCircle(){
		numberOfObjects++;
	}
	
	public SimpleCircle(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	public void setRadius(double newRadius){
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
}