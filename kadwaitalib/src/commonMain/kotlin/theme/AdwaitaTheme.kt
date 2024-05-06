package theme

import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.github.enteraname74.kadwaita.kadwaitalib.generated.resources.Cantarell_Bold
import com.github.enteraname74.kadwaita.kadwaitalib.generated.resources.Cantarell_BoldItalic
import com.github.enteraname74.kadwaita.kadwaitalib.generated.resources.Cantarell_Italic
import com.github.enteraname74.kadwaita.kadwaitalib.generated.resources.Cantarell_Regular
import com.github.enteraname74.kadwaita.kadwaitalib.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font

/**
 * Adwaita theme holding colors, typography...
 */
object AdwaitaTheme {

    @OptIn(ExperimentalResourceApi::class)
    val fontFamily: FontFamily
        @Composable
        get() = FontFamily(
            Font(Res.font.Cantarell_Regular, FontWeight.Normal),
            Font(Res.font.Cantarell_Bold, FontWeight.Bold),
            Font(Res.font.Cantarell_Italic, FontWeight.Normal, FontStyle.Italic),
            Font(Res.font.Cantarell_BoldItalic, FontWeight.Bold, FontStyle.Italic),
        )

    val typography: AdwaitaTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
}

@Composable
fun AdwaitaTheme(
    typography: AdwaitaTypography = AdwaitaTheme.typography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalTypography provides typography
    ) {
        ProvideTextStyle(
            value = typography.body,
            content = content
        )
    }
}