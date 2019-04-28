package com.example.user.tugasapiprojek.model;

import java.util.List;

public class Loopedmp4{
	private double duration;
	private String preview;
	private List<Integer> dims;
	private int size;
	private String url;

	public void setDuration(double duration){
		this.duration = duration;
	}

	public double getDuration(){
		return duration;
	}

	public void setPreview(String preview){
		this.preview = preview;
	}

	public String getPreview(){
		return preview;
	}

	public void setDims(List<Integer> dims){
		this.dims = dims;
	}

	public List<Integer> getDims(){
		return dims;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Loopedmp4{" + 
			"duration = '" + duration + '\'' + 
			",preview = '" + preview + '\'' + 
			",dims = '" + dims + '\'' + 
			",size = '" + size + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}