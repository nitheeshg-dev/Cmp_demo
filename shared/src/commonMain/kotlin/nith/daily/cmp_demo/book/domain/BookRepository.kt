package nith.daily.cmp_demo.book.domain

import nith.daily.cmp_demo.core.domin.Result
import kotlinx.coroutines.flow.Flow
import nith.daily.cmp_demo.core.domin.DataError
import nith.daily.cmp_demo.core.domin.EmptyResult

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookId: String): Result<String?, DataError>

    fun getFavoriteBooks(): Flow<List<Book>>
    fun isBookFavorite(id: String): Flow<Boolean>
    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavorites(id: String)
}