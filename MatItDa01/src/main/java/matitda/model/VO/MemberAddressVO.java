package matitda.model.VO;

public class MemberAddressVO {
	private String memberId;
	private String memberAddress;
	private double lat;
	private double leg;

	public MemberAddressVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberAddressVO(String memberId, String memberAddress, double lat,
			double leg) {
		super();
		this.memberId = memberId;
		this.memberAddress = memberAddress;
		this.lat = lat;
		this.leg = leg;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
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

	@Override
	public String toString() {
		return "MemberAddressVO [memberId=" + memberId + ", memberAddress="
				+ memberAddress + ", lat=" + lat + ", leg=" + leg + "]";
	}

}
