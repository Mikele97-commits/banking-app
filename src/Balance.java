public class Balance {
    int accountNumber;
    double USD=0;
    double EUR=0;
    double GBP=0;
    double PLN=0;
    double CHF=0;

    public Balance(int accountNumber, double USD, double EUR, double GBP, double PLN, double CHF) {
        this.accountNumber = accountNumber;
        this.USD = USD;
        this.EUR = EUR;
        this.GBP = GBP;
        this.PLN = PLN;
        this.CHF = CHF;
    }

    public int getAccount() {
        return accountNumber;
    }


    public double getUSD(int accountNumber) {
        return USD;
    }
    public void addUSD(double USD) {
        this.USD += USD;
    }
    public void withUSD(double USD) {
        this.USD -= USD;
    }

    public double getEUR(int accountNumber) {
        return EUR;
    }
    public void addEUR(double EUR) {
        this.EUR += EUR;
    }
    public void withEUR(double EUR) {
        this.EUR -= EUR;
    }
    public double getPLN(int accountNumber) {
        return PLN;
    }
    public void addPLN(double PLN) {
        this.PLN += PLN;
    }
    public void withPLN(double PLN) {
        this.PLN -= PLN;
    }

    public double getGBP(int accountNumber) {
        return GBP;
    }
    public void addGBP(double GBP) {
        this.GBP += GBP;
    }
    public void withGBP(double GBP) {
        this.GBP -= GBP;
    }

    public double getCHF(int accountNumber) {
        return CHF;
    }
    public void addCHF(double CHF) {
        this.CHF += CHF;
    }
    public void withCHF(double CHF) {
        this.CHF -= CHF;
    }
}
