package EnumCompo.Compo.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import EnumCompo.Compo.entity.enums.WorkerLevel;

public class worker {
    // basic
    private String name;
    private Double baseSalary;
    private WorkerLevel level;
    // associacion
    private Department department;
    private List<hourContract> contracts = new ArrayList<>();

    public worker() {}

    public worker(String name, Double baseSalary, WorkerLevel level, Department department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<hourContract> getContracts() {
        return contracts;
    }

    public void addContrat(hourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(hourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        
        for (hourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year =  cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month)
                sum += c.totalValue();
        }

        return sum;
    }
}