package nith.daily.cmp_demo.book.presentation.book_list

import nith.daily.cmp_demo.book.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String) : BookListAction
    data class OnBookClick(val book: Book) : BookListAction
    data class OnTabSelected(val index: Int) : BookListAction
}