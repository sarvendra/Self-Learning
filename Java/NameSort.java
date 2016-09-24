import java.util.*;

class Name  implements Comparable<Name> {
	private String firstName, lastName;

	public String firstName() {
		return this.firstName;
	}

	public String lastName(){
		return this.lastName;
	}

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int compareTo(Name n) {
		int lastNameCmp = lastName.compareTo(n.lastName);
		return lastNameCmp != 0 ? lastNameCmp : firstName.compareTo(n.firstName);
	}

	public String toString() {
		return firstName + " " + lastName;
    }
}

public class NameSort {
	public static void main(String[] args) {
		Name nameArray[] = {
            new Name("John", "Smith"),
            new Name("Karl", "Ng"),
            new Name("Jeff", "Smith"),
            new Name("Tom", "Rich")
        };

        List<Name> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
	}
}