package io.objectbox.external.api;

import java.util.Optional;

/**
 * Enumerator that has all supported operation type. Used to associate to a URI endpoint.
 * @author Juan Ramos - ptjuanramos
 */
public enum QueryType {
	FIND("find"),
	FIND_WITH_OFFSET("findWithOffsetAndLimit"),
	FIND_IDS("findIds"),
	FIND_LAZY("findLazy"),
	FIND_UNIQUE("findUnique"),
	FIND_FIRST("findFirst"),
	COUNT("count"),
	REMOVE("remove"),
	PUBLISH("publish");
	
	private final String type;
	
	private QueryType(String type) {
		this.type = type;
	}
	
	public Optional<QueryType> getType(String type) {
		for (QueryType e : QueryType.values()) {
			if(e.type.equals(type)) {
				return Optional.of(e);
			}
		}
		
		return Optional.empty();
	}
}
