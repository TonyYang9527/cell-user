package com.cell.user.page;

import java.io.Serializable;

/**
 * 对分页的基本数据进行一个简单的封装
 */
public class Page implements Serializable {

    private static final long serialVersionUID = 1552492668368861385L;

    protected int pageNo = 1;// 页码，默认是第一页

    protected int pageSize = 15;// 每页显示的记录数，默认是15

    protected boolean needTotalRecord = false; // 是否需要查询总记录数，设为false可以对不需要总记录数的分页查询，性能优化

    protected int totalRecord;// 总记录数

    protected int totalPage;

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
        // 在设置总页数的时候计算出对应的总页数，在下面的三目运算中加法拥有更高的优先级，所以最后可以不加括号。
        this.totalPage = totalRecord % pageSize == 0 ? totalRecord / pageSize : totalRecord / pageSize + 1;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isNeedTotalRecord() {
        return needTotalRecord;
    }

    public void setNeedTotalRecord(boolean needTotalRecord) {
        this.needTotalRecord = needTotalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public int getStart() {
        return (pageNo - 1) * pageSize;
    }

    public int getEnd() {
        return getStart() + pageSize;
    }

    @Override
    public String toString() {
        return "Page [pageNo=" + pageNo + ", pageSize=" + pageSize + ", needTotalRecord=" + needTotalRecord + ", totalRecord="
                + totalRecord + ", totalPage=" + totalPage + ", start=" + getStart() + ", end=" + getEnd() + "]";
    }
}
