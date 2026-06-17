package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.s.b.p;

@kotlin.r.h.a.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {414, 416}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ViewKt$allViews$1 extends kotlin.r.h.a.h implements p<kotlin.x.g<? super View>, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(View view, kotlin.r.d<? super ViewKt$allViews$1> dVar) {
        super(2, dVar);
        this.$this_allViews = view;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, dVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.s.b.p
    public final Object invoke(kotlin.x.g<? super View> gVar, kotlin.r.d<? super o> dVar) {
        return ((ViewKt$allViews$1) create(gVar, dVar)).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        kotlin.x.g gVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            r.k0(obj);
            gVar = (kotlin.x.g) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = gVar;
            this.label = 1;
            if (gVar.a(view, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.k0(obj);
                return o.a;
            }
            gVar = (kotlin.x.g) this.L$0;
            r.k0(obj);
        }
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            kotlin.x.e<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            Objects.requireNonNull(gVar);
            Object c2 = gVar.c(descendants.iterator(), this);
            if (c2 != coroutineSingletons) {
                c2 = o.a;
            }
            if (c2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return o.a;
    }
}
