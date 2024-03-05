package org.example.back;

public class Banner {

    private Integer id;
    private String image;

    public Banner() {

    }

    public Banner(Integer id, String image) {
        this.id = id;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }
    public String getImage() {
        return image;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
