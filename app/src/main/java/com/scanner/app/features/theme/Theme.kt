package com.scanner.app.features.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


/**
 * Theme object that provides access to [ScannerTheme] systems via convenience properties.
 */
object ScannerTheme {

    val colors: ColorScheme
        @Composable
        get() = MaterialTheme.colorScheme

    val typography: ScannerTypography
        @Composable
        get() = LocalTypography.current

    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes

    val dimensions: ScannerDimension
        @Composable
        get() = LocalDimensions.current
}


@Composable
fun ScannerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    typography: ScannerTypography = ScannerTheme.typography,
    dimension: ScannerDimension = ScannerTheme.dimensions,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.background.toArgb()
            window.navigationBarColor = colorScheme.background.toArgb()
            // support for light theme
//            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    CompositionLocalProvider(
        LocalTypography provides typography,
        LocalDimensions provides dimension) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}