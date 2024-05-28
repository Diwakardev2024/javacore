package java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

		List<ConvertListIntoMap> noteLst = new ArrayList<>();
		noteLst.add(new ConvertListIntoMap(1, "note1", 11L));
		noteLst.add(new ConvertListIntoMap(2, "note2", 22L));
		noteLst.add(new ConvertListIntoMap(3, "note3", 33L));
		noteLst.add(new ConvertListIntoMap(4, "note4", 44L));
		noteLst.add(new ConvertListIntoMap(5, "note5", 55L));

		Map<String, Long> notesRecords = noteLst.stream()
				.sorted(Comparator.comparingLong(ConvertListIntoMap::getTagId).reversed())
				.collect(Collectors.toMap(ConvertListIntoMap::getNote, ConvertListIntoMap::getTagId,
						(oldValue, newValue) -> oldValue, LinkedHashMap::new));

		// Print the resulting map
		notesRecords.forEach((note, tagId) -> System.out.println(note + ": " + tagId));
	}
}
