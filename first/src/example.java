
public class example {

	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	public static void main(String[] args) {
		String gender1;
		String gender2;
		gender1 = MALE;
		gender2 = example.MALE;
		System.out.println(gender1);
		System.out.println(gender2);
		
		Gender gender3;
		gender3 = Gender.MALE;
		gender3 = Gender.FEMALE;
		
	}

}
enum Gender{
	MALE, FEMALE;
}