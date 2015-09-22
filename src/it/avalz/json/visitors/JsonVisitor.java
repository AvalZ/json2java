package it.avalz.json.visitors;

import it.avalz.json.elements.*;

public abstract class JsonVisitor {
	
	String visitLog = "";

	public abstract void visit(JsonArray element);
	public abstract void visit(JsonBoolean element);
	public abstract void visit(JsonFloat element);
	public abstract void visit(JsonInteger element);
	public abstract void visit(JsonObject element);
	public abstract void visit(JsonString element);
	
	public void log(String line) {
		this.visitLog += line;
		this.visitLog += '\n';
	}

	public String getVisitLog() {
		return visitLog;
	}
}
