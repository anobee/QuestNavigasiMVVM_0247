package com.example.questnavigasimvvm_0247.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.R
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = android.R.string.home), android.R.color = Color.White)}
                        colors = TopAppBarDefaults.mediumTopAppBarColors(
                        colorResource(id = android.R.color.teal_700))
            )

        }) { isiRuang ->
        Column( modifier = Modifier.padding(isiRuang),
           verticalArrangement = Arrangement.SpaceBetween){
            Column {
                Text(text = item.first.uppercase(), fontSize = 16.sp)
                Text(text = item.second, fontWeight = FontWeight.Bold,
                    FontFamily = FontFamily.Cursive, fontSize =22.sp)
            }
            HorizontalDivider(thickness = 1.dp, color = Color.Cyan)
        }) { }
    }
}