package it.avalz.json.elements;

import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.elements.serializers.OneLineSerializer;
import it.avalz.json.visitors.JsonVisitor;

public abstract class JsonElement {

	JsonElementType type;
	JsonSerializer serializer = new OneLineSerializer();
	
	public JsonElementType getType() {
		return type;
	}
	
	/**
	 * Sets new serializer.
	 * 
	 * The serializer is assigned recursively if needed
	 * (for example if the method is called on an Object
	 * or on an Array)
	 * @param serializer The strategy used for serializing
	 */
	public abstract void setSerializer(JsonSerializer serializer);
	
	public abstract Object getContent();
	
	/**
	 * Serializes the JSON element.
	 * 
	 * Serialization technique can be modified by setting a new
	 * serializer
	 * 
	 * @see #setSerializer(JsonSerializer serializer)
	 * @return A string representing the serialized JSON structure
	 */
	public abstract String serialize();
	
	public abstract void accept(JsonVisitor visitor);
}
