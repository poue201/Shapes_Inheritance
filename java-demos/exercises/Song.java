public class Song {

	private String title;
	private String artist;
	private int length;
	
	//static attributes: same across all objects
	
	public Song(String title, String artist, int lenght) {
		
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitlte(String title) {
		this.title = title;
		
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		 this.artist = artist;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setLength(int length) {
		 this.length = length;
	}
	
}