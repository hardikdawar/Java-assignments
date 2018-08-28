 class Demo
{
	public void show()
	{
		System.out.println("This class cannot be extended further.");
	}
}
class Derived extends Demo
{
}
public class LastClass
{
	public static void main(String[] x)
	{
		Derived obj = new Derived();
		obj.show();
	}
}

