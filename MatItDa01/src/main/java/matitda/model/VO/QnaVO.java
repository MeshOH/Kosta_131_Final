package matitda.model.VO;

public class QnaVO {
	private int qnaNo;
	private String memberId;
	private String title;
	private String answer;
	private String question;
	private String writeDate;

	public QnaVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QnaVO(int qnaNo, String memberId, String title, String answer,
			String question, String writeDate) {
		super();
		this.qnaNo = qnaNo;
		this.memberId = memberId;
		this.title = title;
		this.answer = answer;
		this.question = question;
		this.writeDate = writeDate;
	}

	public int getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "QnaVO [qnaNo=" + qnaNo + ", memberId=" + memberId + ", title="
				+ title + ", answer=" + answer + ", question=" + question
				+ ", writeDate=" + writeDate + "]";
	}

}
