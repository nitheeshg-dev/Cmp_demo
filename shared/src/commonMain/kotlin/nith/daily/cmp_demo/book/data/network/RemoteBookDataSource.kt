package nith.daily.cmp_demo.book.data.network

import nith.daily.cmp_demo.book.data.dto.BookWorkDto
import nith.daily.cmp_demo.book.data.dto.SearchResponseDto
import nith.daily.cmp_demo.core.domin.DataError
import nith.daily.cmp_demo.core.domin.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}