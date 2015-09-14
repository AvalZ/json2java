package it.avalz.json;

import java.util.HashMap;
import java.util.Map;

public class JsonObject extends JsonElement {

	JsonElementType type = JsonElementType.OBJECT;
	Map<String,JsonElement> element;

	public JsonObject(Map<String,JsonElement> value) {
		this.element = new HashMap<>(value);
	}
	
	public JsonElement get(String key) {
		return this.element.get(key);
	}

	public void put(String key, JsonElement value) {
		this.element.put(key, value);
	}
	
	@Override
	public String serialize() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("{");
		
		boolean first = true;
		for (String key : element.keySet()) {
			if (first == true) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append(key).append(":").append(element.get(key).serialize());
			
		}
		
		sb.append("}");
		
		return sb.toString();
	}

}
