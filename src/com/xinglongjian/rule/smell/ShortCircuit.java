package com.xinglongjian.rule.smell;

/**
 * 坏味道
 * 应该使用短路逻辑
 */
public class ShortCircuit {

    public static void main(String[] args) {
        //这里使用按位或运算符有什么问题？
//        if(getTrue() | getFalse()) {
//            System.out.println("胜利!");
//        }

        //优化后
        if(getTrue() || getFalse()) {
            System.out.println("胜利!");
        }
    }

    private static boolean getTrue(){
        System.out.println("执行True");
        return true;
    }

    private static boolean getFalse(){
        System.out.println("执行False");
        return false;
    }

}
