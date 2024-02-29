package closet;

public class ClothingItem {

    int userId;

    int clothingId;

    String itemType;

    String description;

    String clothingStyle;


    public ClothingItem(){

    }

    public ClothingItem( String itemType, String description, String clothingStyle){
        this.clothingStyle = clothingStyle;
        this.itemType = itemType;
        this.description = description;

    }

    public String getClothingStyle() {
        return clothingStyle;
    }

    public void setClothingStyle(String clothingStyle) {
        this.clothingStyle = clothingStyle;
    }

    public int getClothingId() {
        return clothingId;
    }

    public void setClothingId(int clothingId) {
        this.clothingId = clothingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
