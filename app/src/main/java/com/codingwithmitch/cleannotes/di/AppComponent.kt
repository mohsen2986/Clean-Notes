package com.codingwithmitch.cleannotes.di

import com.codingwithmitch.cleannotes.di.features.notes.NotesFeature
import com.codingwithmitch.cleannotes.di.features.notes.NotesFeatureModule
import com.codingwithmitch.cleannotes.presentation.BaseApplication
import com.codingwithmitch.cleannotes.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NotesFeatureModule::class
    ]
)
interface AppComponent: NotesFeature.Dependencies {

    fun notesFeature(): NotesFeature?

    @Component.Factory
    interface Factory{

        fun create(@BindsInstance app: BaseApplication): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}












