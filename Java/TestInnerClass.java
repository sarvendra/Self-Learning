public class TestInnerClass {
	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.name = profile.new Name();
		profile.name.firstName = "Sarvendra";
		profile.name.lastName = "Anand";
		profile.email = "Sarvendraanand@gmail.com";
		System.out.println(profile.name.getFullName() + " " + profile.email);
		System.out.println("middle name " + profile.name.middleName);

		// Name name = new Name();
		// name.firstName = "Ramesh";
		// name.lastName = "Suresh";
		// System.out.println(name.getFullName());
	}
}