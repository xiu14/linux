package androidx.lifecycle;

import android.app.Application;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        l.f(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        l.d(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
