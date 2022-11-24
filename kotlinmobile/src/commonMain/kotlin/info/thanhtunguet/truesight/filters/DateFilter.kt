package info.thanhtunguet.truesight.filters

import kotlinx.datetime.LocalDateTime

open class DateFilter : AdvancedFilter() {
    var equal: LocalDateTime? = null

    var notEqual: LocalDateTime? = null

    var less: LocalDateTime? = null

    var greater: LocalDateTime? = null

    var greaterEqual: LocalDateTime? = null

    var lessEqual: LocalDateTime? = null
}