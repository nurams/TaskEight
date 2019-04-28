package com.example.user.tugasapiprojek.model;

import java.util.List;

public class ResultsItem{
	private int shares;
	private double created;
	private Object composite;
	private List<MediaItem> media;
	private String id;
	private String title;
	private boolean hasaudio;
	private String url;
	private List<Object> tags;
	private String itemurl;

	public void setShares(int shares){
		this.shares = shares;
	}

	public int getShares(){
		return shares;
	}

	public void setCreated(double created){
		this.created = created;
	}

	public double getCreated(){
		return created;
	}

	public void setComposite(Object composite){
		this.composite = composite;
	}

	public Object getComposite(){
		return composite;
	}

	public void setMedia(List<MediaItem> media){
		this.media = media;
	}

	public List<MediaItem> getMedia(){
		return media;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setHasaudio(boolean hasaudio){
		this.hasaudio = hasaudio;
	}

	public boolean isHasaudio(){
		return hasaudio;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setTags(List<Object> tags){
		this.tags = tags;
	}

	public List<Object> getTags(){
		return tags;
	}

	public void setItemurl(String itemurl){
		this.itemurl = itemurl;
	}

	public String getItemurl(){
		return itemurl;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"shares = '" + shares + '\'' + 
			",created = '" + created + '\'' + 
			",composite = '" + composite + '\'' + 
			",media = '" + media + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",hasaudio = '" + hasaudio + '\'' + 
			",url = '" + url + '\'' + 
			",tags = '" + tags + '\'' + 
			",itemurl = '" + itemurl + '\'' + 
			"}";
		}
}