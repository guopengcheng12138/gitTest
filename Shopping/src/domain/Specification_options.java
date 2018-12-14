package domain;

public class Specification_options {
	private Integer specification_option_id;//规格选项编号
	private Integer specification_id;//规格编号
	private Integer specification_group_id;//规格组ID
	private String specification_options_name;//选项名称
	public Integer getSpecification_option_id() {
		return specification_option_id;
	}
	public void setSpecification_option_id(Integer specification_option_id) {
		this.specification_option_id = specification_option_id;
	}
	public Integer getSpecification_id() {
		return specification_id;
	}
	public void setSpecification_id(Integer specification_id) {
		this.specification_id = specification_id;
	}
	public Integer getSpecification_group_id() {
		return specification_group_id;
	}
	public void setSpecification_group_id(Integer specification_group_id) {
		this.specification_group_id = specification_group_id;
	}
	public String getSpecification_options_name() {
		return specification_options_name;
	}
	public void setSpecification_options_name(String specification_options_name) {
		this.specification_options_name = specification_options_name;
	}
}
