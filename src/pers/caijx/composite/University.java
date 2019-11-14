package pers.caijx.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName University
 * @Description: University就是Componsite，可以管理College
 * @Author JunXiangCai
 * @Date 2019/11/14
 * @Version V1.0
 **/
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    /**
     * 构造器
     * @param name
     * @param des
     */
    public University(String name, String des) {
        super(name, des);
    }

    /**
     * 重写add
     * @param organizationComponent
     */
    @Override
    protected void add(OrganizationComponent organizationComponent) {
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
     * print方法，输出University包含的学院
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
