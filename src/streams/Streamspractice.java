package streams;

import java.util.Arrays;
import java.util.List;

public class Streamspractice {

	public static void main(String[] args) {
		List<String> people = Arrays.asList("Michael", "Dean", "james", "chris");
		List<Integer> nums = Arrays.asList(3, 4, 7, 8, 12);

		people.stream().map(i -> "Hello world " + i).forEach(System.out::println);

	}
}
