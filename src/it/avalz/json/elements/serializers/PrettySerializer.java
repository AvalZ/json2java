package it.avalz.json.elements.serializers;

import it.avalz.json.elements.JsonArray;
import it.avalz.json.elements.JsonElement;
import it.avalz.json.elements.JsonObject;

/**
 * Serializes the JSON structure in a readable format using indentation.
 * 
 * @author avalz
 *
 */
public class PrettySerializer extends OneLineSerializer {

	int depth = 0;
	String indent;

	/**
	 * Create a PrettySerializer object and choose the indentation value (tab, space, double space, ecc.)
	 * @param indent Indentation value
	 */
	public PrettySerializer(String indent) {
		this.indent = indent;
	}

	/**
	 * Create a PrettySerializer object and set the indentation value to double space
	 * @param indent Indentation value
	 */
	public PrettySerializer() {
		this("  ");
	}
	/**
	 * Modifies the indent character.
	 * 
	 * Common values are \t, space or other special characters.
	 * @param indent
	 */
	public void setIndentValue(String indent) {
		this.indent = indent;
	}

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
		if (sb.length() > 2) sb.setLength(sb.length() - 2); // remove ",\n" if object not empty

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
		if (sb.length() > 2) sb.setLength(sb.length() - 2); // remove ",\n" if object not empty
		sb.append('\n');

		this.depth--;
		for (int i = 0; i < this.depth; i++) {
			sb.append(indent);
		}
		sb.append("]");

		return sb.toString();	
	}
}
