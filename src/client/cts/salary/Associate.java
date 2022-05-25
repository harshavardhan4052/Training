package client.cts.salary;
public class Associate{
	private int AssociateId;
	private String AssociateName;
	private String workStatus;
	public Associate() {
		
	}
	public void setAssociateId(int AssociateId) {
		this.AssociateId = AssociateId;
	}
	public void setAssociateName(String AssociateName) {
		this.AssociateName = AssociateName;
	}
	public void setworkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public void trackAssociateStatus(int trackAssociateStatus) {
	}
	public int getAssociateId() {
		return AssociateId;
	}
	public String getAssociateName() {
		return AssociateName;
	}
	public String getworkStatus() {
		return workStatus;
	}
	public  static void main(String[] args) {
		Associate as = new Associate();
		as.getAssociateId();
	}
}