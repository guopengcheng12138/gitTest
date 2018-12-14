package domain;

public class Specification_group {
	private Integer specification_group_id;//规格组ID
	private String specification_group_name;//规格组名称
	private Integer classification_id;//分类ID
	public Integer getSpecification_group_id() {
		return specification_group_id;
	}
	public void setSpecification_group_id(Integer specification_group_id) {
		this.specification_group_id = specification_group_id;
	}
	public String getSpecification_group_name() {
		return specification_group_name;
	}
	public void setSpecification_group_name(String specification_group_name) {
		this.specification_group_name = specification_group_name;
	}
	public Integer getClassification_id() {
		return classification_id;
	}
	public void setClassification_id(Integer classification_id) {
		this.classification_id = classification_id;
	}
	
}
