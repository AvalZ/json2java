package it.avalz.json.visitors;

import java.util.ArrayList;
import java.util.List;

import it.avalz.json.elements.JsonArray;
import it.avalz.json.elements.JsonBoolean;
import it.avalz.json.elements.JsonElement;
import it.avalz.json.elements.JsonFloat;
import it.avalz.json.elements.JsonInteger;
import it.avalz.json.elements.JsonObject;
import it.avalz.json.elements.JsonString;

public class JsonLeavesVisitor extends JsonVisitor {
	
	List<JsonElement> elements = new ArrayList<>();

	@Override
	public void visit(JsonArray element) { }

	@Override
	public void visit(JsonBoolean element) {
		this.elements.add(element);
	}

	@Override
	public void visit(JsonFloat element) {
		this.elements.add(element);
	}

	@Override
	public void visit(JsonInteger element) {
		this.elements.add(element);
	}

	@Override
	public void visit(JsonObject element) { }

	@Override
	public void visit(JsonString element) {
		this.elements.add(element);
	}

	public List<JsonElement> getList() {
		return this.elements;
	}
}
