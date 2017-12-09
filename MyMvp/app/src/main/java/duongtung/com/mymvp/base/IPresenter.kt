package duongtung.com.mymvp.base


/**
 * Created by FRAMGIA\duong.thanh.tung on 08/12/2017.
 */
interface IPresenter<V : IView> {
    fun getView(): V?

    fun attachView(view: V)

    fun detachView()
}