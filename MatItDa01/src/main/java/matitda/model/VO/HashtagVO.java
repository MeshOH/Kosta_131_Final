package matitda.model.VO;

public class HashtagVO {
	private String hashtagContent;
	private int recipeNo;

	public HashtagVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HashtagVO(String hashtagContent, int recipeNo) {
		super();
		this.hashtagContent = hashtagContent;
		this.recipeNo = recipeNo;
	}

	public String getHashtagContent() {
		return hashtagContent;
	}

	public void setHashtagContent(String hashtagContent) {
		this.hashtagContent = hashtagContent;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	@Override
	public String toString() {
		return "HashtagVO [hashtagContent=" + hashtagContent + ", recipeNo="
				+ recipeNo + "]";
	}

}
