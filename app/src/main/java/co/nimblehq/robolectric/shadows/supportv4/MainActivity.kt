package co.nimblehq.robolectric.shadows.supportv4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.nimblehq.robolectric.shadows.supportv4.adapter.TabAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by luongvo on 11/25/18.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        openFragment(TestFragment())

        val hotelInfoTabAdapter = TabAdapter(supportFragmentManager)
        viewPagerHotelInfo.adapter = hotelInfoTabAdapter
    }

//    private fun openFragment(fragment: Fragment?) {
//        if (fragment == null) {
//            return
//        }
//        supportFragmentManager.beginTransaction()
//            .replace(container.id, fragment)
//            .commitNow()
//    }
}
