package de.citec.sc.lemon.vocabularies;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;

/**
 * @author Alessandro Di Diego
 */
public class OILS {
	private static Model defaultModel = ModelFactory.createDefaultModel();

	public static Property boundTo = defaultModel.createProperty("http://lemon-model.net/oils#boundTo");
	public static Property degree = defaultModel.createProperty("http://lemon-model.net/oils#degree");

}
