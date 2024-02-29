package closet;

public class ClothingItem {

    private  int userId;

    private int clothingId;

    private String itemType;

    private String description;

    private  String clothingStyle;


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



}
