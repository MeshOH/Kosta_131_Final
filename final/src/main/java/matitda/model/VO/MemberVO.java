package matitda.model.VO;

public class MemberVO {
   private String memberId; //member_id
   private String name;
   private String password;
   private String profileImgUrl; //profile_img_url
   private int phoneNumber; //phone_number
   private String email;
   private int totalPoint; //total_point
   private String job;
   private String gender;
   private String memberAddress; //member_address
   private double lat;
   private double lng;
   
   public MemberVO() {   }

   public MemberVO(String memberId, String name, String password,
         String profileImgUrl, int phoneNumber, String email,
         int totalPoint, String job, String gender, String memberAddress,
         double lat, double lng) {
      super();
      this.memberId = memberId;
      this.name = name;
      this.password = password;
      this.profileImgUrl = profileImgUrl;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.totalPoint = totalPoint;
      this.job = job;
      this.gender = gender;
      this.memberAddress = memberAddress;
      this.lat = lat;
      this.lng = lng;
   }

   public String getMemberId() {
      return memberId;
   }

   public void setMemberId(String memberId) {
      this.memberId = memberId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getProfileImgUrl() {
      return profileImgUrl;
   }

   public void setProfileImgUrl(String profileImgUrl) {
      this.profileImgUrl = profileImgUrl;
   }

   public int getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(int phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public int getTotalPoint() {
      return totalPoint;
   }

   public void setTotalPoint(int totalPoint) {
      this.totalPoint = totalPoint;
   }

   public String getJob() {
      return job;
   }

   public void setJob(String job) {
      this.job = job;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
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

   public void setLat(long lat) {
      this.lat = lat;
   }

   public double getLng() {
      return lng;
   }

   public void setLng(long lng) {
      this.lng = lng;
   }

   @Override
   public String toString() {
      return "MemberVO [memberId=" + memberId + ", name=" + name
            + ", password=" + password + ", profileImgUrl=" + profileImgUrl
            + ", phoneNumber=" + phoneNumber + ", email=" + email
            + ", totalPoint=" + totalPoint + ", job=" + job + ", gender="
            + gender + ", memberAddress=" + memberAddress + ", lat=" + lat
            + ", lng=" + lng + "]";
   }
}