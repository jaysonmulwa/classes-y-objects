public class CreateAccount {
    public static void main(String[] args) {
        Account fredsAccount = new Account(123, "Fred", 0) ;
        fredsAccount.accountNo = 12;
        fredsAccount.accountName = "Fred";
        fredsAccount.balance = 0;
        fredsAccount.deposit (100) ;
        System.out.println("A/c no: " + fredsAccount.accountNo +
                " A/c name: " + fredsAccount.accountName + " Balance: "
                + fredsAccount.balance);
    }
}
