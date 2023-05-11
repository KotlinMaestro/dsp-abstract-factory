package banks;

import abstracts.BankInterface;

public class Stanbic extends BankInterface {
    private String BNAME;

    public Stanbic(String BNAME) {
        this.BNAME = BNAME;
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
