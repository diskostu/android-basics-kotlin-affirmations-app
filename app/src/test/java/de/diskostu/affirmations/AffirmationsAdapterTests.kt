package de.diskostu.affirmations

import android.content.Context
import de.diskostu.affirmations.adapter.ItemAdapter
import de.diskostu.affirmations.model.Affirmation
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val mockContext = mock(Context::class.java)

    @Test
    fun adapter_size() {
        // arrange
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        // act
        val adapter = ItemAdapter(mockContext, data)

        // assert
        assertThat(adapter.itemCount).isEqualTo(data.size)
    }
}