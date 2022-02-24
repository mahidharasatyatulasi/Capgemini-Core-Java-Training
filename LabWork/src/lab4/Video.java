package lab4;

public class Video extends MediaItem{
	
	private String directior;
	private String genre;
	private int year;
	
	public Video(int i, String string, int j, int k, String string2, String string3, int l) {
		// TODO Auto-generated constructor stub
	}
	public String getDirectior() {
		return directior;
	}
	public void setDirectior(String directior) {
		this.directior = directior;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int getRunTime() {
		return super.getRunTime();
	}
	@Override
	public void setRunTime(int runTime) {
		super.setRunTime(runTime);
	}
	@Override
	public int setidNum(int id) {
		// TODO Auto-generated method stub
		return super.setidNum(id);
	}
	@Override
	public String setTitle(String str) {
		// TODO Auto-generated method stub
		return super.setTitle(str);
	}
	@Override
	public int setNumCopies(int n) {
		// TODO Auto-generated method stub
		return super.setNumCopies(n);
	}
	@Override
	public int getIdNum() {
		// TODO Auto-generated method stub
		return super.getIdNum();
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}
	@Override
	public int getNumCopies() {
		// TODO Auto-generated method stub
		return super.getNumCopies();
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		super.checkIn();
	}
	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		super.checkOut();
	}
	@Override
	public void addItem(int idNum, String str, int n) {
		// TODO Auto-generated method stub
		super.addItem(idNum, str, n);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		super.addItem();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}



/*


class CD extends MediaItem{
	
}

*/