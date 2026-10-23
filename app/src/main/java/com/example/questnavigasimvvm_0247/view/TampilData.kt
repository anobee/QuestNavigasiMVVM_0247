package com.example.questnavigasimvvm_0247.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(id= R.string.nama_lengkap),"contoh nama"),
        Pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.alamat). "Yogyakarta")
    )
}