package com.corona.tracker.model;

public class Corona {
	private String lastUpdate;
	private String country;
	private String totalCases;
	private String newCases;
	private String totalDeaths;
	private String newDeaths;
	private String totalRecovered;
	private String activeCases;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(String totalCases) {
		this.totalCases = totalCases;
	}
	public String getNewCases() {
		return newCases;
	}
	public void setNewCases(String newCases) {
		this.newCases = newCases;
	}
	public String getTotalDeaths() {
		return totalDeaths;
	}
	public void setTotalDeaths(String totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	public String getNewDeaths() {
		return newDeaths;
	}
	public void setNewDeaths(String newDeaths) {
		this.newDeaths = newDeaths;
	}
	public String getTotalRecovered() {
		return totalRecovered;
	}
	public void setTotalRecovered(String totalRecovered) {
		this.totalRecovered = totalRecovered;
	}
	public String getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(String activeCases) {
		this.activeCases = activeCases;
	}
	@Override
	public String toString() {
		return "Corona [lastUpdate=" + lastUpdate + ", country=" + country + ", totalCases=" + totalCases
				+ ", newCases=" + newCases + ", totalDeaths=" + totalDeaths + ", newDeaths=" + newDeaths
				+ ", totalRecovered=" + totalRecovered + ", activeCases=" + activeCases + "]";
	}
}
