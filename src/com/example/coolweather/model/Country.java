package com.example.coolweather.model;

public class Country {

	private int id;
	private String countryName;
	private String countryCode;
	private int cityId;
	public int getId()
	{
		return this.id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getCountryName()
	{
		return this.countryName;
	}
	public void setCountryName(String countryName)
	{
		this.countryName=countryName;
	}
	public String getCountryCode()
	{
		return this.countryCode;
	}
	public void setCountryCode(String countryCode)
	{
		this.countryCode=countryCode;
	}
	public int getCityId()
	{
		return this.cityId;
	}
	public void setCityId(int cityId)
	{
		this.cityId=cityId;
	}
}
