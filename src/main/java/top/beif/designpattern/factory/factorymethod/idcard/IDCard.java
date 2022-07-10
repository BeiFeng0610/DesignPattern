package top.beif.designpattern.factory.factorymethod.idcard;

import top.beif.designpattern.factory.factorymethod.framework.Product;

/**
 * @author 16116
 */
public class IDCard extends Product {
    private String owner;
    private int cid;

    IDCard(String owner,int cid) {
        this.cid = cid;
        this.owner = owner;
        System.out.println("制作了" + owner + "的 ID 卡，卡号为：" + cid);
    }

    @Override
    public void use() {
        System.out.println("使用了" + owner + "的 ID 卡。");
    }

    public String getOwner(){
        return owner;
    }

    public int getCid() {
        return cid;
    }
}
