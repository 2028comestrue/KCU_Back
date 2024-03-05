package org.example.back;

public class ProjectOverview {
    private int id;
    private String image;
    private String level;
    private String people;

    public ProjectOverview() {

    }

    public ProjectOverview(int id, String image, String level, String people) {
        this.id = id;
        this.image = image;
        this.level = level;
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }
}
