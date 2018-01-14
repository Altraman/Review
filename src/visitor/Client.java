package visitor;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class Client {
    public static void main(String[] args) {
        final Employee employee1 = new FullTimeEmployee("胡强", 2400, 38);
        final Employee employee2 = new PartTimeEmployee("方抒怀", 80, 20);
        final Employee employee3 = new PartTimeEmployee("张定康", 60, 18);

        final EmployeeList list = new EmployeeList();
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.addEmployee(employee3);

        final Department hr = new HRDepartment();
        final Department fa = new FADepartment();

        System.out.println("hr查看员工工作时间:");
        list.accept(hr);
        System.out.println("财务部查看员工工资:");
        list.accept(fa);

    }
}
