public class CreateEmployee {
    public static void main(String[] args) {
        int amount = 500;
        Employee fred = new Employee();
        fred.increment(amount);
        System.out.println("amount outside method: " + amount);
    }

    //Second version
    public static void main(String[] args) {
        int fredsSalary[] = new int [1] ;
        Employee fred = new Employee();
        fredsSalary[0] = 500;
        fred.increment(fredsSalary);
        System.out.println("Outside method : " + fredsSalary[0] );
    }
}
