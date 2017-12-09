package duongtung.com.mymvp.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by duong.thanh.tung on 08/12/2017.
 */

abstract class BaseActivity<VB : ViewDataBinding,V: IView, P : BasePresenter<V>>: AppCompatActivity(), IView {

    /**
     *
     * @return layout id : R.layout.<id>
     *
     **/
    abstract fun getLayoutId():Int

    /**
     *
     *@init Presenter
     *
     **/
    protected abstract fun initPresenter() : P

    open fun binding(){
    }

    protected  val presenter : P by lazy { initPresenter() }

    protected lateinit var binding : VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,getLayoutId())
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter!!.detachView()
    }

}
