public class Withdraw {
    double withdrawAmount;

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public void withDrawAmount(){
        System.out.println(getWithdrawAmount());
        System.out.println("Prod. error patched");
    }
}
