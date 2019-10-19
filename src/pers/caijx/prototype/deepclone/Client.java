package pers.caijx.prototype.deepclone;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/19
 * @Version V1.0
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.setName("宋江");
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("大牛","小牛");
        p.setDeepCloneableTarget(deepCloneableTarget);

        // 方式1：完成深拷贝
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//        System.out.println("p.name = " + p.getName() +  " p.getDeepCloneableTarget().hashCode() = " + p.getDeepCloneableTarget().hashCode());
//        System.out.println("p2.name = " + p2.getName() +  " p2.getDeepCloneableTarget().hashCode() = " + p2.getDeepCloneableTarget().hashCode());

        // 方式2： 完成深拷贝
        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println("p.name = " + p.getName() +  " p.getDeepCloneableTarget().hashCode() = " + p.getDeepCloneableTarget().hashCode());
        System.out.println("p2.name = " + p2.getName() +  " p2.getDeepCloneableTarget().hashCode() = " + p2.getDeepCloneableTarget().hashCode());
    }
}
