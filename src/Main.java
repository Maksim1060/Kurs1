public class Main {
    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Masha", "Agafonova", "Viktorovna", 35000, 1);
        employees[1] = new Employee("Arina", "popova", "Anatolevna", 45000, 2);
        employees[2] = new Employee("Anastasia", "Petrova", "Petrovna", 55000, 3);
        employees[3] = new Employee("Viktor", "Ivanov", "Petrovich", 90000, 4);
        employees[4] = new Employee("Maksim", "Astafiev", "Ivanovich", 67000, 5);
        employees[5] = new Employee("Anton", "Ignatiev", "Semenovich", 56000, 1);
        employees[6] = new Employee("Petr", "Ivanov", "Igorevich", 75000, 2);
        employees[7] = new Employee("Ivan", "Morozov", "Stepanivich", 63000, 3);
        employees[8] = new Employee("Nikolai", "Tolkachev", "Andreevich", 32000, 4);
        employees[9] = new Employee("Mikhail", "Krutko", "Syepanovich", 35000, 1);
        printNames();
        System.out.println("Затраты на зарплату " + allSalary());
        System.out.println("Минимальная зарплата "+ min());
        System.out.println("Максимальная зарплата "+ max());
        System.out.println("Средняя зарплата "+sred());
        printFIO();

    }

    private static void printNames() {
        for (int i = 0; i < employees.length; i++)  {
            System.out.println(employees[i]);

        }
    }

    private static int allSalary() {
        int salary = 0;
        for (int i = 0; i < employees.length; i++)  {
            salary += employees[i].getSalary();
        }
        return salary;
    }

    private static Employee  min() {
        Employee minSalary=null;
        for (int i = 0; i < employees.length; i++)  {
            if (minSalary ==null|| employees[i].getSalary()<minSalary.getSalary()){
                minSalary=employees[i];
            }
        }
        return minSalary;
    }private static Employee max(){
        Employee maxSalary=null;
        for (int i = 0; i < employees.length; i++)  {
            if (maxSalary==null|| employees[i].getSalary()>maxSalary.getSalary()){
                maxSalary=employees[i];
            }
        }
        return maxSalary;
    }
private static int sred(){
      return   allSalary()/ employees.length;
}private static void printFIO() {
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].getName());
            System.out.print(" ");
            System.out.print(employees[i].getMidlleName());
            System.out.print(" ");
            System.out.print(employees[i].getSurName());
            System.out.println(" ");
        }

        }
    }





            



