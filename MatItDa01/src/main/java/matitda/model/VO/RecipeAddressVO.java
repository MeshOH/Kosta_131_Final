package matitda.model.VO;

public class RecipeAddressVO {
	private String recipeAddressId;
	private String recipeAddress;
	private double lat;
	private double leg;
	private RecipeVO recipeVO;

	public RecipeAddressVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeAddressVO(String recipeAddressId, String recipeAddress,
			double lat, double leg, RecipeVO recipeVO) {
		super();
		this.recipeAddressId = recipeAddressId;
		this.recipeAddress = recipeAddress;
		this.lat = lat;
		this.leg = leg;
		this.recipeVO = recipeVO;
	}

	public String getRecipeAddressId() {
		return recipeAddressId;
	}

	public void setRecipeAddressId(String recipeAddressId) {
		this.recipeAddressId = recipeAddressId;
	}

	public String getRecipeAddress() {
		return recipeAddress;
	}

	public void setRecipeAddress(String recipeAddress) {
		this.recipeAddress = recipeAddress;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLeg() {
		return leg;
	}

	public void setLeg(double leg) {
		this.leg = leg;
	}

	public RecipeVO getRecipeVO() {
		return recipeVO;
	}

	public void setRecipeVO(RecipeVO recipeVO) {
		this.recipeVO = recipeVO;
	}

	@Override
	public String toString() {
		return "RecipeAddressVO [recipeAddressId=" + recipeAddressId
				+ ", recipeAddress=" + recipeAddress + ", lat=" + lat
				+ ", leg=" + leg + ", recipeVO=" + recipeVO + "]";
	}

	
}
