import java.util.ArrayList;

public class BalanceList {
    static ArrayList<Balance> balances=new ArrayList<>();
    void addBalance(Balance b){
        balances.add(b);
    }

    void checkBalance(int accountNumber){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                System.out.println("Your account number is: "+b.accountNumber);
                System.out.println("CHF: "+b.getCHF(accountNumber));
                System.out.println("EUR: "+b.getEUR(accountNumber));
                System.out.println("USD: "+b.getUSD(accountNumber));
                System.out.println("PLN: "+b.getPLN(accountNumber));
                System.out.println("GBP: "+b.getGBP(accountNumber));
            }
        }
    }

    void deposit(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.addUSD(amount);
            }
        }
    }

    void withdraw(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.withUSD(amount);
            }
        }
    }

    double getUSD(int accountNumber){
        double USD=0;
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                USD = b.getUSD(accountNumber);
            }
        }
        return USD;
    }
    double getPLN(int accountNumber){
        double PLN=0;
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                PLN = b.getPLN(accountNumber);
            }
        }
        return PLN;
    }

    double getGBP(int accountNumber){
        double GBP=0;
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){}
        }
        return GBP;
    }

    double getEUR(int accountNumber){
        double EUR=0;
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                EUR = b.getEUR(accountNumber);
            }
        }
        return EUR;
    }
    double getCHF(int accountNumber){
        double CHF=0;
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                CHF = b.getCHF(accountNumber);
            }
        }
        return CHF;
    }
    int getBalanceCount(){
        return balances.size();
    }

    int getAccountNumber(int i){
        return balances.get(i).accountNumber;
    }

    void addCHF(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.addCHF(amount);
            }
        }
    }
    void subtractCHF(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.withCHF(amount);
            }
        }
    }

    void addEUR(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.addEUR(amount);
            }
        }
    }
    void subtractEUR(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.withEUR(amount);
            }
        }
    }
    void addGBP(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.addGBP(amount);
            }
        }
    }
    void subtractGBP(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.withGBP(amount);
            }
        }
    }
    void addPLN(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.addPLN(amount);
            }
        }
    }
    void subtractPLN(int accountNumber, double amount){
        for(Balance b:balances){
            if (b.accountNumber==accountNumber){
                b.withPLN(amount);
            }
        }
    }
}
