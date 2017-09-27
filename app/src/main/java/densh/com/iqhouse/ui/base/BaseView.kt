package densh.com.iqhouse.ui.base

import android.content.Context
import android.support.annotation.StringRes

/**
 * Created by denglob on 9/26/17.
 */
interface BaseView {

    fun getContext(): Context

    fun showError(error: String?)

    fun showError(@StringRes stringResId: Int)

    fun showMessage(@StringRes srtResId: Int)

    fun showMessage(message: String)
}