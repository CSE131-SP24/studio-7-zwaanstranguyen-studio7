package studio7;

public class rectangle {

private double length;
private double width;
private double area;
private double perimeter;
private boolean square;
// private double newarea;

public rectangle(double l, double w) {
	length = l;
	width = w;
	area = length*width;
	perimeter = (2*length)+(2*width);
	square = length==width;
	
	
}

public double getArea() {
	return area;
}

public void printer() {
	System.out.println("length:" + length);
	System.out.println("width:" + width);
	System.out.println("area:" + area);
	System.out.println("perimeter:" + perimeter);
	if (square == true) {
		System.out.println("This rectangle is a square");
	}
	else {
		System.out.println("This rectangle is not a square");
	}
	}


public static void isBigger(rectangle r, rectangle r2) {
	if (r.getArea()>r2.getArea()) {
		System.out.println("The first rectangle has a bigger area than the second rectangle");
	} else if (r.getArea()==r2.getArea()) {
		System.out.println("The first rectangle has the same area as the second rectangle");
	}
	else {
		System.out.println("The first rectangle has a smaller area than the second rectangle");
	}
}


public static void main (String[] args) {
	rectangle r = new rectangle(4.0,3.0);
	rectangle r2 = new rectangle(5.0,3.0);
	r.printer();
	isBigger(r, r2);
}

}
