package domain;

public class Classification {
	private Integer classification_id;//分类编号
	private String classification_name;//分类名称
	private Integer fclassification_id;//父分类编号
	public Integer getClassification_id() {
		return classification_id;
	}
	public void setClassification_id(Integer classification_id) {
		this.classification_id = classification_id;
	}
	public String getClassification_name() {
		return classification_name;
	}
	public void setClassification_name(String classification_name) {
		this.classification_name = classification_name;
	}
	public Integer getFclassification_id() {
		return fclassification_id;
	}
	public void setFclassification_id(Integer fclassification_id) {
		this.fclassification_id = fclassification_id;
	}
}
