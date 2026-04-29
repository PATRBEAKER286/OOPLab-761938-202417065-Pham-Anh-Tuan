package hust.soict.dsai.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    // --- Getters và Setters ---
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public float getCost() { return cost; }
    public void setCost(float cost) { this.cost = cost; }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media other = (Media) obj;
        // So sánh theo Tiêu đề (cần kiểm tra null để tránh lỗi sập chương trình)
        return this.getTitle() != null && this.getTitle().equals(other.getTitle());
    }
}