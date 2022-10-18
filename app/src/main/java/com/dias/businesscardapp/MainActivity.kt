package com.dias.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dias.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Surface(color = Color(0, 58, 74)) {
        Column(
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderCard()
            ContactInformation()
        }
    }
}

@Composable
fun HeaderCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
        Text(
            text = stringResource(R.string.name_txt),
            color = Color.White,
            fontSize = 50.sp,
            fontWeight = FontWeight.Light,
        )
        Spacer(Modifier.width(16.dp))
        Text(
            text = stringResource(R.string.title_txt),
            color = Color(72, 220, 154)
        )
    }
}

@Composable
fun ContactInformation() {
    val modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp, vertical = 8.dp)
    Column {
        Divider(Modifier.fillMaxWidth().height(3.dp), color = Color(89, 123, 133))
        Row(
            modifier,
        ) {
            Icon(
                Icons.Filled.Phone,
                contentDescription = null,
                tint = Color(72, 220, 154),
            )
            Spacer(Modifier.width(16.dp))
            Text(
                "+62 8646 5924",
                color = Color.White,
            )
        }

        Divider(Modifier.fillMaxWidth().height(3.dp), color = Color(89, 123, 133))
        Row(
            modifier,
        ) {
            Icon(
                Icons.Filled.Share,
                contentDescription = null,
                tint = Color(72, 220, 154),
            )
            Spacer(Modifier.width(16.dp))
            Text(
                "@dias.utsman",
                color = Color.White,
            )
        }

        Divider(Modifier.fillMaxWidth().height(3.dp), color = Color(89, 123, 133))
        Row(
            modifier,
        ) {
            Icon(
                Icons.Filled.Mail,
                contentDescription = null,
                tint = Color(72, 220, 154),
            )
            Spacer(Modifier.width(16.dp))
            Text(
                "utsmand91@gmail.com",
                color = Color.White,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}