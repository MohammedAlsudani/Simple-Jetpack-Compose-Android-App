package com.scanner.app.features.screen.main

import com.scanner.app.R
import com.scanner.app.data.enums.QrCodeStatus

fun getQrCodeStatusImageId(status: QrCodeStatus): Int {
    return when (status){
        QrCodeStatus.SUCCESS -> R.drawable.ic_success
        QrCodeStatus.FAILED -> R.drawable.ic_fail
        QrCodeStatus.WARNING -> R.drawable.ic_warning
    }
}