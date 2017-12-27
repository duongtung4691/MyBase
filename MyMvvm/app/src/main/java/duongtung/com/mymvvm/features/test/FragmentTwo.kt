package duongtung.com.mymvvm.features.test

import duongtung.com.mymvvm.R
import duongtung.com.mymvvm.base.fragment.BaseFragment
import duongtung.com.mymvvm.base.fragment.callback.ActivityCallBackFragment
import duongtung.com.mymvvm.databinding.FragmentTwoBinding

/**
 * Created by FRAMGIA\tong.xuan.an on 26/12/2017.
 */
class FragmentTwo : BaseFragment<FragmentTwoBinding, ActivityCallBackFragment>() {
    override fun initCallBack(): ActivityCallBackFragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getLayoutId(): Int = R.layout.fragment_two
}