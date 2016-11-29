package matitda.model.VO;

public class RecipeImgUrlVO {
	private String recipeImgUrl; //recipe_img_url
	private int recipeNo; // recipe_no 

	public RecipeImgUrlVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeImgUrlVO(String recipeImgUrl, int recipeNo) {
		super();
		this.recipeImgUrl = recipeImgUrl;
		this.recipeNo = recipeNo;
	}

	public String getRecipeImgUrl() {
		return recipeImgUrl;
	}

	public void setRecipeImgUrl(String recipeImgUrl) {
		this.recipeImgUrl = recipeImgUrl;
	}

	public int getRecipeNo() {
		return recipeNo;
	}

	public void setRecipeNo(int recipeNo) {
		this.recipeNo = recipeNo;
	}

	@Override
	public String toString() {
		return "RecipeImgUrlVO [recipeImgUrl=" + recipeImgUrl + ", recipeNo="
				+ recipeNo + "]";
	}
	
}
