package lab4;

abstract class MediaItem extends Item{
	private int runTime;

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
		return super.getIdNum();
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	@Override
	public int getNumCopies() {
		return super.getNumCopies();
	}

	@Override
	public void checkIn() {
		super.checkIn();
	}

	@Override
	public void checkOut() {
		super.checkOut();
	}

	@Override
	public void addItem(int idNum, String str, int n) {
		super.addItem(idNum, str, n);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void print() {
		super.print();
	}

	@Override
	public void addItem() {
		super.addItem();
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		MediaItem otherMediaItem = (MediaItem) obj;
		return super.equals(otherMediaItem) && runTime == otherMediaItem.runTime;
	}
}