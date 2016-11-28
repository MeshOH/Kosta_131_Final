package matitda.model.VO;

public class ZzimRecipeVO {
	private String memberId;
	private int recipeNo;

	public ZzimRecipeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZzimRecipeVO(String memberId, int recipeNo) {
		super();
		this.memberId = memberId;
		this.recipeNo = recipeNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	@Override
	public String toString() {
		return "ZzimRecipeVO [memberId=" + memberId + ", recipeNo=" + recipeNo
				+ "]";
	}
	
}
