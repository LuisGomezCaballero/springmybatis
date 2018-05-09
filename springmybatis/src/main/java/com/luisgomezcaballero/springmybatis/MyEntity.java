package com.luisgomezcaballero.springmybatis;

public class MyEntity {

	private Integer id;
	private String myString;

	public MyEntity() {
		super();
	}

	public MyEntity(Integer id, String myString) {
		super();
		this.id = id;
		this.myString = myString;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	@Override
	public String toString() {
		return "MyEntity [id=" + id + ", myString=" + myString + "]";
	}

}
