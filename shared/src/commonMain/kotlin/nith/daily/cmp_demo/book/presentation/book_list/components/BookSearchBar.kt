package nith.daily.cmp_demo.book.presentation.book_list.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.ui.Modifier
import cmp_demo.shared.generated.resources.Res
import cmp_demo.shared.generated.resources.compose_multiplatform
import cmp_demo.shared.generated.resources.search_hint
import nith.daily.cmp_demo.core.presentation.DarkBlue
import nith.daily.cmp_demo.core.presentation.SandYellow
import org.jetbrains.compose.resources.stringResource


@Composable
fun BookSearchBar(
    searchQuery:String,
    onSearchQueryChange: (String)-> Unit,
    onImaSearch: () -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = {

        },
         shape = RoundedCornerShape(100),
        colors = OutlinedTextFieldDefaults.colors(
            cursorColor = DarkBlue,
            focusedBorderColor = SandYellow
        ),
        placeholder = {
            Text(text = stringResource(Res.string.search_hint))
        },
        leadingIcon = {
            Icon(imageVector = Res.drawable.compose_multiplatform)
        }
    )
}