package densh.com.iqhouse.ui.base

import android.view.View

/**
 * Created by denglob on 9/27/17.
 */
open class BasePresenterImpl<V: BaseView>: BasePresenter<V> {

    protected var mView: V? = null
    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }

}