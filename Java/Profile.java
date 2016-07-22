public class Profile {
	public Name name;
	public String email;

	private class Name {
		public String firstName;
		public String lastName;

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