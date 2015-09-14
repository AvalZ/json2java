package it.avalz.json;

public abstract class JsonElement {

	public JsonElementType type;
	
	public JsonElementType getType() {
		return type;
	};
	
	public abstract String serialize();
}
