public class Planets implements Nameable{
    private String Name;
    private double diametr;
    private double g;

    public Planets(String name, double diametr, double g) {
        Name = name;
        this.diametr = diametr;
        this.g = g;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "Name='" + Name + '\'' +
                ", diametr=" + diametr +
                ", g=" + g +
                '}';
    }
}
