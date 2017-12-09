package duongtung.com.mymvp

import android.util.Log
import duongtung.com.mymvp.base.BasePresenter

/**
 * Created by FRAMGIA\duong.thanh.tung on 08/12/2017.
 */
class MainPresenter() : BasePresenter<MainVIew>() {

    fun getName() : String {
        Log.d("myLog","=====================> hello")
        return "Hello everyone"
    }
}