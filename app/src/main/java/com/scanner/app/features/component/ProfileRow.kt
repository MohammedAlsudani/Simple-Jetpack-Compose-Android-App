package com.scanner.app.features.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.scanner.app.R
import com.scanner.app.features.screen.main.MainViewModel
import com.scanner.app.features.theme.ScannerTheme

/**
 * Composable function for displaying a profile row.
 *
 * @param mainViewModel ViewModel for the main screen.
 */
@Composable
fun ProfileRow(mainViewModel: MainViewModel) {
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(ScannerTheme.dimensions.dimension4))
            .background(ScannerTheme.colors.secondary)
            .fillMaxWidth()
            .padding(ScannerTheme.dimensions.dimension16),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Jonathan",
            style = ScannerTheme.typography.labelMediumBold
        )
        Image(
            modifier = Modifier.height(ScannerTheme.dimensions.dimension28),
            painter = painterResource(id = R.drawable.ic_dxb_word_mark),
            contentDescription = "Qr Code Status Image"
        )
    }
}