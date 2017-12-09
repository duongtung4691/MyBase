package duongtung.com.mymvp.base

import java.lang.ref.WeakReference

/**
 * Created by FRAMGIA\duong.thanh.tung on 08/12/2017.
 */
abstract class BasePresenter<V : IView> :  IPresenter<V>{

    private var viewRef: WeakReference<V>? = null

    override fun getView(): V? = if (viewRef == null) null else viewRef?.get()

    protected lateinit var v : V

    override fun attachView(view: V) {
        viewRef = WeakReference(view)
    }

    override fun detachView() {
        viewRef?.clear()
        viewRef = null
    }
}