package hero;

public class SecretAgent implements Hero{

    private String currentIdentity;
    private String otherIdentity;
    private String gadget;

    public SecretAgent(String trueIdentity, String alterEgo, String gadget) {
        currentIdentity = trueIdentity;
        otherIdentity = alterEgo;
        this.gadget = gadget;
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

    public String getGadget() {
        
        return gadget;
    }
    
}
