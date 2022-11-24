package info.thanhtunguet.truesight

import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import io.realm.kotlin.types.RealmObject
import kotlin.reflect.KClass

abstract class AbstractDatabase {
    abstract val schema: Set<KClass<out RealmObject>>

    protected var realmObject: Realm

    public val realm: Realm
        get() = realmObject

    init {
        val config = RealmConfiguration
            .Builder(schema)
            .build()
        realmObject = Realm.open(config)
    }

    fun close() {
        realmObject.close()
    }

    fun isClosed(): Boolean {
        return realmObject.isClosed()
    }
}
