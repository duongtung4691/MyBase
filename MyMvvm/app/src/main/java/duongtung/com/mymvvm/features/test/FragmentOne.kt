package duongtung.com.mymvvm.features.test

import duongtung.com.mymvvm.MainFragmentCallback
import duongtung.com.mymvvm.R
import duongtung.com.mymvvm.base.fragment.BaseFragment
import duongtung.com.mymvvm.databinding.FragmentTestBinding

/**
 * Created by FRAMGIA\tong.xuan.an on 21/12/2017.
 */
class FragmentOne : BaseFragment<FragmentTestBinding, MainFragmentCallback>() {

    override fun initCallBack(): MainFragmentCallback = context as MainFragmentCallback

    override fun getLayoutId(): Int = R.layout.fragment_test

}