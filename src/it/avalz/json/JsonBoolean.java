package it.avalz.json;

public class JsonBoolean extends JsonElement {

	JsonElementType type = JsonElementType.BOOLEAN;
	boolean element;
	
	public JsonBoolean(String value) {
		element = Boolean.valueOf(value);
	}

	@Override
	public String serialize() {
		return String.valueOf(element);
	}
}
