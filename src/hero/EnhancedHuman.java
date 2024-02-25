package hero;

public class EnhancedHuman {
    
    private String currentIdentity;
    private String otherIdentity;
    private SuperPower[] powers;

    public EnhancedHuman(String trueIdentity, String alterEgo, SuperPower[] abilities) {
        currentIdentity = trueIdentity;
        otherIdentity = alterEgo;
        powers = abilities;
    }

    public String currentIdentity() {
        return currentIdentity;
    }

    public void switchIdentity() {
        String tempIdentityHolder = currentIdentity;
        currentIdentity = otherIdentity;
        otherIdentity = tempIdentityHolder;
    }

    public int totalPower() {
        int total = 0;
        for (SuperPower power : powers) {
            total += power.getValue();
        }
        return total;
    }

    public boolean hasPower(SuperPower queriedPower) {
        for (SuperPower power : powers) {
            if (power == queriedPower) {
                return true;
            }
        }
        return false;
    }





}
