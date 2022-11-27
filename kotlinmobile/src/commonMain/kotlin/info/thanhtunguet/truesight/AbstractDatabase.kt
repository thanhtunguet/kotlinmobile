package info.thanhtunguet.truesight

import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import io.realm.kotlin.types.RealmObject
import kotlin.reflect.KClass

abstract class AbstractDatabase {
    abstract val schema: Set<KClass<out RealmObject>>

    protected var mRealm: Realm

    public val realm: Realm
        get() = mRealm

    init {
        val config = RealmConfiguration
            .Builder(schema)
            .build()
        mRealm = Realm.open(config)
    }

    fun close() {
        mRealm.close()
    }

    fun isClosed(): Boolean {
        return mRealm.isClosed()
    }
}
