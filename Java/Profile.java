public class Profile {
	public Name name;
	public String email;

	public class Name {
		public String firstName;
		public String lastName;
		public  static String middleName = "kumar";

		public String getFullName() {
			if (lastName == null) {
            	return firstName;
            } else if (firstName == null) {
                return lastName;
            } else {
                return firstName + " " + lastName;
            }
		}
	}
}