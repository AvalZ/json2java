package it.avalz.json.parser;

import java.io.FileNotFoundException;

import it.avalz.json.elements.JsonElement;
import it.avalz.json.elements.serializers.JsonSerializer;
import it.avalz.json.elements.serializers.OneLineSerializer;
import it.avalz.json.elements.serializers.PrettySerializer;
import it.avalz.json.visitors.JsonLeavesVisitor;
import it.avalz.json.visitors.JsonVisitor;
import it.avalz.json.visitors.TestJsonVisitor;

public class ExampleParser {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		JsonParser parser = new JsonParser(System.in);
		
		JsonElement elem = parser.start();
		
		JsonVisitor testVisitor = new TestJsonVisitor();
		
		
		JsonSerializer prettySerializer = new PrettySerializer();
		elem.setSerializer(prettySerializer);
		
		System.out.println(elem.serialize());

		JsonSerializer oneLineSerializer = new OneLineSerializer();
		elem.setSerializer(oneLineSerializer);

		System.out.println(elem.serialize());

		elem.accept(testVisitor);
		System.out.println(testVisitor.getVisitLog());
	}


}
