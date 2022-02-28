package com.ugurbuga.followtvmoviecompose.ui.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ugurbuga.followtvmoviecompose.ui.main.discover.DiscoverScreen
import com.ugurbuga.followtvmoviecompose.ui.main.movies.MoviesScreen
import com.ugurbuga.followtvmoviecompose.ui.main.soon.SoonScreen
import com.ugurbuga.followtvmoviecompose.ui.main.tvshows.TvShowsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Discover.route
    ) {
        composable(route = BottomBarScreen.Discover.route) {
            DiscoverScreen()
        }
        composable(route = BottomBarScreen.TvShows.route) {
            MoviesScreen()
        }
        composable(route = BottomBarScreen.Movies.route) {
            TvShowsScreen()
        }
        composable(route = BottomBarScreen.Soon.route) {
            SoonScreen()
        }
    }
}