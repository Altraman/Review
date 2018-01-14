package visitor;

/**
 * Created by HuQiang on 2018/1/9.
 */
public abstract class Department {
    public abstract void visit(FullTimeEmployee employee);

    public abstract void visit(PartTimeEmployee employee);
}
