package hero;

public class Human implements Hero {

    private String currentIdentity;
    private String otherIdentity;

    public Human(String trueIdentity, String alterEgo) {

        currentIdentity = trueIdentity;
        otherIdentity = alterEgo;

    }

    @Override
    public String currentIdentity() {
        return currentIdentity;
    }

    @Override
    public void switchIdentity() {
        
        String tempIdentityHolder = currentIdentity;
        
        currentIdentity = otherIdentity;
        
        otherIdentity = tempIdentityHolder;
    }

    public int totalPower() {
        return 0;
    }

    public boolean hasPower(SuperPower queriedPower) {
        return false;
    }



    
}
