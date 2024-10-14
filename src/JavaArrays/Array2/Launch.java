package JavaArrays.Array2;

class ScalerAcadamy
{
	private String courseName;
	private int courseCost;
	private String city;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseCost() {
		return courseCost;
	}
	public void setCourseCost(int courseCost) {
		this.courseCost = courseCost;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ScalerAcadamy(String courseName, int courseCost, String city) {
		super();
		this.courseName = courseName;
		this.courseCost = courseCost;
		this.city = city;
	}
	public ScalerAcadamy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "ScalerAcademy {courseName=" + courseName + ", courseCost=" + courseCost + ", city=" + city + "}";
	}
		
}
public class Launch
{

	public static void main(String[] args) 
	{
		ScalerAcadamy t=new ScalerAcadamy("JavaBackend",3000,"Bengaluru");
		System.out.println(t);
		
//		int age=10;
//		System.out.println("age");
//		System.out.println(t.getCourseCost());
//		System.out.println(t.getCity());
//		System.out.println(t.getCourseName());
		

	}

}
/*toString()*/