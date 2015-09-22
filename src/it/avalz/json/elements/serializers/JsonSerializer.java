package it.avalz.json.elements.serializers;

import it.avalz.json.elements.JsonArray;
import it.avalz.json.elements.JsonBoolean;
import it.avalz.json.elements.JsonFloat;
import it.avalz.json.elements.JsonInteger;
import it.avalz.json.elements.JsonObject;
import it.avalz.json.elements.JsonString;

/**
 * Interface for JSON Serializers.
 * 
 * Implements a Strategy pattern.
 *
 * 
 * @see JsonElement.serialize()
 * @see JsonElement.setSerializer(JsonSerializer serializer)
 * @author avalz
 *
 */
public interface JsonSerializer {

	String serialize(JsonArray element);
	String serialize(JsonBoolean element);
	String serialize(JsonFloat element);
	String serialize(JsonInteger element);
	String serialize(JsonObject element);
	String serialize(JsonString element);
}
