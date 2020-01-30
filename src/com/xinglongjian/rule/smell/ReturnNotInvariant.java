package com.xinglongjian.rule.smell;

/**
 * 坏味道
 * 当一个方法被设计为返回一个相同的值时，
 * 这样的设计是不合适的。
 */
class ReturnNotInvariant {
    //这个返回值有什么问题？
//    int foo(int a) {
//        int b = 12;
//        if (a == 1) {
//            return b;
//        }
//        return b;
//    }

    // 正确的
    int foo(int a) {
        int b = 12;
        return b;
    }











}
