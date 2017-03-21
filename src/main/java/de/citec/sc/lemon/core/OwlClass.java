
package de.citec.sc.lemon.core;

/**
 * 
 * @author Alessandro Di Diego
 */

public class OwlClass implements Reference {

	String uri;
	String subClassOf;
	String boundTo;
	String degree;

	public OwlClass(String uri, String subClassOf, String boundTo, String degree) {
		this.uri = uri;
		this.subClassOf = subClassOf;
		this.boundTo = boundTo;
		this.degree = degree;
	}

	public String getURI() {
		return uri;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getSubClassOf() {
		return subClassOf;
	}

	public void setSubClassOf(String subClassOf) {
		this.subClassOf = subClassOf;
	}

	public String getBoundTo() {
		return boundTo;
	}

	public void setBoundTo(String boundTo) {
		this.boundTo = boundTo;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "OwlClass [uri=" + uri + ", subClassOf=" + subClassOf + ", boundTo=" + boundTo + ", degree=" + degree
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boundTo == null) ? 0 : boundTo.hashCode());
		result = prime * result + ((degree == null) ? 0 : degree.hashCode());
		result = prime * result + ((subClassOf == null) ? 0 : subClassOf.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OwlClass other = (OwlClass) obj;
		if (boundTo == null) {
			if (other.boundTo != null)
				return false;
		} else if (!boundTo.equals(other.boundTo))
			return false;
		if (degree == null) {
			if (other.degree != null)
				return false;
		} else if (!degree.equals(other.degree))
			return false;
		if (subClassOf == null) {
			if (other.subClassOf != null)
				return false;
		} else if (!subClassOf.equals(other.subClassOf))
			return false;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		return true;
	}

	

}
