package twoDShapes;

public class Rectangle extends Closed2DShapes{

	int length,breadth;
	
	@Override
	int surfaceArea() {
		
		return length*breadth;
	}

	@Override
	int perimeter() {
		
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
