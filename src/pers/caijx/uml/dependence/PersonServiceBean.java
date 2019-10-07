package pers.caijx.uml.dependence;

/**
 * @ClassName PersonServiceBean
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/7
 * @Version V1.0
 **/
public class PersonServiceBean {

    private PersonDao personDao;  // 类

    public void save(Person person) {

    }

    public IDCard getIDCard(Integer personid) {
        return null;
    }

    public void modify() {
        Department department = new Department(); // 违反了迪米特法则
    }
}
