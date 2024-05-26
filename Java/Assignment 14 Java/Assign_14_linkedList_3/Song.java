package Assign_14_linkedList_3;

	public class Song {
	    private int songId;
	    private String title;
	    private String artist;
	    private String album;
	    private double duration;

	    public Song(int songId, String title, String artist, String album, double duration) {
	        this.songId = songId;
	        this.title = title;
	        this.artist = artist;
	        this.album = album;
	        this.duration = duration;
	    }

	    public int getSongId() {
	        return songId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getArtist() {
	        return artist;
	    }

	    public String getAlbum() {
	        return album;
	    }

	    public double getDuration() {
	        return duration;
	    }

	    @Override
	    public String toString() {
	        return "SongID: " + songId + ", Title: " + title + ", Artist: " + artist + ", Album: " + album + ", Duration: " + duration;
	    }
	}

