package twoDShapes;

public class Rectangle extends Closed2DShapes{

	float length,breadth;
	
	@Override
	float surfaceArea() {
		
		return length*breadth;
	}

	@Override
	float perimeter() {
		
		return 2*(length+breadth);
	}
	
	float getLegnth()
	{
		return length;
	}
	
	float getBreadth()
	{
		return breadth;
	}
	
}
