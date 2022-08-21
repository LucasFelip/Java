package EnumCompo.Compo.application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import EnumCompo.Compo.entity.Department;
import EnumCompo.Compo.entity.hourContract;
import EnumCompo.Compo.entity.worker;
import EnumCompo.Compo.entity.enums.WorkerLevel;

public class program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("\nEnter Worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        worker worker = new worker(workerName, baseSalary, WorkerLevel.valueOf(workerLevel), new Department(departmentName));

        System.out.print("\n How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value oer hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            hourContract contract = new hourContract(contractDate, valuePerHour, hours);
            worker.addContrat(contract);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next(); 
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName() + "\nDepartment: " + worker.getDepartment().getName() + "\nIncome for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        sc.close();
    }
}
