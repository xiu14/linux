package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public class ViewModelStore {
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Iterator<ViewModel> it2 = this.map.values().iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        this.map.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ViewModel get(String str) {
        l.f(str, "key");
        return this.map.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(String str, ViewModel viewModel) {
        l.f(str, "key");
        l.f(viewModel, "viewModel");
        ViewModel put = this.map.put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }
}
