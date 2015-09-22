package it.avalz.json.elements.serializers;

import it.avalz.json.elements.JsonArray;
import it.avalz.json.elements.JsonElement;
import it.avalz.json.elements.JsonObject;

public class PrettySerializer extends OneLineSerializer {

	int depth = 0;
	static String indent = "  ";

	public String serialize(JsonObject element) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("{").append('\n');
		this.depth++;

		for (String key : element.getContent().keySet()) {
			for (int i = 0; i < this.depth; i++) {
				sb.append(indent);
			}
			sb.append(key).append(": ").append(element.get(key).serialize()).append(",").append('\n');
		}
		sb.setLength(sb.length() - 2); // remove ",\n"
		sb.append('\n');

		this.depth--;
		for (int i = 0; i < this.depth; i++) {
			sb.append(indent);
		}
		
		sb.append("}");
		
		return sb.toString();
	}
	
	public String serialize(JsonArray element) {
		StringBuilder sb = new StringBuilder();

		sb.append("[").append('\n');
		this.depth++;
		
		for (JsonElement elem : element.getElement()) {
			for (int i = 0; i < this.depth; i++) {
				sb.append(indent);
			}
			sb.append(elem.serialize()).append(",").append('\n');
		}
		sb.setLength(sb.length() - 2); // remove ",\n"
		sb.append('\n');

		this.depth--;
		for (int i = 0; i < this.depth; i++) {
			sb.append(indent);
		}
		sb.append("]");

		return sb.toString();	
	}
}
