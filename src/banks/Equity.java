package banks;

import abstracts.BankInterface;

public class Equity extends BankInterface {
    private String BNAME;

    public Equity(String BNAME) {
        this.BNAME = BNAME;
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
