package pl.mkorwel.spock.sample

import spock.lang.Specification

class SampleTest extends Specification {

    def sample(){
        given:
        def a = 1
        def b = 1

        when:
        def c = Math.addExact(a, b)

        then:
        c == 2
    }
}
