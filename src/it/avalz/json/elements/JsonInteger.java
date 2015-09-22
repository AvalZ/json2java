package it.avalz.json.elements;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.visitors.JsonVisitor;

public class JsonInteger extends JsonElement {

	JsonElementType type = JsonElementType.INTEGER;
	int element;
	
	public JsonInteger(String value) {
		element = Integer.parseInt(value);
	}

	@Override
	public String serialize() {
		return serializer.serialize(this);
	}

	@Override
	public void accept(JsonVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public Integer getContent() {
		return this.element;
	}

	@Override
	public void setSerializer(JsonSerializer serializer) {
		this.serializer = serializer;
	}
}
