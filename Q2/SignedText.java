public class SignedText{
    private String firstName;
    private String lastName;
    // Constructor
    public SignedText(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSignature() {
        if (firstName.length() == 0) {
            return lastName;
        }
        return firstName.substring(0, 1) + "-" + lastName;
    }
    public String addSignature(String text) {
    String signature = getSignature();

}
