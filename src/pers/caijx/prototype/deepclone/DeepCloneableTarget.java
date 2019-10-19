package pers.caijx.prototype.deepclone;

import java.io.Serializable;

/**
 * @ClassName DeepCloneableTarget
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/19
 * @Version V1.0
 **/
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    // 因为该类的属性都是String，因此这里使用默认的克隆方法完成即可。
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
