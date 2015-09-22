package it.avalz.json.elements;

import java.util.ArrayList;
import java.util.List;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.visitors.JsonVisitor;

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
	
	public List<JsonElement> getElement() {
		return this.element;
	}

	@Override
	public String serialize() {
		return serializer.serialize(this);
	}
	
	@Override
	public void setSerializer(JsonSerializer serializer) {
		this.serializer = serializer;
		for (JsonElement elem : element ) {
			elem.setSerializer(serializer);
		}
	};

	@Override
	public void accept(JsonVisitor visitor) {
		visitor.visit(this);
		for (JsonElement elem : this.element) {
			elem.accept(visitor);
		}
	}

	@Override
	public List<JsonElement> getContent() {
		return this.element;
	}
}
