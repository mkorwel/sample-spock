package pl.mkorwel.spock.sample

import spock.lang.Specification

class AddTest extends Specification {

    def "should add two numer"(){
        given:
        def a = 1
        def b = 1

        when:
        def c = Math.addExact(a, b)

        then:
        c == 2
    }

    def "should add two number"() {
        expect:
        Math.addExact(a, b) == c

        where:
        a << [1, 2, 1]
        b << [1, 2, 3]
        c << [2, 4, 4]
    }

    def "should add two number - version 2"() {
        expect:
        Math.addExact(a, b) == c

        where:
        a | b || c
        1 | 1 || 2
        2 | 2 || 4
        1 | 3 || 4
    }
}
