package javaversion;

interface Polygon 
{
	
	//abstract method of interface
	void getArea(int length,int breath);
	
}

//implement the polygon interface.
class Rectangle implements Polygon {
	
	//implementaion of abstract method
    public void getArea(int length,int breath)
    {
    	System.out.println("The area of rectangle is: "+(length*breath));
    }

}

