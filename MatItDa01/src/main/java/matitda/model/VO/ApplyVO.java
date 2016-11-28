package matitda.model.VO;

public class ApplyVO {
	private int recipeNo;
	private String applyDate;
	private String memberId;
	private int status;

	public ApplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplyVO(int recipeNo, String applyDate, String memberId, int status) {
		super();
		this.recipeNo = recipeNo;
		this.applyDate = applyDate;
		this.memberId = memberId;
		this.status = status;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ApplyVO [recipeNo=" + recipeNo + ", applyDate=" + applyDate
				+ ", memberId=" + memberId + ", status=" + status + "]";
	}
	
	
}
