package robot;

public class Robot {
    String name;
    String model;
    int lifetime;
    /// Первый конструктор Дефолтный
    public Robot() {
        this.name = "Anonymous";
        this.model = "Unknown:";
    }
    /// Второй конструктор имеет 2 значения
    public Robot(String name, String model) {
        this(name, model, 20);
    }
    /// Третий конструктор имеет 3 значения
    public Robot(String name, String model,int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
    }



    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }



    @Override

    public String toString () {
        return "Robot{" +
                "name=" + name +
                ", model=" + model +
                ", lifetime=" + lifetime +
                '}';
    }
}
