package lab4;

abstract class WrittenItem extends Item {
	private String author;
	public WrittenItem(int id, String str, int n) {
		// TODO Auto-generated constructor stub
		super(id, str, n);
	}
	public WrittenItem(int idNum, String str, int n, String author) {
		super(idNum , str, n);
		this.author = author;
	}
	public WrittenItem() {
		// TODO Auto-generated constructor stub
	}
	void setAuthor(String str){
		author = str;
	}
	String getAuthor(){
		return author;
	}
	public int getidNum(){
		return super.getIdNum();
	}
	public String getTitle(){
		return super.getTitle();
	}
	public int getNumCopies(){
		return super.getNumCopies();
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
	}
}


