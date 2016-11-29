package matitda.model.VO;

public class ReplyVO {
	private int replyNo; //reply_no
	private String content; 
	private String writeDate; // write_date
	private String memberId; //mebmer_id
	private int recipeNo; //recipe_no
	private String description; //description

	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReplyVO(int replyNo, String content, String writeDate,
			String memberId, int recipeNo, String description) {
		super();
		this.replyNo = replyNo;
		this.content = content;
		this.writeDate = writeDate;
		this.memberId = memberId;
		this.recipeNo = recipeNo;
		this.description = description;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
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

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "ReplyVO [replyNo=" + replyNo + ", content=" + content
				+ ", writeDate=" + writeDate + ", memberId=" + memberId
				+ ", recipeNo=" + recipeNo + ", description=" + description
				+  "]";
	}
	
}
