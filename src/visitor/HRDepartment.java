package visitor;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class HRDepartment extends Department {
    @Override
    public void visit(FullTimeEmployee employee) {
        final int workTime = employee.getWorkTime();
        System.out.println("正式员工" + employee.getName() + "实际工作时间" + workTime + "小时");
        if (workTime > 40) {
            System.out.println("正式员工" + employee.getName() + "加班时间" + (workTime - 40) + "小时");
        } else {
            System.out.println("正式员工" + employee.getName() + "请假时间" + (40 - workTime) + "小时");
        }
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        final int workTime = employee.getWorkTime();
        System.out.println("零时员工" + employee.getName() + "实际工作时间" + workTime + "小时");
    }
}
