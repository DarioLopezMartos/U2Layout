
package com.example.u2layout

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.u2layout.ui.theme.U2LayoutTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Paso 1. Mostramos la pantalla principal
        setContent {
            U2LayoutTheme {
                // Paso 2. Llamamos a nuestra pantalla
                PantallaPresentacion()
            }
        }
    }
}

// Paso 3. Creamos la pantalla de presentación
@Composable
fun PantallaPresentacion(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Paso 4. Título de la aplicación
        Text(
            text = "Mi Aplicación",
            style = MaterialTheme.typography.headlineMedium
        )

        // Paso 5. Descripción de la aplicación
        Text(
            text = "Una aplicación para presentar información personal de forma sencilla.",
            style = MaterialTheme.typography.bodyMedium
        )

        // Paso 6. Creamos la tarjeta
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Paso 7. Añadimos espacio interior a la tarjeta
            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Paso 8. Creamos el círculo con la inicial
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(
                            MaterialTheme.colorScheme.primaryContainer
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "D",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }

                // Paso 9. Mostramos los datos de la persona
                Column {
                    Text(
                        text = "Darío López",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Text(
                        text = "Estudiante de DAM",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}

