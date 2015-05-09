package pl.mkorwel.spock.conditional

import groovy.transform.InheritConstructors

@InheritConstructors
class IntegrationTestClosure extends Closure<Boolean> {
    Boolean doCall() {
        false
    }
}