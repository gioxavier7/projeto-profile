package com.example.profile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile.R

@Composable
fun ProfileScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
            ){
                Image(
                    painter = painterResource(R.drawable.background),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(R.string.details),
                            color = Color.White,
                            fontSize = 16.sp
                        )
                        Box(modifier = Modifier.size(25.dp))

                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(R.drawable.profile),
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Text(
                            text = stringResource(R.string.name),
                            color = Color.White,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 10.dp)
                        )
                        Text(
                            text = stringResource(R.string.desc),
                            color = Color.LightGray,
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(top = 5.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            modifier = Modifier
                                .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.LightGray)
                                .size(80.dp)
                                .width(15.dp)
                                .height(15.dp)
                                .padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Email,
                                contentDescription = "",
                                tint = Color.LightGray
                            )
                            Text(
                                text = stringResource(R.string.email),
                                fontSize = 14.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.LightGray)
                                .size(80.dp)
                                .width(10.dp)
                                .height(10.dp)
                                .padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Phone,
                                contentDescription = "",
                                tint = Color.LightGray
                            )
                            Text(
                                text = stringResource(R.string.call),
                                fontSize = 14.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.LightGray)
                                .size(80.dp)
                                .width(10.dp)
                                .height(10.dp)
                                .padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.whatsapp),
                                contentDescription = "",
                                tint = Color.LightGray,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                            Text(
                                text = stringResource(R.string.wpp),
                                fontSize = 13.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .border(1.dp, shape = RoundedCornerShape(10.dp), color = Color.LightGray)
                                .size(80.dp)
                                .width(10.dp)
                                .height(10.dp)
                                .padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                Icons.Default.Star,
                                contentDescription = "",
                                tint = Color.LightGray
                            )
                            Text(
                                text = stringResource(R.string.favorite),
                                fontSize = 15.sp,
                                color = Color.LightGray,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ProfileScreenPreview(){
    ProfileScreen()
}