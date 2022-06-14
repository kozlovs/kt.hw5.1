object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0L

    fun add(post: Post): Post {
        posts += post.copy(id = getId())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, thisPost) in posts.withIndex()) {
            if (thisPost.id == post.id) {
                posts[index] = post.copy(
                    ownerId = thisPost.ownerId,
                    date = thisPost.date
                )
                return true
            }
        }
        return false
    }

    private fun getId(): Long {
        lastId += 1
        return lastId
    }
}