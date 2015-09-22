package it.avalz.json.elements.serializers;

import it.avalz.json.elements.JsonArray;
import it.avalz.json.elements.JsonBoolean;
import it.avalz.json.elements.JsonElement;
import it.avalz.json.elements.JsonFloat;
import it.avalz.json.elements.JsonInteger;
import it.avalz.json.elements.JsonObject;
import it.avalz.json.elements.JsonString;

/**
 * A simple one-line serializer.
 * 
 * It serializes a JSON structure in one single line.
 * 
 * @author avalz
 *
 */
public class OneLineSerializer implements JsonSerializer {

	@Override
	public String serialize(JsonArray element) {
		StringBuilder sb = new StringBuilder();

		sb.append("[");
		boolean first = true;
		for (JsonElement elem : element.getElement()) {
			if (first == true) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append(elem.serialize());
		}
		sb.append("]");

		return sb.toString();
	}
	@Override
	public String serialize(JsonBoolean element) {
		return String.valueOf(element.getContent());
	}
	@Override
	public String serialize(JsonFloat element) {
		return String.valueOf(element.getContent());
	}
	@Override
	public String serialize(JsonInteger element) {
		return String.valueOf(element.getContent());
	}
	@Override
	public String serialize(JsonObject element) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("{");
		
		boolean first = true;
		for (String key : element.getContent().keySet()) {
			if (first == true) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append(key).append(":").append(element.get(key).serialize());
			
		}
		
		sb.append("}");
		
		return sb.toString();
	}
	@Override
	public String serialize(JsonString element) {
		return "\"" + element.getContent() + "\"";
	}
}
