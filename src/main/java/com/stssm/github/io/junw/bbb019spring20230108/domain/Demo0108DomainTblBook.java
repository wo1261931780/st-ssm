package com.stssm.github.io.junw.bbb019spring20230108.domain;

public class Demo0108DomainTblBook {
	private Integer id;

	private String type;

	private String name;

	private String description;

	public Demo0108DomainTblBook() {
	}

	public Demo0108DomainTblBook(Integer id, String type, String name, String description) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Demo0108DomainTblBook{" +
				       "id=" + id +
				       ", type='" + type + '\'' +
				       ", name='" + name + '\'' +
				       ", description='" + description + '\'' +
				       '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
