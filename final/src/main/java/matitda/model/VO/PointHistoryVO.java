package matitda.model.VO;

public class PointHistoryVO {
	private int pointHistoryNo; // point_history_no
	private String memberId; // member_id
	private String description; 
	private int price; 
	private String point_date;
	private int status; 

	public PointHistoryVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PointHistoryVO(int pointHistoryNo, String memberId,
			String description, int price, String point_date, int status) {
		super();
		this.pointHistoryNo = pointHistoryNo;
		this.memberId = memberId;
		this.description = description;
		this.price = price;
		this.point_date = point_date;
		this.status = status;
	}

	public int getPointHistoryNo() {
		return pointHistoryNo;
	}

	public void setPointHistoryNo(int pointHistoryNo) {
		this.pointHistoryNo = pointHistoryNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPoint_date() {
		return point_date;
	}

	public void setPoint_date(String point_date) {
		this.point_date = point_date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PointHistoryVO [pointHistoryNo=" + pointHistoryNo
				+ ", memberId=" + memberId + ", description=" + description
				+ ", price=" + price + ", point_date=" + point_date
				+ ", status=" + status + "]";
	}
	
}
