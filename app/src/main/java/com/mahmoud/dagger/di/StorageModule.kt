import dagger.Binds
import dagger.Module
import com.mahmoud.dagger.Storage.SharedPreferencesStorage
import com.mahmoud.dagger.Storage.Storage

@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

}


