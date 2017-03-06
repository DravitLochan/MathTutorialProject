package twoDShapes;

public class Rectangle extends Closed2DShapes{

	int length,breadth;
	
	@Override
	float surfaceArea() {
		
		return length*breadth;
	}

	@Override
	float perimeter() {
		
		return 2*(length+breadth);
	}
	
	int getLegnth()
	{
		return length;
	}
	
	int getBreadth()
	{
		return breadth;
	}
	
}
