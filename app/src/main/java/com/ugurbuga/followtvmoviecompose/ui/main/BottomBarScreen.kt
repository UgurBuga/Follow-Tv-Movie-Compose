package com.ugurbuga.followtvmoviecompose.ui.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Discover : BottomBarScreen(
        route = "discover",
        title = "Discover",
        icon = Icons.Default.Search
    )

    object TvShows : BottomBarScreen(
        route = "tv_shows",
        title = "TvShows",
        icon = Icons.Default.Home
    )

    object Movies : BottomBarScreen(
        route = "movies",
        title = "Movies",
        icon = Icons.Default.Home
    )

    object Soon : BottomBarScreen(
        route = "soon",
        title = "Soon",
        icon = Icons.Rounded.DateRange
    )
}
