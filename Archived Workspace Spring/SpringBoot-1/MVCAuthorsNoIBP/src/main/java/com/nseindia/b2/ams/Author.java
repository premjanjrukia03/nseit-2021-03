package com.nseindia.b2.ams;

public class Author {
	private Integer id;
	private String name;
//	private Set<String> books;
	
//	----------------------------------------------Constructors------------------------------------------------
	
	
	public Author() {
		
	}
	

	
	public Author(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



//	----------------------------------------------Getters and Setters------------------------------------------------
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
//	----------------------------------------------toString------------------------------------------------
	
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
