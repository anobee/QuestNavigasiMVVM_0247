
package com.example.questnavigasimvvm_0247.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.questnavigasimvvm_0247.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick: () -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.app_name),
                        color = androidx.compose.ui.graphics.Color.White
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(isiRuang)
                .padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = stringResource(R.string.nama_lengkap))
                }
            )

            HorizontalDivider(
                modifier = Modifier.padding(
                    vertical = dimensionResource(R.dimen.padding_medium)
                ),
                thickness = dimensionResource(R.dimen.padding_divider)
            )

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                jenisK.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = jenisKelamin == item,
                            onClick = { jenisKelamin = item }
                        )
                        Text(text = item)
                    }
                }
            }

            HorizontalDivider(
                modifier = Modifier.padding(
                    vertical = dimensionResource(R.dimen.padding_medium)
                ),
                thickness = dimensionResource(R.dimen.padding_divider)
            )

            OutlinedTextField(
                value = alamat,
                onValueChange = { alamat = it },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = stringResource(R.string.alamat))
                }
            )

            Spacer(
                modifier = Modifier.height(
                    dimensionResource(R.dimen.padding_small)
                )
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = OnSubmitBtnClick
            ) {
                Text(text = stringResource(R.string.submit))
            }
        }
    }
}
