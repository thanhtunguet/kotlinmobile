package info.thanhtunguet.truesight.filters


open class NumberFilter<T> : AdvancedFilter() {
    var equal: T? = null

    var notEqual: T? = null

    var less: T? = null

    var greater: T? = null

    var greaterEqual: T? = null

    var lessEqual: T? = null
}