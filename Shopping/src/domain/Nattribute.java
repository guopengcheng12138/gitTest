package domain;

public class Nattribute {
	private Integer nattribute_id;//属性名编号
	private Integer classification_id;//分类编号
	private String nattribute_name;//属性名称
	public Integer getNattribute_id() {
		return nattribute_id;
	}
	public void setNattribute_id(Integer nattribute_id) {
		this.nattribute_id = nattribute_id;
	}
	public Integer getClassification_id() {
		return classification_id;
	}
	public void setClassification_id(Integer classification_id) {
		this.classification_id = classification_id;
	}
	public String getNattribute_name() {
		return nattribute_name;
	}
	public void setNattribute_name(String nattribute_name) {
		this.nattribute_name = nattribute_name;
	}
}
