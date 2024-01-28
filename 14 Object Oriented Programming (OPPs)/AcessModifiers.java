public class AcessModifiers {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Rajeshson";
        myAccount.setPassword("abcdefghi");

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pass) {
        password = pass;
    }

}
