package densh.com.iqhouse.app

import android.app.Application

import densh.com.iqhouse.ui.util.context

/**
 * Created by denglob on 9/24/17.
 */
class Application: Application() {
    init {
        context = applicationContext
    }
}