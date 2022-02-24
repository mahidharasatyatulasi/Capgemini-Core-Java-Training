package lab4;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD(String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public int getRunTime() {
		// TODO Auto-generated method stub
		return super.getRunTime();
	}
	@Override
	public void setRunTime(int runTime) {
		// TODO Auto-generated method stub
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
