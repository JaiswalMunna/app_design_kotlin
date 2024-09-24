package com.example.ui_design_using_kotlin



import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui_design_using_kotlin.ui.theme.pink

@Composable
fun homeUI(){
    Box (modifier = Modifier
        .fillMaxWidth()
        .background(Color.White)){
        Column(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(pink)
                .height(56.dp)
            ) {
                buttons(icon = R.drawable.baseline_menu_24)
                Column (
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center) {
                    Text(
                        text = "Munna Jaiswal",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 25.sp,
                        ))
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ){
                    buttons(icon = R.drawable.baseline_search_24,)
                }

            }
            Card(modifier = Modifier.fillMaxWidth()) {
                LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                    items(Data.dataList){
                        showData(data = it)
                    }

                }
            }
        }
    }
}


@Composable
fun buttons(
    @DrawableRes icon:Int,
    //tint:Color=Color.Unspecified, //for button colors
){
 IconButton(onClick = { /*TODO*/ }) {
     Icon(painter = painterResource(id = icon), contentDescription = null)
 }
}

@Composable
fun showData(data:List<Data.Demo>){
    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .width(175.dp)
            .height(300.dp)
            .padding(vertical = 5.dp, horizontal = 5.dp)
    ) {
        Box(
            modifier=Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
            ){
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp, horizontal = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = data.image), contentDescription = "",
                    modifier = Modifier
                        .size(109.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,)

                Text(
                    text = data.price,
                    style = TextStyle(
                        fontSize=14.sp,
                        fontWeight = FontWeight.W500,
                        color = Color.Red
                    ),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = data.disp,
                    style = TextStyle(
                        fontSize=14.sp,
                        fontWeight = FontWeight.W500,
                        color = Color.Red
                    ),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = data.name,
                    style = TextStyle(
                        fontSize=14.sp,
                        fontWeight = FontWeight.W500,
                        color = Color.Red
                    ),
                    textAlign = TextAlign.Center
                )
                
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.width(91.dp),
                    shape = RoundedCornerShape(18.dp), 
                    colors = ButtonDefaults.buttonColors(contentColor = pink)
                ) {
                 Text(
                     text = "Add",
                     style = TextStyle(
                         fontSize = 12.sp,
                         fontWeight = FontWeight.W700,
                         color = Color.White
                     ),
                     textAlign = TextAlign.Center
                 )
                }
            }
        }
    }
}