package fr.chenry

import androidx.test.ext.junit.runners.AndroidJUnit4
import io.mockk.confirmVerified
import io.mockk.spyk
import io.mockk.verify
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val mock = spyk<FailExample.() -> Unit>({})
        val failExample = FailExample(mock)

        verify { mock(failExample) }
        confirmVerified(mock)
    }
}
