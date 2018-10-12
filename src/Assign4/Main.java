package Assign4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Joy", 34543);
		map.put("Jack", 56765);
		map.put("Tina", 34567);

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		if (map.containsValue(3443)) {
			System.out.println("Số 3443 CO tồn tại trong sổ ghi nhớ");
		} else {
			System.out.println("Số 3443 KHONG tồn tại trong sổ ghi nhớ");
		}
		if (map.containsKey("Jack")) {
			System.out.println("Mẫu tin của Jack CO hiện hữu trong sổ ghi nhớ");
		} else {
			System.out.println("Mẫu tin của Jack KHONG hiện hữu trong sổ ghi nhớ");
		}
		System.out.println("So dien thoai cua TINA la: " + map.get("Tina"));
		map.remove("Joy");
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
