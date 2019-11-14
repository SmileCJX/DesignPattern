package pers.caijx.composite;

/**
 * @ClassName Department
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/14
 * @Version V1.0
 **/
public class Department extends OrganizationComponent {

    // 没有集合，是最小单位

    public Department(String name, String des) {
        super(name, des);
    }

    // add，remove方法，就不用写了，因为它是叶子节点


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
