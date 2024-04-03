package com.javaex.api.generic;

// 모든 객체를 담을 수 있는 객체
public class ObjectBox {			// object는 모든 객체의 부모여서 모든 객체를 다 담을 수 있다
	
	Object content;

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
}
