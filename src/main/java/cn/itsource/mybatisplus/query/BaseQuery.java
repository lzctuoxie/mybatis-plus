package cn.itsource.mybatisplus.query;

/**
 * @author lzctuoxie
 * @version v1.0
 * @description: TODO
 * @date 2019/5/14
 * @ClassName:
 */
public class BaseQuery {

    private int page = 1;
    private int size = 10;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
