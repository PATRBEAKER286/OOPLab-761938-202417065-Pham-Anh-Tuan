package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() { return artist; }

    // --- Xử lý danh sách bài hát ---
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track: " + track.getTitle() + " has been added.");
        } else {
            System.out.println("Track: " + track.getTitle() + " is already in the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track: " + track.getTitle() + " has been removed.");
        } else {
            System.out.println("Track: " + track.getTitle() + " does not exist in the CD.");
        }
    }

    // Tính tổng thời lượng của CD bằng cách cộng thời lượng từng bài hát
    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD Artist: " + this.getArtist());
        System.out.println("CD length: " + this.getLength() + " minutes\n");
        
        // Dùng vòng lặp để phát từng bài hát trong đĩa
        for (Track track : tracks) {
            track.play(); 
        }
    }
 // Ghi đè hàm toString để in thông tin CD
    @Override
    public String toString() {
        return "CD - " + this.getTitle() + " - " + this.getCategory() + " - Artist: " + this.getArtist() + " - Length: " + this.getLength() + " mins - " + this.getCost() + " $";
    }
}