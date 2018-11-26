package co.nimblehq.robolectric.shadows.supportv4.adapter

import co.nimblehq.robolectric.shadows.supportv4.AAAFragment

class TabAdapter(fragmentManager: androidx.fragment.app.FragmentManager) : SmartFragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): androidx.fragment.app.Fragment = when (position) {
        0 -> AAAFragment.newInstance()
        else -> throw IllegalArgumentException("Hotel info tab position is invalid")
    }

    override fun getCount(): Int = 1

}
