import java.time.LocalDate

data class Post(
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val signerId: Long,
    val date: LocalDate = LocalDate.now(),
    val text: String = "",
    val friendsOnly: Boolean = false,
    val comments: ArrayList<String> = ArrayList(),
    val likes: Int = 0,
    val reposts: Int = 0,
    val postType: String = "Simple",
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val id: Long = 0
)
