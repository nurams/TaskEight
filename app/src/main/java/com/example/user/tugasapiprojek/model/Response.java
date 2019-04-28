package com.example.user.tugasapiprojek.model;
import com.example.user.tugasapiprojek.model.ResultsItem;

import java.util.List;

public class Response {
	private String next;
	private List<ResultsItem> results;

	public void setNext(String next){
		this.next = next;
	}

	public String getNext(){
		return next;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"next = '" + next + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}