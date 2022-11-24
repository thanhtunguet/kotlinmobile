package info.thanhtunguet.truesight.filters


open class StringFilter : AdvancedFilter() {
    var equal: String? = null

    var notEqual: String? = null

    var contain: String? = null

    var notContain: String? = null

    var startWith: String? = null

    var notStartWith: String? = null

    var endWith: String? = null

    var notEndWith: String? = null
}