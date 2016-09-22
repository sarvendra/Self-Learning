import java.util.*;
import java.util.stream.*;

public class FindDups {
	public static void main(String[] args) {
		// Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
		// Set<String> distinctWords = new LinkedHashSet<>();
		// for (String str : args) {
		// 	distinctWords.add(str);
		// }
		// System.out.println(distinctWords);
		Set<String> unique = new HashSet<>();
		Set<String> dups = new HashSet<>();
		for (String str : args) {
			if (!unique.add(str)) {
				dups.add(str);
			}
		}
		unique.removeAll(dups);
		System.out.println(unique);
		System.out.println(dups);
	}
}