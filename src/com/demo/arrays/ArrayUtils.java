package com.demo.arrays;

import java.util.Arrays;

/**
 * 数组是定长的，一旦初始化声明后是不可改变长度的。
 * 那么如何来实现变长数组呢？我们可以利用 List 集合 add 方法里面的扩容思路来模拟实现
 *
 */
public class ArrayUtils {

	/**
     * @desc 对数组进行扩容
     * @param <T>
     * @param datas 原始数组
     * @param newLen 扩容大小
     * @return T[]
     */
	public static <T> T[] expandCapacity(T[] datas, int newLen){
		newLen = newLen < 0 ? datas.length : datas.length + newLen;
		return Arrays.copyOf(datas, newLen);
	}
	
	/**
     * @desc 对数组进行扩容处理，1.5倍
     * @param <T>
     * @param datas  原始数组
     * @return T[]
     */
	public static <T> T[] expandCapacity(T[] datas){
		int newLen = (datas.length * 3) / 2;      //扩容原始数组的1.5倍
		return Arrays.copyOf(datas, newLen);
	}
	
	/**
     * @desc 对数组进行扩容处理，
     * @param <T>
     * @param datas 原始数组
     * @param mulitiple 扩容的倍数
     * @return T[]
     */
    public static <T> T[] expandCapacityMul(T[] datas,int mulitiple){
        mulitiple = mulitiple < 0 ? 1 : mulitiple;
        int newLen = datas.length * mulitiple;
        return Arrays.copyOf(datas,newLen );
    }
}
