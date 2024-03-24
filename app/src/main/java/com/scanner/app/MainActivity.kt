package com.scanner.app

import androidx.activity.compose.setContent
import com.scanner.app.base.BaseComposeActivity
import com.scanner.app.features.component.ScannerScaffold
import com.scanner.app.features.theme.ScannerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseComposeActivity() {
    override fun initView() =
        setContent {
        ScannerTheme {
            ScannerScaffold {
                ScannerApp()
            }
        }
    }
}