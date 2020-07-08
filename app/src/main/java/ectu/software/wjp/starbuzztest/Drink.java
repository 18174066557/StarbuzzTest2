package ectu.software.wjp.starbuzztest;

public class Drink {
    private int imageResourceId;
    private String name;
    private String description;

    public static final Drink[] drinks=
    {
        new Drink(R.drawable.latte, "latte", "A couple of espresso shots with steamed milk"),
        new Drink(R.drawable.cappuccino, "cappuccino", "Espresso,hot milk,and a steamed milk foam"),
        new Drink(R.drawable.filter, "filter", "Highest quality beans roasted and brewed fresh")
    };

    public Drink(int imageResourceId, String name, String description) {
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

