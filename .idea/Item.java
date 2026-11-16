public class Item {
    private String name;
    private int value;
    private boolean isMagical;

    public Item() {
        this.name = "Unknown";
        this.value = 0;
        this.isMagical = false;
    }

    public Item(String name, int value, boolean isMagical) {
        this.name = name;
        setValue(value);
        this.isMagical = isMagical;
    }

    public String toString() {
        String result = "Name: " + name + "\n" + "Value: " + value;
        if (isMagical) {
            result = result + "\n" + "Magical item";
        }
        return result;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public boolean isMagical() {
        return isMagical;
    }

    public String getName() {
        return name;
    }
}
