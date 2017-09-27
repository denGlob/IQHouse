package densh.com.iqhouse.app

import android.app.Application

/**
 * Created by denglob on 9/24/17.
 */
class IqApplication : Application() {
    init {
        context = applicationContext
    }
}