package com.example.coolweather.model;

public class Province {

	private int id;
	private String provinceName;
	private String provinceCode;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setProvinceName(String provinceName)
	{
		this.provinceName=provinceName;
	}
	public String getProvinceName()
	{
		return this.provinceName;
	}
	public void setProvinceCode(String provinceCode)
	{
		this.provinceCode=provinceCode;
	}
	public String getProvinceCode()
	{
		return this.provinceCode;
	}
}
