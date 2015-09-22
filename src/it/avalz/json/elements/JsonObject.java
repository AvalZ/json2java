package it.avalz.json.elements;

import java.util.HashMap;
import java.util.Map;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.visitors.JsonVisitor;

public class JsonObject extends JsonElement {

	JsonElementType type = JsonElementType.OBJECT;
	Map<String,JsonElement> element;

	public JsonObject(Map<String,JsonElement> value) {
		this.element = new HashMap<>(value);
	}
	
	public JsonElement get(String key) {
		return this.element.get(key);
	}

	public void put(String key, JsonElement value) {
		this.element.put(key, value);
	}
	
	public void setSerializer(JsonSerializer serializer) {
		this.serializer = serializer;
		for (JsonElement elem : element.values()) {
			elem.setSerializer(serializer);
		}
	};
	
	@Override
	public String serialize() {
		return serializer.serialize(this);
	}

	@Override
	public void accept(JsonVisitor visitor) {
		visitor.visit(this);
		for (String key : this.element.keySet()) {
			this.element.get(key).accept(visitor);
		}
	}

	@Override
	public Map<String,JsonElement> getContent() {
		return this.element;
	}

}
