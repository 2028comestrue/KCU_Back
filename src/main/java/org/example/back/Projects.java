package org.example.back;

public class Projects {

    private int id;
    private String image;
    private String projectSummary;

    public Projects() {
    }

    public Projects(int id, String image, String projectSummary) {
        this.id = id;
        this.image = image;
        this.projectSummary = projectSummary;
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

    public String getProjectSummary() {
        return projectSummary;
    }

    public void setProjectSummary(String projectSummary) {
        this.projectSummary = projectSummary;
    }
}
