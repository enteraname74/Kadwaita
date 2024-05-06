package theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Adwaita typography values.
 */
class AdwaitaTypography {
    val titleLarge: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 24.sp,
            fontWeight = FontWeight(300)
        )

    val title1: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 25.sp,
            fontWeight = FontWeight(800)
        )

    val title2: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 15.sp,
            fontWeight = FontWeight(800)
        )

    val title3: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 15.sp,
            fontWeight = FontWeight(700)
        )

    val title4: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 13.sp,
            fontWeight = FontWeight(700)
        )

    val heading: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 11.sp,
            fontWeight = FontWeight(700)
        )

    val body: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 11.sp,
            fontWeight = FontWeight(400)
        )

    val captionHeading: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 9.sp,
            fontWeight = FontWeight(700)
        )

    val caption: TextStyle
        @Composable
        get() = TextStyle(
            fontFamily = AdwaitaTheme.fontFamily,
            fontSize = 9.sp,
            fontWeight = FontWeight(400)
        )
}
