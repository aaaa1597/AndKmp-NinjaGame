package com.stevdza_san.game.di

import com.stevdza_san.game.domain.audio.AudioPlayer
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

@OptIn(ExperimentalResourceApi::class)
actual val targetModule = module {
    single<AudioPlayer> { AudioPlayer(context = androidContext()) }
}