package com.cognixia.jump.coloneable;

public class CompositionObject {

	private String contents;
	
	CompositionObject(String contents){
		this.contents = contents;
	}

	public String getContents() {
		return contents;
	}

public void setContents(String contents) {
		this.contents = contents;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "CompositionObject [contents=" + contents + "]";
	}
}
