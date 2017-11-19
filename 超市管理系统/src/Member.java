//超市会员
public class Member {
	//姓名   会员卡号   密码   会员积分  
	private String name;
	private int cardId;
	private String password;
	private int score;
	//开卡日期
	private String registDate;
	
	public Member() {
	}
	public Member(String name, int cardId, String password, int score) {
		this.name = name;
		this.cardId = cardId;
		this.password = password;
		this.score = score;
	}
	
	public Member(String name, int cardId, String password, int score,
			String registDate) {
		super();
		this.name = name;
		this.cardId = cardId;
		this.password = password;
		this.score = score;
		this.registDate = registDate;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
