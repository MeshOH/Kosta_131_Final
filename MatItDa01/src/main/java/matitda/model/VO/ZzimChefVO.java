package matitda.model.VO;

public class ZzimChefVO {
	private String memberUser;
	private String memberChef;
	private int status;

	public ZzimChefVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZzimChefVO(String memberUser, String memberChef, int status) {
		super();
		this.memberUser = memberUser;
		this.memberChef = memberChef;
		this.status = status;
	}

	public String getMemberUser() {
		return memberUser;
	}

	public void setMemberUser(String memberUser) {
		this.memberUser = memberUser;
	}

	public String getMemberChef() {
		return memberChef;
	}

	public void setMemberChef(String memberChef) {
		this.memberChef = memberChef;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ZzimChefVO [memberUser=" + memberUser + ", memberChef="
				+ memberChef + ", status=" + status + "]";
	}

}
