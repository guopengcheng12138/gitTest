package domain;

public class Specification {
	private Integer specification_id;//规格编号
	private String specification_name;//规格名称
	private Integer specification_group_id;//规格组ID
	public Integer getSpecification_id() {
		return specification_id;
	}
	public void setSpecification_id(Integer specification_id) {
		this.specification_id = specification_id;
	}
	public String getSpecification_name() {
		return specification_name;
	}
	public void setSpecification_name(String specification_name) {
		this.specification_name = specification_name;
	}
	public Integer getSpecification_group_id() {
		return specification_group_id;
	}
	public void setSpecification_group_id(Integer specification_group_id) {
		this.specification_group_id = specification_group_id;
	}
	
}
