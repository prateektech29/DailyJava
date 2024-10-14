package JavaArrays.Array2;

class Student
{
	int id;
	String name;
	String course;
}


public class LaunchArray3
{

	public static void main(String[] args) 
	{
		Student[]arr=new Student[3];
		
		arr[0]=new Student();
		arr[1]=new Student();
		arr[2]=new Student();
		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=new Student();
//		}
		
		arr[0].id=1;
		arr[0].name="Rohan";
		arr[0].course="Java";
		
		System.out.println(arr[0].id);

		System.out.println(arr[0].name);

		System.out.println(arr[0].course);
		System.out.println(arr[0]);

	}

}
/*Array - non-primitive type*/