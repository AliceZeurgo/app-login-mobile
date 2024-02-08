package br.senai.sp.jandira.tela_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.loginpaginaaa.ui.theme.LoginpaginaaaTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginpaginaaaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEBB5F5)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Login",
                fontSize = 55.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(top = 16.dp)

            )
            Box(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .background(
                        color = Color(0xFFB67FB5),
                        shape = RoundedCornerShape(
                            topStart = 32.dp,
                            bottomEnd = 32.dp
                        )
                    )
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(text = "E-mail",
                        color = Color.White)
                    TextField(value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding
                                (bottom = 24.dp, top = 8.dp)
                            .fillMaxWidth())

                    Text(text = "Senha",
                        color = Color.White)
                    TextField(value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .fillMaxWidth())
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Checkbox(checked = true, onCheckedChange = {},
                            colors = CheckboxDefaults
                                .colors(checkedColor = Color(0xFFFFFFFF))
                        )
                        Text(text = "Lembrar",
                            color = Color.White
                        )
                    }
                }
            }
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .fillMaxWidth()
                    .height(58.dp),
                colors = ButtonDefaults
                    .buttonColors(
                        containerColor = Color(0xFFB67FB5)
                    )) {
                Text(text = "Entrar",
                    fontSize = 22.sp)
            }
            Text(text = "Desenvolvido por DSAIT-B",
                color = Color.White,
                modifier = Modifier.padding(bottom = 8.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginpaginaaaTheme {
        LoginScreen()
    }

}

@Composable
fun Teste() {
    Surface(
        Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(600.dp),
        color = Color.Green

    ) {
        Box(
            Modifier
                .padding(vertical = 20.dp, horizontal = 20.dp)
                .background(
                    Color(0xFF8C53F1)
                )

        ) {
            Column(
                modifier = Modifier
                    .background
                        (color = Color.Yellow, shape = CircleShape)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Alice",
                )
                Text(
                    text = "Zeurgo",
                )
                Text(
                    text = "Linda",
                )
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun TestePreview() {
    Teste()
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Botao teste")
        }
        Row {
            Checkbox(
                checked = true,
                onCheckedChange = {})
            Text(text = "A sua escolha")
        }
        Button(onClick = { /*TODO*/ }) {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LoginpaginaaaTheme {
        Greeting("Android")
    }
}