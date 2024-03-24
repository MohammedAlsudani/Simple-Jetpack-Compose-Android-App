package com.scanner.app.features.screen.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.scanner.app.R
import com.scanner.app.data.enums.MainState.*
import com.scanner.app.features.component.ScannerLeftIconText
import com.scanner.app.features.theme.EerieBlack
import com.scanner.app.features.theme.ScannerTheme

/**
 * Composable function for the main screen of the Scanner App.
 * This function defines the UI for the main screen where the scanning functionality is presented.
 *
 * @param mainViewModel The view model for managing data and state related to the main screen.
 */
@Preview
@Composable
fun MainScreen(mainViewModel: MainViewModel = hiltViewModel()) {
    MainContent(mainViewModel)
}

/**
 * Composable function for displaying the main content of the main screen.
 * This function delegates rendering of different screens based on the current UI state.
 *
 * @param mainViewModel The view model for managing data and state related to the main screen.
 */
@Composable
fun MainContent(mainViewModel: MainViewModel) {
    val currentUiState by mainViewModel.uiState.collectAsStateWithLifecycle()
    Column(modifier = Modifier.fillMaxSize()) {
        MainHeader(mainViewModel)
        when (currentUiState.currentState) {
            START -> StartScreen(mainViewModel)
            LIST -> ListScreen(mainViewModel)
            ENTER_TAG -> EnterTagScreen(mainViewModel)
        }
    }
}

/**
 * Composable function for displaying the header of the main screen.
 *
 * @param mainViewModel The view model for managing data and state related to the main screen.
 */
@Composable
fun MainHeader(mainViewModel: MainViewModel) {
    Row(modifier = Modifier.fillMaxWidth()
        .padding(start = ScannerTheme.dimensions.dimension24,
            end = ScannerTheme.dimensions.dimension24,
            top = ScannerTheme.dimensions.dimension12),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        ScannerLeftIconText(text = "21 Mar",
            icon = painterResource(id = R.drawable.ic_calendar_month),
            style = ScannerTheme.typography.bodyLargeBold)
        ScannerLeftIconText(text = "12:00",
            icon = painterResource(id = R.drawable.ic_clock),
            style = ScannerTheme.typography.bodyLargeBold)
    }
}
