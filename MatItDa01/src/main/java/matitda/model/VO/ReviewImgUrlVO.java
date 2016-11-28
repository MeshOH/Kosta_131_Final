package matitda.model.VO;

public class ReviewImgUrlVO {
	private int reviewNo;
	private String reviewImgUrl;

	public ReviewImgUrlVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewImgUrlVO(int reviewNo, String reviewImgUrl) {
		super();
		this.reviewNo = reviewNo;
		this.reviewImgUrl = reviewImgUrl;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getReviewImgUrl() {
		return reviewImgUrl;
	}

	public void setReviewImgUrl(String reviewImgUrl) {
		this.reviewImgUrl = reviewImgUrl;
	}

	@Override
	public String toString() {
		return "ReviewImgUrlVO [reviewNo=" + reviewNo + ", reviewImgUrl="
				+ reviewImgUrl + "]";
	}
	
}
