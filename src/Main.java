
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        class Persion {
            String name;
            int age;

            public Persion(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void introduse() {
                System.out.println("name : " + name + "age : " + age);
            }
        }

        class Employee extends Persion {
            double Salary;


            public Employee(String name, int age, double salary) {
                super(name, age);
                this.Salary = salary;

            }

            void Work() {

                System.out.println("Job:Genral employee");
            }

            public double calculateAnnualSalary() {
                return Salary * 12;
            }

        }

        class Manager extends Employee {

            int teamsaiz;

            public Manager(String name, int age, double salary, int teamsaiz) {
                super(name, age, salary);
                this.teamsaiz = teamsaiz;
            }

            public void Work() {
                System.out.println("Job: Managing a team of " + teamsaiz + " employees.");
            }
        }

        class Devloper extends Employee {

            String Programminglanguage;

            public Devloper(String name, int age, double salary, String programminglanguage) {
                super(name, age, salary);
                this.Programminglanguage = programminglanguage;
            }

            public void Work() {
                System.out.println("Job : Devlopment Using :" + Programminglanguage);

            }
        }


        class Intern extends Persion {
            String Mentor;


            public Intern(String name, int age, String mentor) {
                super(name, age);
                this.Mentor = mentor;

            }

            void Mentorlern() {

                System.out.println("Job: Intern under Mentor :" + Mentor);
            }


        }

        public class Main {
            public static void main(String[] args) {

                Employee emp = new Employee("naman", 20, 2000.0);
                Devloper dev = new Devloper("naman", 20, 22000, "java");
                Manager mang = new Manager("Tirth", 30, 35000, 20);
                Intern intern = new Intern("hinali", 19, "Naman");

                System.out.println("Employee :");
                emp.introduse();
                emp.Work();
                System.out.println("Annual Salary: $" + emp.calculateAnnualSalary());

                System.out.println("Devloper :");
                dev.introduse();
                dev.Work();
                System.out.println("Annual Salary: $" + dev.calculateAnnualSalary());

                System.out.println("Intern :");
                intern.introduse();
                intern.Mentorlern();

                System.out.println("Manager :");
                mang.introduse();
                mang.Work();
                System.out.println("Annual Salary: $" + mang.calculateAnnualSalary());

            }
        }
    }
}