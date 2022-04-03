package es.andresbailen.custombottomnavigationviewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import es.andresbailen.custombottomnavigationviewpager2.fragments.FirstPageFragment
import es.andresbailen.custombottomnavigationviewpager2.fragments.SecondPageFragment
import es.andresbailen.custombottomnavigationviewpager2.fragments.ThirdPageFragment

class MainAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstPageFragment.newInstance()
            1 -> SecondPageFragment.newInstance()
            else -> ThirdPageFragment.newInstance()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}