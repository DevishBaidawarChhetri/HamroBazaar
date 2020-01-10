package np.com.devish.hamrobazaarreplica.model;

public class User {

    private String profileImage;
    private String email;
    private String fullname;
    private String password;
    private String phone;
    private String mobileNumber;
    private String streetName;
    private String areaLocation;
    private String cityName;

    public User(String profileImage, String email, String fullname, String password, String phone, String mobileNumber, String streetName, String areaLocation, String cityName) {
        this.profileImage = profileImage;
        this.email = email;
        this.fullname = fullname;
        this.password = password;
        this.phone = phone;
        this.mobileNumber = mobileNumber;
        this.streetName = streetName;
        this.areaLocation = areaLocation;
        this.cityName = cityName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAreaLocation() {
        return areaLocation;
    }

    public void setAreaLocation(String areaLocation) {
        this.areaLocation = areaLocation;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
