public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1","Cash is Boss", 5000);
        Account acc2 = new Account("2","More Money", 4000);

        System.out.println();
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());

        acc1.transferTo(acc2, 1000);
        System.err.println();

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        System.out.println();
    }
}
