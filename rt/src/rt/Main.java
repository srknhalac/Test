package rt;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> list = List.of("ali","veli");
		List<Boolean> map=list.stream().map(i->i.equals("ali")).collect(Collectors.toList());
		System.out.println(map);
	}
}
