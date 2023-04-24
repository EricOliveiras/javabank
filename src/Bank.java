public class Bank {
  private int accountNumber = 1;
  private String agency;
  private String clientName;
  private double balance;

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAgency() {
    return this.agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public String getClientName() {
    return this.clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Conta : " +
        "Agência = '" + agency + '\'' +
        ", Número da conta ='" + accountNumber + '\'' +
        ", Nome = '" + clientName + '\'' +
        ", Saldo = " + balance;
  }
}