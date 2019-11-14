package pers.caijx.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName College
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/14
 * @Version V1.0
 **/
public class College extends OrganizationComponent {

    // 这个List中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    /**
     * 构造器
     * @param name
     * @param des
     */
    public College(String name, String des) {
        super(name, des);
    }

    /**
     * 重写add
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 将来实际业务中，College和University的add不一定完全一样
        organizationComponents.add(organizationComponent);
    }

    /**
     * 重写remove
     * @param organizationComponent
     */
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    /**
     * print方法，输出College包含的学院
     */
    @Override
    protected void print() {
        System.out.println("----------------" + getName() + "---------------------");
        // 遍历 organizationComponents
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
