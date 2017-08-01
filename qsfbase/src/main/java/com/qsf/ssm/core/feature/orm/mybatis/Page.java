package com.qsf.ssm.core.feature.orm.mybatis;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.RowBounds;

/**
 * Mybatis分页参数及查询结果封�?. 注意�?有序号从1�?�?.
 * 
 * @param <T>
 *            Page中记录的类型.
 * @author StarZou
 * @since 2014�?5�?18�? 下午1:34:32
 **/
public class Page<T> extends RowBounds {
    // --分页参数 --//
    /**
     * 页编�? : 第几�?
     */
    protected int pageNo = 1;
    /**
     * 页大�? : 每页的数�?
     */
    protected int pageSize = 15;

    /**
     * 偏移�? : 第一条数据在表中的位�?
     */
    protected int offset;

    /**
     * 限定�? : 每页的数�?
     */
    protected int limit;

    // --结果 --//
    /**
     * 查询结果
     */
    protected List<T> result = new ArrayList<T>();

    /**
     * 总条�?
     */
    protected int totalCount;

    /**
     * 总页�?
     */
    protected int totalPages;

    // --计算 数据�? 查询的参�? : LIMIT 3, 3; LIMIT offset, limit; --//
    /**
     * 计算偏移�?
     */
    private void calcOffset() {
        this.offset = ((pageNo - 1) * pageSize);
    }

    /**
     * 计算限定�?
     */
    private void calcLimit() {
        this.limit = pageSize;
    }

    // -- 构�?�函�? --//
    public Page() {
        this.calcOffset();
        this.calcLimit();
    }

    public Page(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.calcOffset();
        this.calcLimit();
    }

    // -- 访问查询参数函数 --//
    /**
     * 获得当前页的页号,序号�?1�?�?,默认�?1.
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * 获得每页的记录数�?,默认�?1.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 根据pageNo和pageSize计算当前页第�?条记录在总结果集中的位置,序号�?1�?�?.
     */
    public int getFirst() {
        return ((pageNo - 1) * pageSize) + 1;
    }

    /**
     * 根据pageNo和pageSize计算当前页第�?条记录在总结果集中的位置,序号�?0�?�?.
     */
    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    // -- 访问查询结果函数 --//
    /**
     * 取得页内的记录列�?.
     */
    public List<T> getResult() {
        return result;
    }

    /**
     * 设置页内的记录列�?.
     */
    public void setResult(final List<T> result) {
        this.result = result;
    }

    /**
     * 取得总记录数, 默认值为-1.
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 设置总记录数.
     */
    public void setTotalCount(final int totalCount) {
        this.totalCount = totalCount;
        this.totalPages = this.getTotalPages();
    }

    /**
     * 根据pageSize与totalCount计算总页�?, 默认值为-1.
     */
    public int getTotalPages() {
        if (totalCount < 0) {
            return -1;
        }
        int pages = totalCount / pageSize;
        return totalCount % pageSize > 0 ? ++pages : pages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

}
