package co.nimblehq.robolectric.shadows.supportv4.adapter

import android.util.SparseArray
import android.view.ViewGroup

abstract class SmartFragmentStatePagerAdapter(
    fragmentManager: androidx.fragment.app.FragmentManager
) : androidx.fragment.app.FragmentStatePagerAdapter(fragmentManager) {

    /**
     * Sparse array to keep track of registered fragments in memory
     */
    private val registeredFragments = SparseArray<androidx.fragment.app.Fragment>()

    /**
     * Register the fragment when the item is instantiated
     */
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val fragment = super.instantiateItem(container, position) as androidx.fragment.app.Fragment
        registeredFragments.put(position, fragment)
        return fragment
    }

    /**
     * Unregister when the item is inactive
     */
    override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
        registeredFragments.remove(position)
        super.destroyItem(container, position, obj)
    }

    /**
     * Returns the fragment for the position (if instantiated)
     */
    fun getRegisteredFragment(position: Int): androidx.fragment.app.Fragment? {
        return registeredFragments.get(position)
    }
}
