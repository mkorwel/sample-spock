package pl.mkorwel.spock.conditional

import pl.mkorwel.spock.conditional.annotation.IntegrationTest
import spock.lang.Requires
import spock.lang.Specification


class ConfigurationTest extends Specification {

    @IntegrationTest
    def "conditional test v1"() {
        expect: true
    }

    @Requires(IntegrationTestClosure)
    def "conditional test v2"() {
        expect: true
    }
}