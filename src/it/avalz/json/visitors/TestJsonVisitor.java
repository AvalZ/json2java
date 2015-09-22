package it.avalz.json.visitors;

import it.avalz.json.elements.JsonArray;
import it.avalz.json.elements.JsonBoolean;
import it.avalz.json.elements.JsonFloat;
import it.avalz.json.elements.JsonInteger;
import it.avalz.json.elements.JsonObject;
import it.avalz.json.elements.JsonString;

public class TestJsonVisitor extends JsonVisitor {

	@Override
	public void visit(JsonArray element) {
		this.log("Visited array: " + element.serialize());
	}

	@Override
	public void visit(JsonBoolean element) {
		this.log("Visited boolean: " + element.serialize());
	}

	@Override
	public void visit(JsonFloat element) {
		this.log("Visited float: " + element.serialize());
	}

	@Override
	public void visit(JsonInteger element) {
		this.log("Visited integer: " + element.serialize());
	}

	@Override
	public void visit(JsonObject element) {
		this.log("Visited object: " + element.serialize());
	}

	@Override
	public void visit(JsonString element) {
		this.log("Visited string: " + element.serialize());
	}

}
