package hust.soict.dsai.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object obj) {
        // 1. Kiểm tra xem có trỏ cùng vào một ô nhớ không (chính là nó)
        if (this == obj) {
            return true;
        }
        // 2. Kiểm tra xem cái được đem ra so sánh có phải là Track không
        if (!(obj instanceof Track)) {
            return false;
        }
        // 3. Ép kiểu về Track và so sánh nội dung (Tiêu đề và Thời lượng)
        Track other = (Track) obj;
        return this.title.equals(other.title) && this.length == other.length;
    }
}