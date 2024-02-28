package closet;

import java.util.List;

public class User {

    private int UserId;

    private String name;

    private String Username;

    private String password;

    private String Style;

    private String WeatherConditions;

    private List<Outfit>oufits;

    private List<ClothingItem>clothingItem;


    public User(int userId) {
        UserId = userId;
    }
}
