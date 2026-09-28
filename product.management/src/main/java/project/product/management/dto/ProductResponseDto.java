package project.product.management.dto;

public class ProductResponseDto {
	
	private Long id;
    private String name;
    private String description;
    private int price;
    private String photoUrl;

    // Default Constructor
    public ProductResponseDto() {}

    // Parameterized Constructor
    public ProductResponseDto(Long id, String name, String description, int price, String photoUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.photoUrl = photoUrl;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

}
