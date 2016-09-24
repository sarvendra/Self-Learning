import java.util.*;

public class Freq {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String arg : args) {
			Integer freq = map.get(arg);
			map.put(arg, freq == null ? 1 : freq + 1);
		}
		System.out.println(map);
	}
}