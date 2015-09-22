package it.avalz.json.elements;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.elements.serializers.OneLineSerializer;
import it.avalz.json.elements.serializers.PrettySerializer;
import it.avalz.json.visitors.JsonVisitor;

public abstract class JsonElement {

	JsonElementType type;
	JsonSerializer serializer = new PrettySerializer();

	
	public JsonElementType getType() {
		return type;
	}
	
	public abstract void setSerializer(JsonSerializer serializer);
	
	public abstract Object getContent();
	
	public abstract String serialize();
	
	public abstract void accept(JsonVisitor visitor);
}
