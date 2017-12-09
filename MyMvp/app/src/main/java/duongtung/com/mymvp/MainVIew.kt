package duongtung.com.mymvp

import duongtung.com.mymvp.base.ViewBase

/**
 * Created by FRAMGIA\duong.thanh.tung on 08/12/2017.
 */
interface MainVIew : ViewBase{
    fun showLoading()
    fun hideLoading()
    fun getControler()
}