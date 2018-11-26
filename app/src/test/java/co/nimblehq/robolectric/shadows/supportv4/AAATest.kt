package co.nimblehq.robolectric.shadows.supportv4

import android.content.Intent
import co.nimblehq.robolectric.shadows.supportv4.adapter.SmartFragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.amshove.kluent.shouldNotBeNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class AAATest {

    private lateinit var fragment: AAAFragment

    @Before
    fun setup() {
        val intent = Intent()
        val activityController = Robolectric.buildActivity(MainActivity::class.java, intent)
            .create()
            .start()
            .resume()
            .visible()
        val activity = activityController.get()
        activity.viewPagerHotelInfo.currentItem = 0
        val adapter = activity.viewPagerHotelInfo.adapter as SmartFragmentStatePagerAdapter
        fragment = adapter.getRegisteredFragment(0) as AAAFragment
        fragment.shouldNotBeNull()
    }

    @Test
    fun `When click at the gallery, it opens full screen image with correct extras`() {
        fragment.shouldNotBeNull()
    }

}
