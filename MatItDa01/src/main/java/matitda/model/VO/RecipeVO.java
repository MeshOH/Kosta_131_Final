package matitda.model.VO;

public class RecipeVO {
	private int recipeNo;
	private String memberId;
	private String recipeName;
	private String content;
	private String writeDate;
	private String title;
	private int hits;
	private String deadline;
	private int zzimCount;
	private int maxMember;
	private String ingredient;
	private int countMember;
	private int price;
	private String recipeAddressId;
	private HashtagVO hashtagVO;
	private GradeVO gradeVO;
	private ReplyVO replyVO;
	private RecipeImgUrlVO recipeImgUrlVO;

	public RecipeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecipeVO(int recipeNo, String memberId, String recipeName,
			String content, String writeDate, String title, int hits,
			String deadline, int zzimCount, int maxMember, String ingredient,
			int countMember, int price, String recipeAddressId,
			HashtagVO hashtagVO, GradeVO gradeVO, ReplyVO replyVO,
			RecipeImgUrlVO recipeImgUrlVO) {
		super();
		this.recipeNo = recipeNo;
		this.memberId = memberId;
		this.recipeName = recipeName;
		this.content = content;
		this.writeDate = writeDate;
		this.title = title;
		this.hits = hits;
		this.deadline = deadline;
		this.zzimCount = zzimCount;
		this.maxMember = maxMember;
		this.ingredient = ingredient;
		this.countMember = countMember;
		this.price = price;
		this.recipeAddressId = recipeAddressId;
		this.hashtagVO = hashtagVO;
		this.gradeVO = gradeVO;
		this.replyVO = replyVO;
		this.recipeImgUrlVO = recipeImgUrlVO;
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

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
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

	public String getRecipeAddressId() {
		return recipeAddressId;
	}

	public void setRecipeAddressId(String recipeAddressId) {
		this.recipeAddressId = recipeAddressId;
	}

	public HashtagVO getHashtagVO() {
		return hashtagVO;
	}

	public void setHashtagVO(HashtagVO hashtagVO) {
		this.hashtagVO = hashtagVO;
	}

	public GradeVO getGradeVO() {
		return gradeVO;
	}

	public void setGradeVO(GradeVO gradeVO) {
		this.gradeVO = gradeVO;
	}

	public ReplyVO getReplyVO() {
		return replyVO;
	}

	public void setReplyVO(ReplyVO replyVO) {
		this.replyVO = replyVO;
	}

	public RecipeImgUrlVO getRecipeImgUrlVO() {
		return recipeImgUrlVO;
	}

	public void setRecipeImgUrlVO(RecipeImgUrlVO recipeImgUrlVO) {
		this.recipeImgUrlVO = recipeImgUrlVO;
	}

	@Override
	public String toString() {
		return "RecipeVO [recipeNo=" + recipeNo + ", memberId=" + memberId
				+ ", recipeName=" + recipeName + ", content=" + content
				+ ", writeDate=" + writeDate + ", title=" + title + ", hits="
				+ hits + ", deadline=" + deadline + ", zzimCount=" + zzimCount
				+ ", maxMember=" + maxMember + ", ingredient=" + ingredient
				+ ", countMember=" + countMember + ", price=" + price
				+ ", recipeAddressId=" + recipeAddressId + ", hashtagVO="
				+ hashtagVO + ", gradeVO=" + gradeVO + ", replyVO=" + replyVO
				+ ", recipeImgUrlVO=" + recipeImgUrlVO + "]";
	}
	
}
