package com.match.scplaymatch.dto;

import java.sql.Date;

public class Member {

	private int no;
	private String name;
	private String phone;
	private String zipcode;
	private String addr;
	private String addr_dtl;
	private String position;
	private String team_no;
	private String mngr_yn;
	private Date reg_date;
	private String del_yn;
	private Date modi_date;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr_dtl() {
		return addr_dtl;
	}
	public void setAddr_dtl(String addr_dtl) {
		this.addr_dtl = addr_dtl;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTeam_no() {
		return team_no;
	}
	public void setTeam_no(String team_no) {
		this.team_no = team_no;
	}
	public String getMngr_yn() {
		return mngr_yn;
	}
	public void setMngr_yn(String mngr_yn) {
		this.mngr_yn = mngr_yn;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	public Date getModi_date() {
		return modi_date;
	}
	public void setModi_date(Date modi_date) {
		this.modi_date = modi_date;
	}	
	
	
	
}
