package matitda.model.VO;

public class ReviewVO {
	private int reviewNo; //review_no
	private int recipeNo; //recipe_no
	private String memberId; //member_id
	private String title; 
	private int hits;
	private String content;
	private String writeDate; //write_date
	private String reviewImgUrl; // review_Img_URL

	public ReviewVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewVO(int reviewNo, int recipeNo, String title, int hits,
			String content, String writeDate, String memberId,String reviewImgUrl) {
		super();
		this.reviewNo = reviewNo;
		this.recipeNo = recipeNo;
		this.title = title;
		this.hits = hits;
		this.content = content;
		this.writeDate = writeDate;
		this.memberId = memberId;
		this.reviewImgUrl= reviewImgUrl;
	}

	public String getReviewImgUrl() {
		return reviewImgUrl;
	}

	public void setReviewImgUrl(String reviewImgUrl) {
		this.reviewImgUrl = reviewImgUrl;
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
	@Override
	public String toString() {
		return "ReviewVO [reviewNo=" + reviewNo + ", recipeNo=" + recipeNo
				+ ", title=" + title + ", hits=" + hits + ", content="
				+ content + ", writeDate=" + writeDate + ", memberId="
				+ memberId + "reviewImgUrl"+reviewImgUrl+"]";
	}

}
