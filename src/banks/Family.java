package banks;

import abstracts.BankInterface;

public class Family extends BankInterface {
    private String BNAME;

    public Family(String BNAME) {
        this.BNAME = BNAME;
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
