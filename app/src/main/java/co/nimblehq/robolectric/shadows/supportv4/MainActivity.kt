package co.nimblehq.robolectric.shadows.supportv4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by luongvo on 11/25/18.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openFragment(TestFragment())
    }

    private fun openFragment(fragment: Fragment?) {
        if (fragment == null) {
            return
        }
        supportFragmentManager.beginTransaction()
            .replace(container.id, fragment)
            .commitNow()
    }
}
