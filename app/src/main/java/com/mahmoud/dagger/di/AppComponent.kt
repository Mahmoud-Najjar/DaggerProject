import android.content.Context
import com.mahmoud.dagger.MainActivity
import com.mahmoud.dagger.Singleton
import com.mahmoud.dagger.registraion.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

@Singleton
@Component(modules = [StorageModule::class])

interface AppComponent {
      @Component.Factory
    interface Factory {
            fun create(@BindsInstance context: Context): AppComponent
    }
    fun inject(activity: MainActivity)
    fun inject(activity: RegistrationActivity)
}


