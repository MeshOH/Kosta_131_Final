package matitda.model.VO;

public class GradeVO {
	private String memberId;
	private double beforeGrade;
	private double afterGrade;
	private int recipeNo;

	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradeVO(String memberId, double beforeGrade, double afterGrade,
			int recipeNo) {
		super();
		this.memberId = memberId;
		this.beforeGrade = beforeGrade;
		this.afterGrade = afterGrade;
		this.recipeNo = recipeNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public double getBeforeGrade() {
		return beforeGrade;
	}

	public void setBeforeGrade(double beforeGrade) {
		this.beforeGrade = beforeGrade;
	}

	public double getAfterGrade() {
		return afterGrade;
	}

	public void setAfterGrade(double afterGrade) {
		this.afterGrade = afterGrade;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	@Override
	public String toString() {
		return "GradeVO [memberId=" + memberId + ", beforeGrade=" + beforeGrade
				+ ", afterGrade=" + afterGrade + ", recipeNo=" + recipeNo + "]";
	}

	
}
