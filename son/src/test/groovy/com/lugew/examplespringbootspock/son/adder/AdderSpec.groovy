package com.lugew.examplespringbootspock.son.adder

import spock.lang.Specification

/**
 * @author LuGew*
 * @since 2020/12/8
 */
class AdderSpec extends Specification {
    def "加法返回正确值 #a+#b=#c"() {
        given: "初始化加法器"
        Adder adder = new Adder()
        expect: "返回正确值"
        adder.add(a, b) == c
        where: "例子"
        a | b  || c
        1 | 1  || 2
        2 | 1  || 3
        2 | 0  || 2
        0 | 0  || 0
        1 | -1 || 0
    }
}
