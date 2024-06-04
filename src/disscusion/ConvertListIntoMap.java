package disscusion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class ConvertListIntoMap {

//	 How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
	private int no;
	private String note;
	private Long tagId;

	public Long getTagId() {
		return tagId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public ConvertListIntoMap(int no, String note, Long tagId) {
		this.no = no;
		this.note = note;
		this.tagId = tagId;
	}

	public static void main(String[] args) {

		List<ConvertListIntoMap> notes = new ArrayList<>();
		notes.add(new ConvertListIntoMap(1, "note1", 11L));
		notes.add(new ConvertListIntoMap(2, "note2", 22L));
		notes.add(new ConvertListIntoMap(3, "note3", 33L));
		notes.add(new ConvertListIntoMap(4, "note4", 44L));
		notes.add(new ConvertListIntoMap(5, "note5", 55L));

		Map<String, Long> notesRecords = notes.stream()
				.sorted(Comparator.comparingLong(ConvertListIntoMap::getTagId).reversed())
				.collect(Collectors.toMap(x -> x.getNote(), t -> t.getTagId(), (p, q) -> q, () -> new LinkedHashMap()));

//		finalList.add(new ConvertListIntoMap(11, "Test", 23L));

		// Print the resulting map
//		notesRecords.forEach((note, tagId) -> System.out.println(note + ": " + tagId));

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(10, "Test10");
		map.put(11, "Test11");
		map.put(12, "Test12");
		map.put(13, "Test13");
		map.put(14, "Test14");
		map.put(15, "Test15");
		map.put(16, "Test16");
		map.put(17, "Test17");

		Consumer<Object> printConsumer = (key) -> {
			System.out.print(key + " ");
			// email
			// sms
			// database
		};
		Consumer<Integer> encConsumer = (key) -> {
			System.out.print(key + 5 + " " + map.get(key) + ", ");
			// email
			// sms
			// database
		};
		Consumer<Entry<Integer, String>> entryConsumer = (entry) -> {
			System.out.print(entry.getKey() + ":" + entry.getValue() + ",");
			// email
			// sms
			// database
		};
//		map.keySet().stream().forEach(encConsumer); // Stream of keys
//		map.values().stream().forEach(printConsumer); // Stream of values
//		map.entrySet().stream().forEach(entryConsumer); // Stream of entry - key & value together

		Optional<Long> dataOpt = Optional.ofNullable(notesRecords.get("note51"));
		if (dataOpt.isPresent()) {
			dataOpt.get().floatValue();
		}

		Long data = notesRecords.get("note51");
//		if(data != null) {
//			data.floatValue();
//		}
		
		String output = getProcessedData(1);
		if(output != null)
			System.out.println(output.toUpperCase());
		
		
		Optional<String> outputOpt = getProcessedData1(1);
		outputOpt.ifPresent(d -> d.toUpperCase());

		Optional<Integer> optionalNumber = Optional.of(10);

        Optional<Integer> filteredNumber = optionalNumber.filter(num -> num > 5);
        System.out.println(filteredNumber);
        
        Optional<String> optionalValue = Optional.of("Hello");

        Optional<String> result = optionalValue.flatMap(value ->   Optional.of(" World"));
        System.out.println(result);
        
        Optional<String> firstName = Optional.of("John");
        Optional<String> lastName = Optional.of("Doe");

        Optional<String> fullName = firstName.flatMap(fName ->  lastName.map(x -> "Hello" + fName + x.toUpperCase()));
        
        optionalValue.flatMap(str -> Optional.of(str.length()) ).flatMap(length ->   Optional.of(length * 2));
	}

	public static String getProcessedData(int choice) {
		switch (choice) {
		case 0:
			return "Processed Data - You are safe.";
		default:
			return null;
		}
	}
	
	public static Optional<String> getProcessedData1(int choice) {
		switch (choice) {
		case 0:
			return Optional.of("Processed Data - You are safe.");
		default:
			return Optional.empty();
		}
		
		
		// Comparator
//		 Map<String, Integer> map1 = new HashMap<>();
//	        map1.put("apple", 3);
//	        map1.put("banana", 2);
//	        map1.put("cherry", 1);
	        
//	        Comparator<Integer> sp=new Comparator<Integer>() {
//				
//				@Override
//				public int compare(Integer o1, Integer o2) {
//					
//					return o1 - o2;
//				}
//			};
//			
//			Comparator<Integer> comp = (a,b) -> a -b;
					
					
	        // Step 2: Sort the entries by value using the comparator
//	        List<Entry<String, Integer>> sortedEntries = map1.entrySet().stream()
//	        		.sorted(Compar)
//	        				.collect(Collectors.toList());
	            
	        // Print the sorted entries
//	        sortedEntries.forEach(entry -> 
//	            System.out.println(entry.getKey() + ": " + entry.getValue())
		
	}
}
