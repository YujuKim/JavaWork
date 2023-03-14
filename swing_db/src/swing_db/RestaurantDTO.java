package swing_db;

public class RestaurantDTO {
	String industryName;
	String restaurantName;
	String Phone;

	public RestaurantDTO(String industryName, String restaurantName, String phone) {
		super();
		this.industryName = industryName;
		this.restaurantName = restaurantName;
		this.Phone = phone;
	}

	@Override
	public String toString() {
		return "RestaurantDTO [industryName=" + industryName + ", restaurantName=" + restaurantName + ", Phone=" + Phone
				+ "]";
	}
	
}
