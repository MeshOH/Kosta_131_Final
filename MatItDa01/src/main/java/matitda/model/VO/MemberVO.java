package matitda.model.VO;

public class MemberVO {
	private String memberId;
	private String name;
	private String password;
	private String profileImgUrl;
	private int phoneNumber;
	private String email;
	private int totalPoint;
	private String job;
	private String gender;
	private MemberAddressVO memberAddressVO;
	private ZzimChefVO zzimChefVO;
	private QnaVO qnaVO;
	private PointHistoryVO pointHistoryVO;
	private ReplyVO replyVO;
	private GradeVO gradeVO;
	private ApplyVO applyVO;
	private ZzimRecipeVO zzimRecipeVO;
	private ReviewVO reviewVO;
	private RecipeVO recipeVO;

	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberVO(String memberId, String name, String password,
			String profileImgUrl, int phoneNumber, String email,
			int totalPoint, String job, String gender,
			MemberAddressVO memberAddressVO, ZzimChefVO zzimChefVO,
			QnaVO qnaVO, PointHistoryVO pointHistoryVO, ReplyVO replyVO,
			GradeVO gradeVO, ApplyVO applyVO, ZzimRecipeVO zzimRecipeVO,
			ReviewVO reviewVO, RecipeVO recipeVO) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.password = password;
		this.profileImgUrl = profileImgUrl;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.totalPoint = totalPoint;
		this.job = job;
		this.gender = gender;
		this.memberAddressVO = memberAddressVO;
		this.zzimChefVO = zzimChefVO;
		this.qnaVO = qnaVO;
		this.pointHistoryVO = pointHistoryVO;
		this.replyVO = replyVO;
		this.gradeVO = gradeVO;
		this.applyVO = applyVO;
		this.zzimRecipeVO = zzimRecipeVO;
		this.reviewVO = reviewVO;
		this.recipeVO = recipeVO;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfileImgUrl() {
		return profileImgUrl;
	}

	public void setProfileImgUrl(String profileImgUrl) {
		this.profileImgUrl = profileImgUrl;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public MemberAddressVO getMemberAddressVO() {
		return memberAddressVO;
	}

	public void setMemberAddressVO(MemberAddressVO memberAddressVO) {
		this.memberAddressVO = memberAddressVO;
	}

	public ZzimChefVO getZzimChefVO() {
		return zzimChefVO;
	}

	public void setZzimChefVO(ZzimChefVO zzimChefVO) {
		this.zzimChefVO = zzimChefVO;
	}

	public QnaVO getQnaVO() {
		return qnaVO;
	}

	public void setQnaVO(QnaVO qnaVO) {
		this.qnaVO = qnaVO;
	}

	public PointHistoryVO getPointHistoryVO() {
		return pointHistoryVO;
	}

	public void setPointHistoryVO(PointHistoryVO pointHistoryVO) {
		this.pointHistoryVO = pointHistoryVO;
	}

	public ReplyVO getReplyVO() {
		return replyVO;
	}

	public void setReplyVO(ReplyVO replyVO) {
		this.replyVO = replyVO;
	}

	public GradeVO getGradeVO() {
		return gradeVO;
	}

	public void setGradeVO(GradeVO gradeVO) {
		this.gradeVO = gradeVO;
	}

	public ApplyVO getApplyVO() {
		return applyVO;
	}

	public void setApplyVO(ApplyVO applyVO) {
		this.applyVO = applyVO;
	}

	public ZzimRecipeVO getZzimRecipeVO() {
		return zzimRecipeVO;
	}

	public void setZzimRecipeVO(ZzimRecipeVO zzimRecipeVO) {
		this.zzimRecipeVO = zzimRecipeVO;
	}

	public ReviewVO getReviewVO() {
		return reviewVO;
	}

	public void setReviewVO(ReviewVO reviewVO) {
		this.reviewVO = reviewVO;
	}

	public RecipeVO getRecipeVO() {
		return recipeVO;
	}

	public void setRecipeVO(RecipeVO recipeVO) {
		this.recipeVO = recipeVO;
	}

	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", name=" + name
				+ ", password=" + password + ", profileImgUrl=" + profileImgUrl
				+ ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", totalPoint=" + totalPoint + ", job=" + job + ", gender="
				+ gender + ", memberAddressVO=" + memberAddressVO
				+ ", zzimChefVO=" + zzimChefVO + ", qnaVO=" + qnaVO
				+ ", pointHistoryVO=" + pointHistoryVO + ", replyVO=" + replyVO
				+ ", gradeVO=" + gradeVO + ", applyVO=" + applyVO
				+ ", zzimRecipeVO=" + zzimRecipeVO + ", reviewVO=" + reviewVO
				+ ", recipeVO=" + recipeVO + "]";
	}

}
