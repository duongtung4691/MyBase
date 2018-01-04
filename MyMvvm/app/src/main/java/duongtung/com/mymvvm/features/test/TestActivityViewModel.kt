package duongtung.com.mymvvm.features.test

import android.util.Log
import android.widget.Toast
import duongtung.com.mymvvm.base.BaseViewModel

/**
 * Created by FRAMGIA\tong.xuan.an on 19/12/2017.
 */
class TestActivityViewModel : BaseViewModel<TestView>() {

    fun btnAddClick() {
        Log.e("btnClick", "click")
        Toast.makeText(getView()!!.getContext(), "click", Toast.LENGTH_SHORT).show()
        getView()!!.addFragment()
    }

    fun btnRClick() {
        Log.e("btnRClick", "click")
        getView()!!.replaceFragment()

    }
}