package cn.lonsun.key;

/**
 * @author gu.fei
 * @version 2016-07-21 11:24
 */
public class CacheValue {

    private long minVal;
    private long maxVal;

    public CacheValue() {
        this.minVal = 0L;
        this.maxVal = 0L;
    }

    public String toString() {
        return "{ minVal = " + this.minVal + " || maxVal = " + this.maxVal + " }";
    }

    public long getMinVal() {
        return minVal;
    }

    public void setMinVal(long minVal) {
        this.minVal = minVal;
    }

    public long getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(long maxVal) {
        this.maxVal = maxVal;
    }
}
