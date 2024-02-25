package hero;

import java.util.Arrays;

public class SuperHuman {
    
    private String currentIdentity;
    private String otherIdentity;
    private SuperPower[] powers;

    public SuperHuman(String trueIdentity, String alterEgo, SuperPower[] abilities) {
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

    public void losePowers(SuperPower[] lostPowers) {
        for (SuperPower lostPower : lostPowers) {
            for (int i = 0; i < powers.length; i++) {
                if (powers[i] == lostPower) {
                    powers[i] = null;
                }
            }
        }
    }

    public void acquirePowers(SuperPower[] newPowers) {

        // Create new container list
        SuperPower[] newPowersList = new SuperPower[powers.length + newPowers.length];

        // Copy old powers to new list
        for (int i = 0; i < powers.length; i++) {
            newPowersList[i] = powers[i];
        }

        // Copy new powers to new list
        for (int i = 0; i < newPowers.length; i++) {
            newPowersList[powers.length + i] = newPowers[i];
        }

        powers = newPowersList;
    }


}
