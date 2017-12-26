package duongtung.com.mymvvm

import android.util.Log
import android.widget.Toast
import duongtung.com.mymvvm.base.BaseViewModel
import duongtung.com.mymvvm.base.network.Repository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by duong.thanh.tung on 08/12/2017.
 */
class MainViewModel : BaseViewModel<MainVIew>() {
    fun getName(): String {
        Log.d("myLog", "=====================> hello")
        return "Hello everyone"
    }

    fun clickBtn() {
        Toast.makeText(getView()!!.getContext(), getView()!!.getEditText(), Toast.LENGTH_SHORT).show()
        getView()!!.showLoading("aaaaaaaaaaaaaaaaaaa")
        //    getView()!!.intent()
        requestLogin()
    }
git
    private fun requestLogin() {
        Repository.createService(ApiService::class.java).androidVersion()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ result ->
                    run {
                        result.forEach { android: Android -> Log.e("android: ", "" + android.toString()) }
                    }
                }, { error ->
                    run {
                        Log.e("requestLogin", "" + error.toString())

                    }
                })
    }
}
