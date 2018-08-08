package com.study.pattern02.stretegy3;

public abstract class Database {

	public String name;
	public double rows;
	
	//데이터베이스 마다 접속 방식이 다르다.
	public abstract void connectDatabase();

}
