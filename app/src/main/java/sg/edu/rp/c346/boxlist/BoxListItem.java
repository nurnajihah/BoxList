package sg.edu.rp.c346.boxlist;

/**
 * Created by 17010475 on 24/7/2018.
 */

public class BoxListItem {

    private boolean isBlue;
    private boolean isOrange;
    private boolean isBrown;

    public BoxListItem(boolean isBlue, boolean isOrange, boolean isBrown) {
        this.isBlue = isBlue;
        this.isOrange = isOrange;
        this.isBrown = isBrown;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    public boolean isOrange() {
        return isOrange;
    }

    public void setOrange(boolean orange) {
        isOrange = orange;
    }

    public boolean isBrown() {
        return isBrown;
    }

    public void setBrown(boolean brown) {
        isBrown = brown;
    }

    @Override
    public String toString() {
        return "BoxListItem{" +
                "isBlue=" + isBlue +
                ", isOrange=" + isOrange +
                ", isBrown=" + isBrown +
                '}';
    }
}

