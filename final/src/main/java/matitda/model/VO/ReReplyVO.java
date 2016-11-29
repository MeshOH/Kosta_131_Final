package matitda.model.VO;

public class ReReplyVO {
	private int reReplyNo; // re_reply_no
	private int recipeNo; //recipe_no
	private String description; 
	private String memberId; //member_id
	private String groupId; //group_id
	private int depth; 
	private int orderNo; //order_no
	private int parentReplyId; //parent_reply_id

	public ReReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReReplyVO(int reReplyNo, int recipeNo, String description,
			String memberId, String groupId, int depth, int orderNo,
			int parentReplyId) {
		super();
		this.reReplyNo = reReplyNo;
		this.recipeNo = recipeNo;
		this.description = description;
		this.memberId = memberId;
		this.groupId = groupId;
		this.depth = depth;
		this.orderNo = orderNo;
		this.parentReplyId = parentReplyId;
	}

	public int getReReplyNo() {
		return reReplyNo;
	}

	public void setReReplyNo(int reReplyNo) {
		this.reReplyNo = reReplyNo;
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

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public int getParentReplyId() {
		return parentReplyId;
	}

	public void setParentReplyId(int parentReplyId) {
		this.parentReplyId = parentReplyId;
	}

	@Override
	public String toString() {
		return "ReReplyVO [reReplyNo=" + reReplyNo + ", recipeNo=" + recipeNo
				+ ", description=" + description + ", memberId=" + memberId
				+ ", groupId=" + groupId + ", depth=" + depth + ", orderNo="
				+ orderNo + ", parentReplyId=" + parentReplyId + "]";
	}

}
