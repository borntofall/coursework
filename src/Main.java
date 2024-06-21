public class Main {

    static Employee[] workers = new Employee[10];

    public static void main(String... args) {

        System.out.println("-------------------------");
        workers[0] = new Employee("Константинов Игнатий Кириллович", 1, 13000);
        workers[1] = new Employee("Михеев Осип Святославович", 1, 80000);
        workers[2] = new Employee("Попов Казимир Олегович", 2, 120000);
        workers[3] = new Employee("Лихачёв Гордей Иосифович", 2, 1033000);
        workers[4] = new Employee("Тимофеев Антон Олегович", 3, 43500);
        workers[5] = new Employee("Хохлов Никифор Оскарович", 3, 1007400);
        workers[6] = new Employee("Молчанов Валерий Феликсович", 4, 75320);
        workers[7] = new Employee("Мышкин Роман Геласьевич", 4, 107880);
        workers[8] = new Employee("Лаврентьев Адольф Лукьевич", 5, 13330502);
        workers[9] = new Employee("Ефремов Юлий Митрофанови", 5, 1789351);


        printEmployeeList();

        System.out.println("-------------------------");
        System.out.println("Сумма затрат на ЗП в месяц: " + getEmployeeSumSalary());
        System.out.println("-------------------------");
        System.out.println("Минимальная ЗП: " + getEmployeeMinSalary());
        System.out.println("-------------------------");
        System.out.println("Максимальная ЗП: " + getEmployeeMaxSalary());
        System.out.println("-------------------------");
        System.out.println("Среднее значение зарплат: " + getEmployeeAverageSumSalary());
        System.out.println("-------------------------");
        System.out.println("ФИО всех сотрудников: \n");
        System.out.println(printFioEmployee());
        System.out.println("-------------------------");

    }

    private static void printEmployeeList() {
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }
    }

    private static int getEmployeeSumSalary() {
        int sumSalary = 0;
        for (int i = 0; i < workers.length; i++) {
            sumSalary += workers[i].getSalary();
        }
        return sumSalary;
    }

    private static Employee getEmployeeMinSalary() {
        Employee minSalary = workers[0];
        for (int i = 0; i < workers.length; i++) {
            if (minSalary.getSalary() > workers[i].getSalary()) {
                minSalary = workers[i];
            }
        }
        return minSalary;
    }

    private static Employee getEmployeeMaxSalary() {
        Employee maxSalary = workers[0];
        for (int i = 0; i < workers.length; i++) {
            if (maxSalary.getSalary() < workers[i].getSalary()) {
                maxSalary = workers[i];
            }
        }
        return maxSalary;
    }

    private static int getEmployeeAverageSumSalary() {
        int a = workers.length;
        int averageSumSalary = getEmployeeSumSalary() / a;
        return averageSumSalary;
    }

    private static String printFioEmployee() {
        for (int i = 0; i < workers.length; i++) {

            System.out.println(workers[i].getFullName());
        }
        return "";
    }
}











