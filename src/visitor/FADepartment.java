package visitor;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class FADepartment extends Department {
    @Override
    public void visit(FullTimeEmployee employee) {
        final int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if (workTime > 40) {
            weekWage = weekWage + (workTime - 40) * 100;
        } else {
            weekWage = weekWage - (40 - workTime) * 80;
            if (weekWage < 0) {
                weekWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "工资为" + weekWage);
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        final int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("零时员工" + employee.getName() + "工资为" + hourWage * workTime);
    }
}
