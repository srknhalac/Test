package rt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class Main {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("a"));
		list.add(new Customer("b"));
		list.add(new Customer("c"));
		list.add(new Customer("d"));

		Map<String, List<Customer>> map = new HashMap<>();
		map.put("a", list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Customer customer = (Customer) iterator.next();
			System.out.println(customer.getName());
		}

	}

}
