package com.example.questnavigasimvvm_0247

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.questnavigasimvvm_0247.view.FormIsian
import com.example.questnavigasimvvm_0247.view.TampilData

enum class Navigasi{
    FormulisrSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavController= rememberNavController()
) {
    Scaffold{isiRuang ->
        NavHost(
            modifier = Modifier.padding(isiRuang)
        ){
            composable(route= Navigasi.FormulisrSaya.name){
                FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilData {  }
            }
        }
    }
}