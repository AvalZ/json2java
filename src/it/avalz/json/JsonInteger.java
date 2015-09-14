package it.avalz.json;

public class JsonInteger extends JsonElement {

	JsonElementType type = JsonElementType.INTEGER;
	int element;
	
	public JsonInteger(String value) {
		element = Integer.parseInt(value);
	}

	@Override
	public String serialize() {
		// TODO Auto-generated method stub
		return String.valueOf(element);
	}
}
