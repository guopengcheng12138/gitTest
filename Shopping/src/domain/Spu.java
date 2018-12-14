package domain;

public class Spu {
	private Integer spu_id;//SPU编号
	private Integer classification_id;//分类编号
	private Integer brand_id;//品牌编号
	private String spu_name;//SPU名称
	private String spu_details;//SPU描述
	public Integer getSpu_id() {
		return spu_id;
	}
	public void setSpu_id(Integer spu_id) {
		this.spu_id = spu_id;
	}
	public Integer getClassification_id() {
		return classification_id;
	}
	public void setClassification_id(Integer classification_id) {
		this.classification_id = classification_id;
	}
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public String getSpu_name() {
		return spu_name;
	}
	public void setSpu_name(String spu_name) {
		this.spu_name = spu_name;
	}
	public String getSpu_details() {
		return spu_details;
	}
	public void setSpu_details(String spu_details) {
		this.spu_details = spu_details;
	}
}
