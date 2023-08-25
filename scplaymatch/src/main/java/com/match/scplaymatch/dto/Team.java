package com.match.scplaymatch.dto;

import java.sql.Date;

public class Team {

	private int no;
	private String t_name;
	private String t_sido;
	private String t_gugun;
	private float t_lat;
	private float t_lng;
	private String status;
	private String del_yn;
	private Date reg_date;
	private Date modi_date;
	private Date status_date;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_sido() {
		return t_sido;
	}
	public void setT_sido(String t_sido) {
		this.t_sido = t_sido;
	}
	public String getT_gugun() {
		return t_gugun;
	}
	public void setT_gugun(String t_gugun) {
		this.t_gugun = t_gugun;
	}
	public float getT_lat() {
		return t_lat;
	}
	public void setT_lat(float t_lat) {
		this.t_lat = t_lat;
	}
	public float getT_lng() {
		return t_lng;
	}
	public void setT_lng(float t_lng) {
		this.t_lng = t_lng;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getModi_date() {
		return modi_date;
	}
	public void setModi_date(Date modi_date) {
		this.modi_date = modi_date;
	}
	public Date getStatus_date() {
		return status_date;
	}
	public void setStatus_date(Date status_date) {
		this.status_date = status_date;
	}
	
}
