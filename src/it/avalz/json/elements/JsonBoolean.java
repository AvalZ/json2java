package it.avalz.json.elements;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.visitors.JsonVisitor;

public class JsonBoolean extends JsonElement {

	JsonElementType type = JsonElementType.BOOLEAN;
	boolean element;
	
	public JsonBoolean(String value) {
		element = Boolean.valueOf(value);
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
	public Boolean getContent() {
		return this.element;
	}

	@Override
	public void setSerializer(JsonSerializer serializer) {
		this.serializer = serializer;
	}
}
