package com.codewithabhi.vlog;

import java.util.List;

public class State {

	private String statename;
	List<String>cityname;
	public State(String statename, List<String> cityname) {
		super();
		this.statename = statename;
		this.cityname = cityname;
	}
	public State() {
		super();
	}
	@Override
	public String toString() {
		return "State [statename=" + statename + ", cityname=" + cityname + "]";
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public List<String> getCityname() {
		return cityname;
	}
	public void setCityname(List<String> cityname) {
		this.cityname = cityname;
	}
	
	
}
