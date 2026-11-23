package nith.daily.cmp_demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import nith.daily.cmp_demo.book.domain.Book
import nith.daily.cmp_demo.book.presentation.book_list.BookListScreen
import nith.daily.cmp_demo.book.presentation.book_list.BookListScreenRoot
import nith.daily.cmp_demo.book.presentation.book_list.BookListState
import nith.daily.cmp_demo.book.presentation.book_list.components.BookSearchBar
import kotlin.collections.emptyList

//@Preview()
@Composable
fun BookSearchBarPreview(){
    MaterialTheme{
        Box(modifier = Modifier.fillMaxWidth().
        background(Color.White))
        {
            BookSearchBar(
                "Kotlin",
                onSearchQueryChange = {

                },
                onImeSearch = {

                },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

private val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("Philipp Lackner"),
        description = "Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.67854,
        ratingCount = 5,
        numPages = 100,
        numEditions = 3
    )
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResult = books
        ),
        onAction = {}
    )
}