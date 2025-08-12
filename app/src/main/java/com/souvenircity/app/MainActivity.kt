package com.souvenircity.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SouvenirCityApp()
        }
    }
}

data class Souvenir(val name: String, val description: String)

val sampleData = mapOf(
    "Roma" to listOf(
        Souvenir("Calamita Colosseo", "Classica calamita raffigurante il Colosseo"),
        Souvenir("Rosario", "Rosario religioso dal Vaticano"),
        Souvenir("Ceramica fatta a mano", "Piccoli piatti o tazze dipinte a mano"),
        Souvenir("Borsa in pelle", "Artigianato in pelle italiana"),
        Souvenir("Olio e conserve", "Prodotti gastronomici locali")
    ),
    "Parigi" to listOf(
        Souvenir("Mini Torre Eiffel", "Iconica replica della Tour Eiffel"),
        Souvenir("Macarons confezionati", "Dolci tipici francesi"),
        Souvenir("Profumo francese", "Campioncini o bottiglie piccole"),
        Souvenir("Saponi di Marsiglia", "Saponette profumate"),
        Souvenir("Tazza con arte parigina", "Ceramiche a tema")
    ),
    "Londra" to listOf(
        Souvenir("Tazza Union Jack", "Tazze con la bandiera britannica"),
        Souvenir("Caps o t-shirt", "Merchandise 'I ♥ London'"),
        Souvenir("Tea assortito", "Tè tipico inglese"),
        Souvenir("Mini bus rosso", "Replica del bus a due piani"),
        Souvenir("Poster vintage", "Stampe e poster artistici")
    ),
    "Tokyo" to listOf(
        Souvenir("KitKat locali", "Sapori esclusivi giapponesi"),
        Souvenir("Set di bacchette", "Bacchette decorate"),
        Souvenir("Ventaglio tradizionale", "Ventaglio giapponese"),
        Souvenir("Ceramica giapponese", "Tazze e teiere"),
        Souvenir("Gadget Anime", "Piccoli oggetti a tema anime")
    ),
    "New York" to listOf(
        Souvenir("Magnete I ♥ NY", "Classico magnete"),
        Souvenir("Mini Statua della Libertà", "Repliche in miniatura"),
        Souvenir("Cappellino Yankees", "Merchandise sportivo"),
        Souvenir("Poster Broadway", "Manifesti di spettacoli"),
        Souvenir("Candela artigianale", "Candele made in NYC")
    ),
    "Barcellona" to listOf(
        Souvenir("Caganer figurina", "Figura tradizionale catalana"),
        Souvenir("Espardenyes", "Scarpe tipiche"),
        Souvenir("Olio locale", "Bottiglia di olio d'oliva"),
        Souvenir("Ceramica modernista", "Oggetti ispirati a Gaudí"),
        Souvenir("Wine Cava", "Bottiglia di cava catalana")
    ),
    "Amsterdam" to listOf(
        Souvenir("Zaans clogs", "Zoccoli in legno tipici"),
        Souvenir("Formaggio olandese", "Piccoli panetti di formaggio"),
        Souvenir("Tulip bulbs", "Bulbi di tulipano confezionati"),
        Souvenir("Ceramica Delft", "Piatti e tegole dipinte"),
        Souvenir("Magneti canale", "Magneti e poster delle vie d'acqua")
    ),
    "Berlino" to listOf(
        Souvenir("Pallina Reichstag", "Piccoli gadget"),
        Souvenir("Birra locale in lattina", "Souvenir gastronomico"),
        Souvenir("Poster vintage DDR", "Stampe retrò"),
        Souvenir("Calamite Porta di Brandeburgo", "Icone della città"),
        Souvenir("Ciondolo Berliner Bär", "Simbolo della città")
    ),
    "Istanbul" to listOf(
        Souvenir("Lampsa di vetro colorato", "Lampade e lanterne"),
        Souvenir("Tappeti piccoli", "Piccoli arazzi"),
        Souvenir("Spezie confezionate", "Miscele locali"),
        Souvenir("Ceramica Iznik", "Piatti dipinti a mano"),
        Souvenir("Nazar (occhio blu)", "Amuleto portafortuna")
    ),
    "Atene" to listOf(
        Souvenir("Replica Parthenon", "Miniature del Partenone"),
        Souvenir("Olio d'oliva locale", "Piccole bottiglie"),
        Souvenir("Antique style jewelry", "Bijoux ispirati all'antica Grecia"),
        Souvenir("Tovagliette tessute", "Artigianato tessile"),
        Souvenir("Ceramiche tradizionali", "Vasi e piatti decorativi")
    ),
    "Lisbona" to listOf(
        Souvenir("Azulejos miniatura", "Mattonelle decorative"),
        Souvenir("Portoghese canned sardines", "Conserva tipica"),
        Souvenir("Bottiglia di porto", "Piccola bottiglia di Porto"),
        Souvenir("Fado CD o suvenire", "Musica locale"),
        Souvenir("Ciondolo galleta", "Gadget tipico")
    ),
    "Praga" to listOf(
        Souvenir("Cristallo boemo", "Piccoli oggetti in cristallo"),
        Souvenir("Marionette", "Pupazzi tradizionali"),
        Souvenir("Birra artigianale", "Souvenir gastronomico"),
        Souvenir("Poster storico", "Stampe e cartoline"),
        Souvenir("Orologio tradizionale", "Piccoli gadget")
    ),
    "Vienna" to listOf(
        Souvenir("Sacher Torte box", "Confezioni di dolci locali"),
        Souvenir("Porcellana", "Piccoli pezzi decorativi"),
        Souvenir("Poster Opera", "Ricordi della scena musicale"),
        Souvenir("Scialle tessuto", "Artigianato tessile"),
        Souvenir("Termos con design", "Gadget turistici")
    ),
    "Dubai" to listOf(
        Souvenir("Profumi orientali", "Campioni o boccette"),
        Souvenir("Spezie aromatiche", "Mescole in barattolo"),
        Souvenir("Gioielli artigianali", "Piccoli monili"),
        Souvenir("Miniature cammello", "Gadget turistico"),
        Souvenir("Tappeti piccoli", "Artigianato tessile")
    ),
    "Sydney" to listOf(
        Souvenir("Boomerang decorativo", "Tipico souvenir australiano"),
        Souvenir("Opal jewelry", "Piccoli gioielli con opale"),
        Souvenir("Magnete Opera House", "Miniature del landmark"),
        Souvenir("Tea tree oil", "Prodotti locali"),
        Souvenir("Postcards con spiagge", "Cartoline e poster")
    ),
    "Bangkok" to listOf(
        Souvenir("Set di spezie tailandesi", "Piccole confezioni"),
        Souvenir("Statua buddha mini", "Riproduzioni decorative"),
        Souvenir("Vasi in ceramica", "Oggetti artistici"),
        Souvenir("Tessuti colorati", "Stoffe e sciarpe"),
        Souvenir("Maschere tradizionali", "Artigianato artistico")
    ),
    "Hong Kong" to listOf(
        Souvenir("Gadget elettronici", "Piccoli accessori tech"),
        Souvenir("Tè locales", "Miscele tipiche"),
        Souvenir("Cartoline neon", "Stampe e poster"),
        Souvenir("Mini lanterne", "Decorazioni"),
        Souvenir("Figurine Pop culture", "Gadget da collezione")
    ),
    "San Francisco" to listOf(
        Souvenir("Magnete Golden Gate", "Magneti e gadget"),
        Souvenir("Mini cable car", "Repliche dei tram"),
        Souvenir("Vino californiano", "Piccole bottiglie"),
        Souvenir("Poster tech", "Stampe creative"),
        Souvenir("Felpa Stanford/UC", "Merchandise universitario")
    ),
    "Marrakech" to listOf(
        Souvenir("Tappeti berberi", "Piccoli tappeti"),
        Souvenir("Spezie e miscele", "Confezioni aromatiche"),
        Souvenir("Lanterns in metallo", "Lampade decorative"),
        Souvenir("Ceramiche marocchine", "Piatti e vassoi"),
        Souvenir("Stoffe colorate", "Tessuti e sciarpe")
    ),
    "Mosca" to listOf(
        Souvenir("Matrioska", "Bambole russe a incastro"),
        Souvenir("Ciondoli zaristi", "Gadget tradizionale"),
        Souvenir("Ciondoli in ambra", "Gioielli e piccoli oggetti"),
        Souvenir("Poster sovietico vintage", "Stampe e decorazioni"),
        Souvenir("Vodka souvenir", "Piccole bottiglie decorative")
    )
)

@Composable
fun SouvenirApp() {
    // warm color palette
    val warmColors = lightColors(
        primary = Color(0xFFFF7043),     // orange
        primaryVariant = Color(0xFFFF5722),
        secondary = Color(0xFFD84315),   // deep orange/red
        background = Color(0xFFFFF8E1),  // light cream
        surface = Color(0xFFFFFFFF),
        onPrimary = Color.White,
        onSecondary = Color.White
    )

    var selectedCity by remember { mutableStateOf("Roma") }
    val cities = sampleData.keys.toList().sorted()

    MaterialTheme(colors = warmColors) {
        Scaffold(topBar = {
            TopAppBar(title = { Text("SouvenirCity", fontWeight = FontWeight.Bold) })
        }) { padding ->
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Scegli una città:", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    cities.forEach { city ->
                        Surface(
                            modifier = Modifier
                                .clickable { selectedCity = city }
                                .padding(4.dp),
                            elevation = if (selectedCity == city) 8.dp else 2.dp,
                            color = if (selectedCity == city) MaterialTheme.colors.primary else MaterialTheme.colors.surface
                        ) {
                            Text(city, modifier = Modifier.padding(12.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text("Souvenir più acquistati a \$selectedCity:", fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.height(8.dp))
                val list = sampleData[selectedCity] ?: emptyList()
                LazyColumn {
                    items(list) { item ->
                        Card(modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Text(item.name, fontWeight = FontWeight.Bold)
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(item.description)
                            }
                        }
                    }
                }
            }
        }
    }
}
