
public class DigitalVideoDisc {
	private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    
 // Biến class (static) để đếm tổng số lượng đĩa đã tạo
    private static int nbDigitalVideoDiscs = 0;
    
    // Biến instance để lưu ID duy nhất của từng đĩa
    private int id;
    
	public String getTitle() {
		return title;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
	}
	public String getCategory() {
		return category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}	
	
	public void setTitle(String title) {
        this.title = title;
    }
		
}
