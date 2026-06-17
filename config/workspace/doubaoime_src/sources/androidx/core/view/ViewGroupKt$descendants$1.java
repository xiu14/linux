package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.o;
import kotlin.s.b.p;

@kotlin.r.h.a.e(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {119, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ViewGroupKt$descendants$1 extends kotlin.r.h.a.h implements p<kotlin.x.g<? super View>, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ ViewGroup $this_descendants;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewGroupKt$descendants$1(ViewGroup viewGroup, kotlin.r.d<? super ViewGroupKt$descendants$1> dVar) {
        super(2, dVar);
        this.$this_descendants = viewGroup;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, dVar);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    @Override // kotlin.s.b.p
    public final Object invoke(kotlin.x.g<? super View> gVar, kotlin.r.d<? super o> dVar) {
        return ((ViewGroupKt$descendants$1) create(gVar, dVar)).invokeSuspend(o.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009a -> B:6:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a3 -> B:7:0x00a7). Please report as a decompilation issue!!! */
    @Override // kotlin.r.h.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r11.L$0
            kotlin.x.g r6 = (kotlin.x.g) r6
            com.prolificinteractive.materialcalendarview.r.k0(r12)
            r12 = r11
            goto L9c
        L1e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L26:
            int r1 = r11.I$1
            int r4 = r11.I$0
            java.lang.Object r5 = r11.L$2
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r11.L$1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r11.L$0
            kotlin.x.g r7 = (kotlin.x.g) r7
            com.prolificinteractive.materialcalendarview.r.k0(r12)
            r12 = r11
            goto L6e
        L3b:
            com.prolificinteractive.materialcalendarview.r.k0(r12)
            java.lang.Object r12 = r11.L$0
            kotlin.x.g r12 = (kotlin.x.g) r12
            android.view.ViewGroup r1 = r11.$this_descendants
            r4 = 0
            int r5 = r1.getChildCount()
            r6 = r11
        L4a:
            if (r4 >= r5) goto La9
            android.view.View r7 = r1.getChildAt(r4)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.s.c.l.e(r7, r8)
            r6.L$0 = r12
            r6.L$1 = r1
            r6.L$2 = r7
            r6.I$0 = r4
            r6.I$1 = r5
            r6.label = r3
            java.lang.Object r8 = r12.a(r7, r6)
            if (r8 != r0) goto L68
            return r0
        L68:
            r9 = r7
            r7 = r12
            r12 = r6
            r6 = r1
            r1 = r5
            r5 = r9
        L6e:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto La3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            kotlin.x.e r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r12.L$0 = r7
            r12.L$1 = r6
            r8 = 0
            r12.L$2 = r8
            r12.I$0 = r4
            r12.I$1 = r1
            r12.label = r2
            java.util.Objects.requireNonNull(r7)
            java.util.Iterator r5 = r5.iterator()
            java.lang.Object r5 = r7.c(r5, r12)
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r8) goto L95
            goto L97
        L95:
            kotlin.o r5 = kotlin.o.a
        L97:
            if (r5 != r0) goto L9a
            return r0
        L9a:
            r5 = r6
            r6 = r7
        L9c:
            r9 = r6
            r6 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
            goto La7
        La3:
            r5 = r1
            r1 = r6
            r6 = r12
            r12 = r7
        La7:
            int r4 = r4 + r3
            goto L4a
        La9:
            kotlin.o r12 = kotlin.o.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
