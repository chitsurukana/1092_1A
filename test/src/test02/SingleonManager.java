package test02;

import java.util.HashMap;
import java.util.Map;
// 2.6.5 使用容器實作單例模式 p.31
public class SingleonManager {
	private static Map<String, Object> objMap = new HashMap<String, Object>();
	
	private Singleon() {}
	public static void registerService(String key, Objectinstance) {
		if(!objMap.containsKey(key)) {
			obMap.put(key, instance);
		}
	}
	public static ObjectgetService(String key) {
		return objMap.get(key);
	}
}
