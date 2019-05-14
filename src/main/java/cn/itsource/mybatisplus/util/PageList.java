package cn.itsource.mybatisplus.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzctuoxie
 * @version v1.0
 * @description: TODO
 * @date 2019/5/14
 * @ClassName:
 *
 * 封装分页数据
 */
public class PageList<T> {

    private long total;/*总条目数*/
    private List<T> rows = new ArrayList<T>();/*当前页的数据*/

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageList() {
    }

    public PageList(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

}
