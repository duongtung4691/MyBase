package duongtung.com.mymvp

import android.content.Context
import duongtung.com.mymvp.base.BaseActivity
import duongtung.com.mymvp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding,MainVIew, MainPresenter>(), MainVIew {

    override fun binding() {
        binding.presenter = presenter
    }

    override fun initPresenter(): MainPresenter {
        return MainPresenter()
    }

    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun getContext(): Context {
        return this
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

}
