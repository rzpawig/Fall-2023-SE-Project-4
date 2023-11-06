//Sruti Karthikeyan - Profile Class; Test Cases by Abhi Bomma

import java.util.ArrayList;

// Profile class with appropriate getters and setters
public class Profile {
    // Instance variables for Profile
    private String displayName;
    private String email;
    private String password;
    private String avatar;
    private ArrayList<String> friendsList;
    private String paymentInfo;
    private boolean hasSubscription;

    // Constructor for Profile class
    public Profile(String displayName, String email, String password) {
        this.displayName = displayName;
        this.email = email;
        this.password = password;
        this.avatar = ""; // Initialize with an empty string
        this.friendsList = new ArrayList<>(); // Initialize the friends list
        this.paymentInfo = ""; // Initialize payment info with an empty string
        this.hasSubscription = false; // Default to no subscription
    }

    // Getters for Profile class
    public String getDisplayName() { return displayName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getAvatar() { return avatar; }
    public ArrayList<String> getFriendsList() { return friendsList; }
    public String getPaymentInfo() { return paymentInfo; }
    public boolean hasSubscription() { return hasSubscription; }

    // Setters for Profile class
    public void setDisplayName(String displayName) { this.displayName = displayName; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setAvatar(String avatar) { this.avatar = avatar; }
    public void setPaymentInfo(String paymentInfo) { this.paymentInfo = paymentInfo; }

    // Method to add a friend to the user's friends list
    public void addFriend(String friendName) {
        friendsList.add(friendName);
    }

    // Method to update payment information
    public void updatePaymentInfo(String paymentDetails) {
        this.paymentInfo = paymentDetails;
    }

    // Other methods can be added here
    // ...

}
// TEST CASES: Abhi Bomma //

// ProfileTest class with JUnit-style test methods
public class ProfileTest {

    // Test case for adding a friend
    @Test
    public void testAddFriend() {
        Profile profile = new Profile("JohnDoe", "johndoe@example.com", "secure123");
        profile.addFriend("JaneDoe");
        assertEquals("Friend should be added to the list", 1, profile.getFriendsList().size());
        assertTrue("Friend's name should be in the list", profile.getFriendsList().contains("JaneDoe"));
    }

    // Test case for updating payment information
    @Test
    public void testUpdatePaymentInfo() {
        Profile profile = new Profile("JohnDoe", "johndoe@example.com", "secure123");
        profile.updatePaymentInfo("4111 1111 1111 1111");
        assertEquals("Payment info should be updated", "4111 1111 1111 1111", profile.getPaymentInfo());
    }
}

