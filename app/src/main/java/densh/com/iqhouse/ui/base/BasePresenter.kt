package densh.com.iqhouse.ui.base

/**
 * Created by denglob on 9/26/17.
 */
interface BasePresenter<in V : BaseView> {
    fun attachView(view: V)
    fun detachView()
}