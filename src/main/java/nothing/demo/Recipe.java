package nothing.demo;

public class Recipe {
    private String name;
    private String description;
    private double duration;
    private String img;

    public Recipe(String name, String description, double duration, String img) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.img = img;
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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
