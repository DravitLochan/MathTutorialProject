package twoDShapes;

public class Triangle extends Closed2DShapes{

	float s1,s2,s3;
	@Override
	float surfaceArea() {
		float area=0;
		float s= (s1+s2+s3)/2;
		area= s*(s-s1)*(s-s2)*(s-s3);
		return area;
	}

	@Override
	float perimeter() {
		return s1+s2+s3;
	}

    boolean isValidTriangle()
    {
        if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1)
            return true;
        return false;
    
    }

}
