package densh.com.iqhouse.ui.login

import densh.com.iqhouse.ui.base.BaseView

/**
 * Created by denglob on 9/26/17.
 */
interface LoginView: BaseView {
    fun onLoad()
    fun onFinished()
    fun onError()
}