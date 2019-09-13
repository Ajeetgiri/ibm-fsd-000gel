package list;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	private Map<String, String> map;

	public MapDemo() {
		super();
		map = new HashMap<String, String>();
		map.put("Nmae", "Ajeet");
		map.put("Phone", "7067574915");
		map.keySet();
		System.out.println(map.values());
	}

	public void CreateMap() {
		

	}

	public void getKeyValue() {
		
	}

	public void getMapValue() {
		
	}
	
	public static void main(String[] args) {
		MapDemo m = new MapDemo();
		
	}
}