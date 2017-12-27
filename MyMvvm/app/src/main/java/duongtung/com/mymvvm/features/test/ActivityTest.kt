package duongtung.com.mymvvm.features.test

import android.content.Context
import android.util.Log
import duongtung.com.mymvvm.R
import duongtung.com.mymvvm.User
import duongtung.com.mymvvm.base.BaseActivity
import duongtung.com.mymvvm.databinding.ActivityTestBinding

/**
 * Created by FRAMGIA\tong.xuan.an on 19/12/2017.
 */
class ActivityTest : BaseActivity<ActivityTestBinding, TestView, TestActivityViewModel>(), TestView {
    override fun getContext(): Context = this
    override fun binding() {
        binding.presenter = presenter
        binding.model = User("xuanan")
    }

    override fun getLayoutId(): Int = R.layout.activity_test

    override fun initPresenter(): TestActivityViewModel = TestActivityViewModel()
    override fun addFragment() {
        Log.e("ActivityTest", "addFragment")
        addFragment(R.id.llTestFragment, FragmentOne(), "FragmentOne")
    }

    override fun replaceFragment() {
        replaceAndAdd(R.id.llTestFragment, FragmentTwo(), "fragmentTow")
    }

}