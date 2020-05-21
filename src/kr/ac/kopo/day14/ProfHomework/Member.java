package kr.ac.kopo.day14.ProfHomework;

public class Member {

	private String id;
	private String pw;
	
	public Member() {}
	
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	// id만 가지고 생성하는 생성자를 만든다. 이 생각을 못했구나 ! 
	public Member(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	// id만 비교하는 equals를 만든다. id만 가지고 있는 equals를 만든다는 생각을 못했구나 !
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	

	
	
	
}
