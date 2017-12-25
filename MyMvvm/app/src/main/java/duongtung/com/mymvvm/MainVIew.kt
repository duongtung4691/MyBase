package duongtung.com.mymvvm

import duongtung.com.mymvvm.base.IView

interface MainVIew : IView {
    fun showLoading(text: String)
    fun hideLoading()
    fun getEditText(): String
    fun intent()
}