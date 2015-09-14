package it.avalz.json;

public class JsonFloat extends JsonElement {

	public JsonElementType type = JsonElementType.FLOAT;
	float element;
	
	public JsonFloat(String value) {
		this.element = Float.parseFloat(value);
	}

	@Override
	public String serialize() {
		return String.valueOf(element);
	}

}
