package co.nimblehq.robolectric.shadows.supportv4

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_test.*
import org.amshove.kluent.shouldEqual
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.shadows.support.v4.SupportFragmentController

@RunWith(RobolectricTestRunner::class)
class TestFragmentTest {

    private lateinit var fragment: TestFragment

    @Before
    fun setup() {
        fragment = SupportFragmentController.of(TestFragment(), MainActivity::class.java, Intent())
            .create(R.id.container, Bundle.EMPTY)
            .start()
            .resume()
            .visible()
            .get()
    }

    @Test
    fun `When initialize, all texts display correctly`() {
        fragment.tvTest.text shouldEqual "Test"
    }

}
