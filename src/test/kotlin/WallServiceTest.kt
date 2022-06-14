import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addNoZero() {
        val post = WallService.add(Post(0L, 0L, 0L, 0L, 0L, 0L))
        assertNotEquals(0, post.id)
    }

    @Test
    fun updateExists() {
        val post = WallService.add(Post(0L, 0L, 0L, 0L, 0L, 0L))
        val exists = WallService.update(post.copy(text = "another text"))
        assertTrue(exists)
    }

    @Test
    fun updateNotExists() {
        val post = WallService.add(Post(0L, 0L, 0L, 0L, 0L, 0L))
        val exists = WallService.update(post.copy(text = "another text", id = post.id + 1))
        assertFalse(exists)
    }
}