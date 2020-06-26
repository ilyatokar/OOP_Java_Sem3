public class Plate extends Dish{
    private int size;

    public Plate(String material, String color, int size) {
        super(material, color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String outInfo() {
        return "Plate{" +
                "size=" + size + ", " +
                "material='" + this.getMaterial() + '\'' +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
