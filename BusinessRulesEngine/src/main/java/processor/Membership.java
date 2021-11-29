package processor;

public class Membership {
    String ownerName;

    private String memebrshipMsg = " Your membership has been ";

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Membership(String ownerName) {
        this.ownerName = ownerName;
    }

    public void membershipPlan(String memType) {
        System.out.println(ownerName + memebrshipMsg + memType);

    }

}
