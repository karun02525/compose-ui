package com.example.composeuidesign.view

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeuidesign.R

class LoginScreen {

    @Preview(showSystemUi = true)
    @Composable
    fun LoginUi() {
        val context = LocalContext.current
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(24.dp)
        ) {

            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.offset(x = (-18).dp)) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "back",
                    modifier = Modifier.size(32.dp)
                )
            }
            Spacer(Modifier.height(24.dp))

            Text(
                text = "Welcome Back!",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Sign in to continue ",
                color = Color.Gray,
                fontSize = 12.sp,
            )

            Spacer(Modifier.height(24.dp))

            Text(
                text = "Username",
                color = Color.Gray,
                fontSize = 12.sp,
            )

            val email = remember { mutableStateOf("") }
            TextField(value = email.value, onValueChange = { email.value = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    cursorColor = Color(0xffFF2B57),
                    focusedIndicatorColor = Color(0xffFF2B57),
                ),
                placeholder = {
                    Text(text = "Enter Email Id")
                }
            )

            //Password.....


            Spacer(Modifier.height(30.dp))

            Text(
                text = "Password",
                color = Color.Gray,
                fontSize = 12.sp,
            )

            val password = remember { mutableStateOf("") }
            TextField(
                value = password.value, onValueChange = { password.value = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    cursorColor = Color(0xffFF2B57),
                    focusedIndicatorColor = Color(0xffFF2B57),
                ),
                placeholder = {
                    Text(text = "Enter Password")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation()
            )


            TextButton(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.textButtonColors(contentColor = Color.Gray),
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(
                    text = "Forget your password? ",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal
                )
            }


            Spacer(Modifier.height(30.dp))

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor = Color(0xffFF2B57),
                    contentColor = Color.White
                )
            ) {

                Text(text = "SIGN IN", fontSize = 12.sp)
            }

            Spacer(Modifier.height(40.dp))

            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {

                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .background(Color(0xfff0D6FCA))
                        .clickable {
                            Toast
                                .makeText(context, "facebook", Toast.LENGTH_SHORT)
                                .show()
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "f",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .background(Color(0xff39D0FF))
                        .clickable {
                            Toast
                                .makeText(context, "twitter", Toast.LENGTH_SHORT)
                                .show()
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_twitter),
                        contentDescription = "twitter",
                        modifier = Modifier.size(40.dp)
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .background(Color(0xffFF3C47))
                        .clickable {
                            Toast
                                .makeText(context, "google", Toast.LENGTH_SHORT)
                                .show()
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_google),
                        contentDescription = "google",
                        modifier = Modifier.size(40.dp)
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Don't have an account?")
                TextButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = Color.Black
                    )
                ) {
                    Text(
                        text = "Sign Up",
                        fontWeight = FontWeight.Bold,
                    )
                }
            }


        }
    }
}