package pers.caijx.prototype.deepclone;

import java.io.*;

/**
 * @ClassName DeepProtoType
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/19
 * @Version V1.0
 **/
public class DeepProtoType implements Serializable,Cloneable {

    private String name;

    private DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepProtoType() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    // 深拷贝 - 方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    // 深拷贝 - 方式2 通过对象的序列化实现推荐
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式出现

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
