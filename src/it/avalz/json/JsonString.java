package it.avalz.json;

public class JsonString extends JsonElement {

	JsonElementType type = JsonElementType.STRING;
	String element;
	
	public JsonString(String element) {
		this.element = element.replaceAll("\"", "").replaceAll("'", "");
	}

	@Override
	public String serialize() {
		// TODO Auto-generated method stub
		return "\"" + element + "\"";
	}

}
