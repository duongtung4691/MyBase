package duongtung.com.mymvp

import android.content.Context
import android.databinding.Bindable
import android.databinding.InverseMethod
import android.util.Log
import duongtung.com.mymvp.base.BasePresenter

/**
 * Created by FRAMGIA\duong.thanh.tung on 08/12/2017.
 */
class MainPresenter(context : Context) : BasePresenter<MainVIew>(context) {

    override fun detachView() {
    }

    fun getName() : String {
        Log.d("myLog","=====================> hello")
        return "Hello everyone"
    }
}