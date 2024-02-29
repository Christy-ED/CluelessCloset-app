package closet;

import java.util.List;

public class User {

    private int UserId;

    private String name;

    private String Username;

    private String password;

    private String Style;

    private String WeatherConditions;

    private List<Outfit>outfit;

    private List<ClothingItem>clothingItem;



    public User(){

    }

    public User(String name, String username, String password) {
        this.name = name;
        this.Username = username;
        this.password = password;
    }


    public int getUserId() {
        return UserId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public String getWeatherConditions() {
        return WeatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        WeatherConditions = weatherConditions;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public List<ClothingItem> getClothingItem() {
        return clothingItem;
    }

    public void setClothingItem(List<ClothingItem> clothingItem) {
        this.clothingItem = clothingItem;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public List<Outfit> getOutfit() {
        return outfit;
    }

    public void setOutfit(List<Outfit> outfit) {
        this.outfit = outfit;
    }
}
