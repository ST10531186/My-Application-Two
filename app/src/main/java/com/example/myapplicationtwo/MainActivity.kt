package com.example.myapplicationtwo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationtwo.ui.theme.MyApplicationTwoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTwoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


//The Following Examples are of user input

fun main(){

    //Input a name (String)

    println("Please enter your name : ")
    var name = readLine()


    //Input an Integer
  println("Please Enter your Age : ")
  var age = readLine()!!.toInt()

  //Input a decimal (Double)

  println("Please Enter Price : ")
  var price = readLine()!!.toDouble()

  //Recieve Two numbers which are integers

  println("Enter First NUmber : ")
    var num1 = readLine()!!.toInt()

    println("Enter Second Number : ")
    var num2 = readLine()!!.toInt()

    var sum = num1 + num2



    println((" Hello $name"))
    println(" Your age is : $age")
    println("The Price is : $price")
    println("The Sum of the num1 and num2 is : $sum ")

}





@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTwoTheme {
        Greeting("Android")
    }
}