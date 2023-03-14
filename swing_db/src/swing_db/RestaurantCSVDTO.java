package swing_db;

public class RestaurantCSVDTO {
	String industryName;
	String restaurantName;
	String StreenName;
	String AddressName;
	String Phone;
	int location_id;
	public RestaurantCSVDTO(String industryName, String restaurantName, String streenName, String addressName,
			String phone) {
		super();
		this.industryName = industryName;
		this.restaurantName = restaurantName;
		StreenName = streenName;
		AddressName = addressName;
		Phone = phone;
		location_id = 1;
	}
	@Override
	public String toString() {
		return "RestaurantCSVDTO [industryName=" + industryName + ", restaurantName=" + restaurantName + ", StreenName="
				+ StreenName + ", AddressName=" + AddressName + ", Phone=" + Phone + ", location_id=" + location_id
				+ "]";
	}
	
}
