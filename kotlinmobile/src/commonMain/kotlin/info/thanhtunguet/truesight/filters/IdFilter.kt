package info.thanhtunguet.truesight.filters

open class IdFilter<T> : AdvancedFilter() {
    var inList: List<T>? = listOf()

    var notInList: List<T>? = listOf()

    var equal: T? = null

    var notEqual: T? = null
}