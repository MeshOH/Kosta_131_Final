package matitda.model.VO;

public class ReviewVO {
	private int reviewNo;
	private int recipeNo;
	private String title;
	private int hits;
	private String content;
	private String writeDate;
	private String memberId;
	private ReviewImgUrlVO reviewImgUrlVO;

	public ReviewVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewVO(int reviewNo, int recipeNo, String title, int hits,
			String content, String writeDate, String memberId,
			ReviewImgUrlVO reviewImgUrlVO) {
		super();
		this.reviewNo = reviewNo;
		this.recipeNo = recipeNo;
		this.title = title;
		this.hits = hits;
		this.content = content;
		this.writeDate = writeDate;
		this.memberId = memberId;
		this.reviewImgUrlVO = reviewImgUrlVO;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public ReviewImgUrlVO getReviewImgUrlVO() {
		return reviewImgUrlVO;
	}

	public void setReviewImgUrlVO(ReviewImgUrlVO reviewImgUrlVO) {
		this.reviewImgUrlVO = reviewImgUrlVO;
	}

	@Override
	public String toString() {
		return "ReviewVO [reviewNo=" + reviewNo + ", recipeNo=" + recipeNo
				+ ", title=" + title + ", hits=" + hits + ", content="
				+ content + ", writeDate=" + writeDate + ", memberId="
				+ memberId + ", reviewImgUrlVO=" + reviewImgUrlVO + "]";
	}

}
