package it.avalz.json.elements;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.visitors.JsonVisitor;

public class JsonFloat extends JsonElement {

	public JsonElementType type = JsonElementType.FLOAT;
	float element;
	
	public JsonFloat(String value) {
		this.element = Float.parseFloat(value);
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
	public Float getContent() {
		return this.element;
	}


	@Override
	public void setSerializer(JsonSerializer serializer) {
		this.serializer = serializer;
	}

}
