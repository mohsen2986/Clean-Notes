package com.codingwithmitch.cleannotes.di

import com.codingwithmitch.cleannotes.framework.presentation.BaseApplication
import com.codingwithmitch.cleannotes.framework.presentation.notedetail.NoteDetailFragment
import com.codingwithmitch.cleannotes.framework.presentation.notelist.NoteListFragment
import com.codingwithmitch.cleannotes.notes.di.NoteViewModelModule
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@FlowPreview
@Singleton
@Component(
    modules = [
        AppModule::class,
        NoteViewModelModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory{

        fun create(@BindsInstance app: BaseApplication): AppComponent
    }

    fun inject(noteListFragment: NoteListFragment)

    fun inject(noteDetailFragment: NoteDetailFragment)
}












