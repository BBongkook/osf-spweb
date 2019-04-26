package com.osf.web.vo;

public class CustomerInfoVO {

	private Integer ciNum;
	private String ciId;
	private String ciPwd;
	private String ciName;
	private Integer ciAge;
	private String ciEmail;
	private String ciZip;
	private String ciAddr1;
	private String ciAddr2;
	private String ciPhone;
	public Integer getCiNum() {
		return ciNum;
	}
	public void setCiNum(Integer ciNum) {
		this.ciNum = ciNum;
	}
	public String getCiId() {
		return ciId;
	}
	public void setCiId(String ciId) {
		this.ciId = ciId;
	}
	public String getCiPwd() {
		return ciPwd;
	}
	public void setCiPwd(String ciPwd) {
		this.ciPwd = ciPwd;
	}
	public String getCiName() {
		return ciName;
	}
	public void setCiName(String ciName) {
		this.ciName = ciName;
	}
	public Integer getCiAge() {
		return ciAge;
	}
	public void setCiAge(Integer ciAge) {
		this.ciAge = ciAge;
	}
	public String getCiEmail() {
		return ciEmail;
	}
	public void setCiEmail(String ciEmail) {
		this.ciEmail = ciEmail;
	}
	public String getCiZip() {
		return ciZip;
	}
	public void setCiZip(String ciZip) {
		this.ciZip = ciZip;
	}
	public String getCiAddr1() {
		return ciAddr1;
	}
	public void setCiAddr1(String ciAddr1) {
		this.ciAddr1 = ciAddr1;
	}
	public String getCiAddr2() {
		return ciAddr2;
	}
	public void setCiAddr2(String ciAddr2) {
		this.ciAddr2 = ciAddr2;
	}
	public String getCiPhone() {
		return ciPhone;
	}
	public void setCiPhone(String ciPhone) {
		this.ciPhone = ciPhone;
	}
	@Override
	public String toString() {
		return "CustomerInfoVO [ciNum=" + ciNum + ", ciId=" + ciId + ", ciPwd=" + ciPwd + ", ciName=" + ciName
				+ ", ciAge=" + ciAge + ", ciEmail=" + ciEmail + ", ciZip=" + ciZip + ", ciAddr1=" + ciAddr1
				+ ", ciAddr2=" + ciAddr2 + ", ciPhone=" + ciPhone + "]";
	}
	
}
