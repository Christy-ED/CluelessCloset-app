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
}
