package it.avalz;

import java.io.FileNotFoundException;

import it.avalz.json.JsonElement;

public class ExampleParser {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		JsonParser parser = new JsonParser(System.in);
		
		JsonElement elem = parser.start();
		
		System.out.println(elem.serialize());
	}


}
