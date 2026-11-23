package nith.daily.cmp_demo.book.presentation.book_list

import nith.daily.cmp_demo.core.presentation.UiText
import nith.daily.cmp_demo.book.domain.Book

data class BookListState(
    val searchQuery:String = "kotlin",
    val searchResult:List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading:Boolean = false,
    val selectedTabIndex:Int = 0,
    val errorMessage: UiText? = null
)