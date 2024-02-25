package hero;

public abstract class SuperHero implements Hero{

    private String currentIdentity;
    private String otherIdentity;

    public SuperHero(String trueIdentity, String alterEgo) {

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

    public abstract boolean hasPower(SuperPower queriedPower);

    public abstract int totalPower();
    
}
