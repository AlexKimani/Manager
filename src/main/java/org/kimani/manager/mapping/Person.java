package org.kimani.manager.mapping;

import java.io.Serializable;

/**
 * Created by alex on 8/15/14.
 */
public class Person implements Serializable {
	private static final long serialVersionID =1L;

	private Integer personId;
	private String personName;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Person() {

	}

	public Person(String personName) {
		this.personName = personName;
	}

}
