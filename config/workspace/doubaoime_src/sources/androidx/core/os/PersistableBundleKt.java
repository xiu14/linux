package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(g<String, ? extends Object>... gVarArr) {
        l.f(gVarArr, "pairs");
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(gVarArr.length);
        for (g<String, ? extends Object> gVar : gVarArr) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, gVar.a(), gVar.b());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        l.f(map, "<this>");
        PersistableBundle createPersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(createPersistableBundle, entry.getKey(), entry.getValue());
        }
        return createPersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
