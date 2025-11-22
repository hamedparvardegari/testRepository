package com.parvardegarico.hamedasync

import androidx.compose.runtime.Composable
import coil.compose.AsyncImage

@Composable
fun HamedAsync(model: Any){
    AsyncImage(
        model = model,
        contentDescription = null
    )
}