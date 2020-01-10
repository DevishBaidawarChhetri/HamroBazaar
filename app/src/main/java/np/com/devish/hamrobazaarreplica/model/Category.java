package np.com.devish.hamrobazaarreplica.model;

public class Category {
    private int icons;
    private String category;

    public Category(int icons, String category) {
        this.icons = icons;
        this.category = category;
    }

    public int getIcons() {
        return icons;
    }

    public void setIcons(int icons) {
        this.icons = icons;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
