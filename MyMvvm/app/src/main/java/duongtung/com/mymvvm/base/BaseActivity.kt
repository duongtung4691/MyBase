package duongtung.com.mymvvm.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity

/**
 * Created by duong.thanh.tung on 08/12/2017.
 */

abstract class BaseActivity<VB : ViewDataBinding, V : IView, out P : BasePresenter<V>> : AppCompatActivity(), IView {

    /**
     *
     * @return layout id : R.layout.<id>
     *
     **/
    abstract fun getLayoutId(): Int

    /**
     *
     *@init Presenter
     *
     **/
    protected abstract fun initPresenter(): P

    /**
     * set variable data
     * **/
    open fun binding() {
    }

    protected val presenter: P by lazy { initPresenter() }

    protected lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        presenter.attachView(this as V)
        binding()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter!!.detachView()
    }

    /**
     * add fragment in backstack
     * **/
    fun addFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction().add(fragment, tag).commit()
    }

    fun replaceFragment(id: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, fragment).commit()
    }

    fun replaceFragment(id: Int, fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction().replace(id, fragment, tag).commit()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.fragments.size > 0) {
            back()
        } else {
            finish()
        }
    }

    /**
     * pop fragment by tag
     * **/
    fun back(tag: String) {
        supportFragmentManager.popBackStack(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }

    private fun back() {
        supportFragmentManager.popBackStack()
    }

}
