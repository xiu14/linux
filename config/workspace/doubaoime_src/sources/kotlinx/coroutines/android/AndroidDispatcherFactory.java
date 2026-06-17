package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.N0.p;
import kotlinx.coroutines.v0;

/* loaded from: classes2.dex */
public final class AndroidDispatcherFactory implements p {
    @Override // kotlinx.coroutines.N0.p
    public v0 createDispatcher(List<? extends p> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new b(d.a(mainLooper, true), (String) null, 2);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.N0.p
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.N0.p
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
