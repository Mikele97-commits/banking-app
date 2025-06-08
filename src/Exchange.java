import java.util.Scanner;

public class Exchange {

    public static void exchange(int accountNumber) {
        final double USDtoCHF =0.82;
        final double USDtoPLN =3.72;
        final double USDtoGBP =0.74;
        final double USDtoEUR =0.88;
        BalanceList list = new BalanceList();
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Welcome to the Exchange. Current rates are:
                USD to CHF: 0.82
                USD to PLN: 3.72
                USD to GBP: 0.74
                USD to EUR: 0.88""");
        System.out.println("Which currency do you want to exchange? Option available only to/from USD.");
        System.out.println("CHF\nPLN\nGBP\nEUR");
        String currency = in.nextLine();
        System.out.println("Do you want to exchange 'to' or 'from' said currency?");
        String exchange = in.nextLine();
        System.out.println("How much do you want to exchange?");
        double amount = in.nextDouble();
        switch (currency) {
            case "CHF":
                if (exchange.equalsIgnoreCase("to")) {
                    if (amount> list.getUSD(accountNumber)) {
                        System.out.println("You dont have enough money");
                    }
                    else {
                        list.withdraw(accountNumber, amount);
                        double calculated=amount*USDtoCHF;
                        double rounded = Math.round(calculated * 100.0) / 100.0;
                        list.addCHF(accountNumber, rounded);
                        System.out.println("You got " + rounded + " CHF.");
                    }
                }
                else if (exchange.equalsIgnoreCase("from")) {
                    if (amount> list.getCHF(accountNumber)) {
                        System.out.println("You dont have enough money");
                    }
                    else {
                        list.subtractCHF(accountNumber, amount);
                        double calculated=amount/USDtoCHF;
                        double rounded = Math.round(calculated * 100.0) / 100.0;

                        list.deposit(accountNumber, rounded);
                        System.out.println("You got " + rounded + " USD.");
                    }
                }
                break;

                case "PLN":
                    if (exchange.equalsIgnoreCase("to")) {
                        if (amount> list.getUSD(accountNumber)) {
                            System.out.println("You dont have enough money");
                        }
                        else {
                            list.withdraw(accountNumber, amount);
                            double calculated=amount*USDtoPLN;
                            double rounded = Math.round(calculated * 100.0) / 100.0;
                            list.addPLN(accountNumber, rounded);
                            System.out.println("You got " + rounded + " PLN.");
                        }
                    }
                    else if (exchange.equalsIgnoreCase("from")) {
                        if (amount> list.getPLN(accountNumber)) {
                            System.out.println("You dont have enough money");
                        }
                        else {
                            list.subtractPLN(accountNumber, amount);
                            double calculated=amount/USDtoPLN;
                            double rounded = Math.round(calculated * 100.0) / 100.0;

                            list.deposit(accountNumber, rounded);
                            System.out.println("You got " + rounded + " USD.");
                        }
                    }
                    break;
            case "GBP":
            if (exchange.equalsIgnoreCase("to")) {
                if (amount> list.getUSD(accountNumber)) {
                    System.out.println("You dont have enough money");
                }
                else {
                    list.withdraw(accountNumber, amount);
                    double calculated=amount*USDtoGBP;
                    double rounded = Math.round(calculated * 100.0) / 100.0;
                    list.addGBP(accountNumber, rounded);
                    System.out.println("You got " + rounded + " GBP.");
                }
            }
            else if (exchange.equalsIgnoreCase("from")) {
                if (amount> list.getGBP(accountNumber)) {
                    System.out.println("You dont have enough money");
                }
                else {
                    list.subtractGBP(accountNumber, amount);
                    double calculated=amount/USDtoGBP;
                    double rounded = Math.round(calculated * 100.0) / 100.0;

                    list.deposit(accountNumber, rounded);
                    System.out.println("You got " + rounded + " USD.");
                }
            }
            break;
            case "EUR":
                if (exchange.equalsIgnoreCase("to")) {
                    if (amount> list.getUSD(accountNumber)) {
                        System.out.println("You dont have enough money");
                    }
                    else {
                        list.withdraw(accountNumber, amount);
                        double calculated=amount*USDtoEUR;
                        double rounded = Math.round(calculated * 100.0) / 100.0;
                        list.addEUR(accountNumber, rounded);
                        System.out.println("You got " + rounded + " EUR.");
                    }
                }
                else if (exchange.equalsIgnoreCase("from")) {
                    if (amount> list.getEUR(accountNumber)) {
                        System.out.println("You dont have enough money");
                    }
                    else {
                        list.subtractEUR(accountNumber, amount);
                        double calculated=amount/USDtoEUR;
                        double rounded = Math.round(calculated * 100.0) / 100.0;

                        list.deposit(accountNumber, rounded);
                        System.out.println("You got " + rounded + " USD.");
                    }
                }
                break;
        }
    }
}
