package androidx.lifecycle;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;
import kotlinx.coroutines.r0;

/* loaded from: classes.dex */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final G getViewModelScope(ViewModel viewModel) {
        l.f(viewModel, "<this>");
        G g2 = (G) viewModel.getTag(JOB_KEY);
        if (g2 != null) {
            return g2;
        }
        kotlin.r.f a = C0795d.a(null, 1);
        int i = S.f10199c;
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(r.d0((r0) a, q.f10173c.U())));
        l.e(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (G) tagIfAbsent;
    }
}
