package Assign_14_linkedList_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager {
    private LinkedList<Song> playlist;

    public PlaylistManager() {
        playlist = new LinkedList<>();
    }

    public void addSong(Song song) {
        playlist.add(song);
        System.out.println("Added song: " + song.getTitle());
    }

    public void removeSong(int songId) {
        ListIterator<Song> iterator = playlist.listIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getSongId() == songId) {
                iterator.remove();
                System.out.println("Removed song: " + song.getTitle());
                return;
            }
        }
        System.out.println("not found");
    }

    public void searchSongByTitle(String title) {
        for (Song song : playlist) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Song found:");
                System.out.println(song);
                return;
            }
        }
        System.out.println("not found.");
    }
    
    public void displayAllSongsSortedByDuration() {
        LinkedList<Song> sortedPlaylist = new LinkedList<>(playlist);
        Collections.sort(sortedPlaylist, Comparator.comparingDouble(Song::getDuration));
        System.out.println("Songs sorted by duration:");
        for (Song song : sortedPlaylist) {
            System.out.println(song);
        }
    }

    public static void main(String[] args) {
        PlaylistManager playlistManager = new PlaylistManager();

        Song song1 = new Song(1, "Song One", " A", "X", 3.50);
        Song song2 = new Song(2, "Song Two", "B", "Y", 4.20);
        Song song3 = new Song(3, "Song Three", "C", "Z", 2.80);
        playlistManager.addSong(song1);
        playlistManager.addSong(song2);
        playlistManager.addSong(song3);
        playlistManager.searchSongByTitle("Song One");
        playlistManager.displayAllSongsSortedByDuration();
        playlistManager.removeSong(2);
        playlistManager.displayAllSongsSortedByDuration();
    }
}

