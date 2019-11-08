package pers.caijx.bridge;

/**
 * @ClassName Phone
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public abstract class Phone {

    /**
     * 组合品牌
     */
    private Brand brand;

    /**
     * 构造器
     * @param brand
     */
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void call() {
        this.brand.call();
    }

    protected void close() {
        this.brand.close();
    }
}
