package domain;

public class Picture {
	private Integer picture_id;//轮播图片编号
	private String big_url;//大图URL
	private String middle_url;//中图URL
	private String small_url;//小图URL
	private Integer spu_id;//SPU编号
	public Integer getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(Integer picture_id) {
		this.picture_id = picture_id;
	}
	public String getBig_url() {
		return big_url;
	}
	public void setBig_url(String big_url) {
		this.big_url = big_url;
	}
	public String getMiddle_url() {
		return middle_url;
	}
	public void setMiddle_url(String middle_url) {
		this.middle_url = middle_url;
	}
	public String getSmall_url() {
		return small_url;
	}
	public void setSmall_url(String small_url) {
		this.small_url = small_url;
	}
	public Integer getSpu_id() {
		return spu_id;
	}
	public void setSpu_id(Integer spu_id) {
		this.spu_id = spu_id;
	}
}
