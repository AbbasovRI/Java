package homeworks.homework03;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Television {
    private String brand;
    private String model;
    private Integer diagonal;
    private String panel;
    private Integer fps;
    private Double weight;

    public Television() {
        this.brand = "Xiaomi";
        this.model = "A65";
        this.diagonal = 165;
        this.panel = "LCD";
        this.fps = 60;
        this.weight = 15.1;
    }

    public Television(String brand, String model, Integer diagonal, String panel, Integer fps, Double weight) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
        this.panel = panel;
        this.fps = fps;
        this.weight = weight;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDiagonal() {
        return this.diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public String getPanel() {
        return this.panel;
    }

    public void setPanel(String panel) {
        this.panel = panel;
    }

    public Integer getFps() {
        return this.fps;
    }

    public void setFps(Integer fps) {
        this.fps = fps;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Television{brand='" + this.brand + "', model='" + this.model + "', diagonal=" + this.diagonal + ", panel='" + this.panel + "', fps=" + this.fps + ", weight=" + this.weight + "}";
    }
}
