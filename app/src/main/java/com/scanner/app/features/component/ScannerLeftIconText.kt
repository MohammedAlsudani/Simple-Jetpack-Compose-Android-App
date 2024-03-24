package com.scanner.app.features.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.scanner.app.R
import com.scanner.app.features.theme.ScannerTheme


@Composable
fun ScannerLeftIconText(
    text: String,
    icon: Painter,
    modifier: Modifier = Modifier,
    iconColor: Color = ScannerTheme.colors.primary,
    textColor: Color = ScannerTheme.colors.primary,
    fontSize: TextUnit = TextUnit.Unspecified,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textAlign: TextAlign? = null,
    style: TextStyle = ScannerTheme.typography.bodyMedium,
    lineHeight: TextUnit = TextUnit.Unspecified,
    maxLines: Int = Int.MAX_VALUE,
    overflow: TextOverflow = TextOverflow.Clip
) {
    Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
        Icon(
            modifier = Modifier.padding(ScannerTheme.dimensions.dimension10),
            painter = icon,
            contentDescription = null,
            tint = iconColor
        )
        Text (
            text = AnnotatedString(text),
            modifier = modifier,
            color = textColor,
            fontSize = fontSize,
            letterSpacing = letterSpacing,
            textAlign = textAlign,
            style = style,
            lineHeight = lineHeight,
            maxLines = maxLines,
            overflow = overflow
        )
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun BodyPreview() {
    ScannerLeftIconText("Scanner Text", icon = painterResource(id = R.drawable.ic_calendar_month), Modifier)
}