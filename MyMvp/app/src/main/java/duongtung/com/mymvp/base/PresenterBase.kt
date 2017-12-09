package duongtung.com.mymvp.base

import android.icu.lang.UCharacter.GraphemeClusterBreak.V



/**
 * Created by FRAMGIA\duong.thanh.tung on 08/12/2017.
 */
interface PresenterBase<V : ViewBase> {
    fun getView(): V?

    fun attachView(view: V)

    fun detachView()
}