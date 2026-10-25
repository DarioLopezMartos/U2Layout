
package com.example.u2layout.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.practicalayouts.ui.theme.Pink40
import com.example.practicalayouts.ui.theme.Pink80
import com.example.practicalayouts.ui.theme.Purple40
import com.example.practicalayouts.ui.theme.Purple80
import com.example.practicalayouts.ui.theme.PurpleGrey40
import com.example.practicalayouts.ui.theme.PurpleGrey80

// Paso 1. Definimos los colores para el tema claro
private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

// Paso 2. Definimos los colores para el tema oscuro
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

// Paso 3. Configuramos el tema de la aplicación
@Composable
fun U2LayoutTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        // Paso 4. Colores dinámicos en Android 12 o superior
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current

            if (darkTheme) {
                dynamicDarkColorScheme(context)
            } else {
                dynamicLightColorScheme(context)
            }
        }

        // Paso 5. Elegimos el tema según el modo del dispositivo
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // Paso 6. Aplicamos el tema
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
