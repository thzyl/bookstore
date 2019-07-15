package com.cqjtu.bookstore.bean;

public class FondInfo {

	private String fondId;
	private UserInfo fansInfo;
	private UserInfo idolInfo;

	public String getFondId() {
		return fondId;
	}

	public void setFondId(String fondId) {
		this.fondId = fondId;
	}

	public UserInfo getFansInfo() {
		return fansInfo;
	}

	public void setFansInfo(UserInfo fansInfo) {
		this.fansInfo = fansInfo;
	}

	public UserInfo getIdolInfo() {
		return idolInfo;
	}

	public void setIdolInfo(UserInfo idolInfo) {
		this.idolInfo = idolInfo;
	}

}
