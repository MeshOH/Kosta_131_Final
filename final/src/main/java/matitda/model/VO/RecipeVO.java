package matitda.model.VO;

public class RecipeVO {
	private int recipeNo;  // recipe_no 
	private String memberId; // member_id
	private String recipeName; // recipe_name
	private String content; 
	private String writeDate; // write_date
	private String title; 
	private int hits;  
	private String deadline;
	private int status;
	private int zzimCount;  // ZZIM_COUNT 
	private int maxMember; //max_member
	private int countMember; // count_member
	private int price; 
	private String recipeImgUrl; // recipe_img_url
	private String recipeAddress; //recipe_address
 	private double lat;
 	private double lng;
 	
	public RecipeVO() {
		super();
	}
	public RecipeVO(int recipeNo, String memberId, String recipeName,
			String content, String writeDate, String title, int hits,
			String deadline, int status, int zzimCount, int maxMember,
			int countMember, int price, String recipeAddress, double lat,
			double lng,String recipeImgUrl) {
		super();
		this.recipeNo = recipeNo;
		this.memberId = memberId;
		this.recipeName = recipeName;
		this.content = content;
		this.writeDate = writeDate;
		this.title = title;
		this.hits = hits;
		this.deadline = deadline;
		this.status = status;
		this.zzimCount = zzimCount;
		this.maxMember = maxMember;
		this.countMember = countMember;
		this.price = price;
		this.recipeAddress = recipeAddress;
		this.lat = lat;
		this.lng = lng;
		this.recipeImgUrl=recipeImgUrl;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
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
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getZzimCount() {
		return zzimCount;
	}
	public void setZzimCount(int zzimCount) {
		this.zzimCount = zzimCount;
	}
	public int getMaxMember() {
		return maxMember;
	}
	public void setMaxMember(int maxMember) {
		this.maxMember = maxMember;
	}
	public int getCountMember() {
		return countMember;
	}
	public void setCountMember(int countMember) {
		this.countMember = countMember;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "RecipeVO [recipeNo=" + recipeNo + ", memberId=" + memberId
				+ ", recipeName=" + recipeName + ", content=" + content
				+ ", writeDate=" + writeDate + ", title=" + title + ", hits="
				+ hits + ", deadline=" + deadline + ", status=" + status
				+ ", zzimCount=" + zzimCount + ", maxMember=" + maxMember
				+ ", countMember=" + countMember + ", price=" + price
				+ ", recipeAddress=" + recipeAddress + ", lat=" + lat
				+ ", lng=" + lng +",recipeImgUrl="+recipeImgUrl+"]";
	}
}
