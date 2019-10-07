package pers.caijx.uml.implementation;

/**
 * @ClassName PersonServcieBean
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/7
 * @Version V1.0
 **/
public class PersonServcieBean implements PersonService {

    @Override
    public void delete(Integer id) {
        System.out.println("delete ... ");
    }
}
