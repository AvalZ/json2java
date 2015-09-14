package it.avalz.json;

import java.util.ArrayList;
import java.util.List;

public class JsonArray extends JsonElement {

	JsonElementType type = JsonElementType.ARRAY;
	List<JsonElement> element;
	
	public JsonArray(List<JsonElement> value) {
		this.element = new ArrayList<>(value);
	}

	public JsonArray() {
		this(new ArrayList<JsonElement>());
	}
	
	public void add(JsonElement element) {
		this.element.add(0, element);
	}

	@Override
	public String serialize() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		boolean first = true;
		for (JsonElement elem : element) {
			if (first == true) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append(elem.serialize());
		}
		sb.append("]");
		
		return sb.toString();

	}
}
