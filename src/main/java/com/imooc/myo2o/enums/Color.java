package com.imooc.myo2o.enums;

/**
 * @author luoly
 * @date 2018/9/21 11:34
 * @description
 */
public enum Color {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    // 构造枚举值，比如RED(255,0,0)
    private Color(int r, int g, int b) {
        this.redValue = r;
        this.greenValue = g;
        this.blueValue = b;
    }

    public String toString() {
        return super.toString() + "(" + redValue + "," + greenValue + "," + blueValue + ")";
    }

    // 自定义数据域，private为了封装。
    private int redValue;
    private int greenValue;
    private int blueValue;
}

class t {
    public static void main(String[] args) {
        Color c = Color.RED;
        System.out.println(c);
    }
}