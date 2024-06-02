package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyOptional extends RuntimeException {

	public static Optional<String> findFirstNonEmpty(List<Optional<String>> optionals) {

		Optional<String> optFirst = optionals.stream().filter(opt -> opt.isPresent()).findFirst()
				.orElse(Optional.empty());

		return optFirst;
	}

	public static String getValueorDefault(Optional<String> optional) {

		return optional.orElse("default value");
	}

	// Write a method that takes an Optional<Integer> and returns the value if
	// present; otherwise, throw a custom NoValuePresentException.

	public FirstNonEmptyOptional(String message) {
		super(message);
	}

	public static Integer getValueOrThrow(Optional<Integer> optional) {

		return optional.orElseThrow(() -> new FirstNonEmptyOptional("No value present in the optional"));
	}

	public static void main(String[] args) {

		Optional<String> optional = Optional.empty();

		Optional<Integer> optional1 = Optional.empty();

		List<Optional<String>> optionals = Arrays.asList(Optional.empty(), Optional.empty(), Optional.of("Hello"),
				Optional.of("World"));
		Optional<String> out = findFirstNonEmpty(optionals);
		System.out.println(out);

		// get a value
		System.out.println(getValueorDefault(optional));

		try {
			Integer in = getValueOrThrow(optional1);
			System.out.println(in);
		} catch (FirstNonEmptyOptional e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}

}
