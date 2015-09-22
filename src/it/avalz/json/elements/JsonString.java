package it.avalz.json.elements;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.visitors.JsonVisitor;

public class JsonString extends JsonElement {

	JsonElementType type = JsonElementType.STRING;
	String element;
	
	public JsonString(String element) {
		this.element = element.replaceAll("\"", "").replaceAll("'", "");
	}

	@Override
	public String serialize() {
		return "\"" + element + "\"";
	}

	@Override
	public void accept(JsonVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String getContent() {
		return element;
	}

	@Override
	public void setSerializer(JsonSerializer serializer) {
		this.serializer = serializer;
	}

}
