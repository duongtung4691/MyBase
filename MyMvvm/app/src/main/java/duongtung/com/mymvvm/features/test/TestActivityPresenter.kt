package duongtung.com.mymvvm.features.test

import android.util.Log
import android.widget.Toast
import duongtung.com.mymvvm.MainVIew
import duongtung.com.mymvvm.base.BasePresenter

/**
 * Created by FRAMGIA\tong.xuan.an on 19/12/2017.
 */
class TestActivityPresenter : BasePresenter<TestView>() {

    fun btnClick() {
        Log.e("btnClick","click")
        Toast.makeText(getView()!!.getContext(), "click", Toast.LENGTH_SHORT).show()
        getView()!!.addFragment()
    }
}