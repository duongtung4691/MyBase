package duongtung.com.mymvvm

import android.content.Context
import android.content.Intent
import duongtung.com.mymvvm.base.BaseActivity
import duongtung.com.mymvvm.databinding.ActivityMainBinding
import duongtung.com.mymvvm.features.test.ActivityTest

class MainActivity : BaseActivity<ActivityMainBinding, MainVIew, MainViewModel>(), MainVIew {
    override fun getEditText(): String {
        return binding.testText.text.toString()
    }

    override fun binding() {
        binding.presenter = presenter
    }

    override fun intent() {
        val intent = Intent(this, ActivityTest::class.java)
        startActivity(intent)
    }

    override fun initPresenter(): MainViewModel = MainViewModel()

    override fun showLoading(text: String) = binding.testText.setText(text)

    override fun hideLoading() {
    }

    override fun getContext(): Context = this

    override fun getLayoutId(): Int = R.layout.activity_main

}
