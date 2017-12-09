package duongtung.com.mymvp

import android.content.Context
import android.databinding.Bindable
import android.databinding.InverseMethod
import android.util.Log
import duongtung.com.mymvp.base.BasePresenter

/**
 * Created by duong.thanh.tung on 08/12/2017.
 */
class MainPresenter() : BasePresenter<MainVIew>() {

    fun getName() : String {
        Log.d("myLog","=====================> hello")
        return "Hello everyone"
    }
}