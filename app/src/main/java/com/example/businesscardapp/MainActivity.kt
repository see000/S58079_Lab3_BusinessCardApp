package com.example.businesscardapp

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(){
    Column (
        modifier = Modifier
            .background(Color(7, 48 ,66, 255 )),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        NameCardWithLogo()
        PersonalInfo()
    }
}

@Composable
fun NameCardWithLogo(){
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = Modifier
            .padding(bottom = 100.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally,

    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
        Text(
            text = "See Pao Yeong",
            fontSize = 40.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 10.dp)


        )
        Text(
            text = "Android Developer Extraordinaire",
            color = Color(0xFF3ddc84),
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold

        )
    }

}

@Composable
fun PersonalInfo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier =  Modifier
                .fillMaxWidth()
                .padding(start = 60.dp, bottom = 20.dp),

        ) {
            Icon(
                Icons.Filled.Phone,
                contentDescription = null,
                Modifier.padding(end = 20.dp),
                tint = Color(0xFF3ddc84)

            )
            Text(text = "+60146226335", color = Color.White)

        }
        Row(
            modifier =  Modifier
                .padding(start = 60.dp, bottom = 20.dp)
                .fillMaxWidth()
        ) {
            Icon(
                Icons.Filled.Share,
                contentDescription = null,
                Modifier.padding(end = 20.dp),
                tint = Color(0xFF3ddc84)
            )
            Text(text = "@See Pao Yeong",color = Color.White)
        }
        Row(
            modifier =  Modifier
                .padding(start = 60.dp)
                .fillMaxWidth()
        ) {
            Icon(
                Icons.Filled.Email,
                contentDescription = null,
                Modifier.padding(end = 20.dp),
                tint = Color(0xFF3ddc84)
            )
            Text(text = "S58079@ocean.umt.edu.my",color = Color.White)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}