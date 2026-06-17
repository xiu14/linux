package androidx.lifecycle;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.s.c.m;

/* JADX INFO: Add missing generic type declarations: [R] */
@SourceDebugExtension({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,206:1\n*E\n"})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2<R> extends m implements kotlin.s.b.a<R> {
    final /* synthetic */ kotlin.s.b.a<R> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(kotlin.s.b.a<? extends R> aVar) {
        super(0);
        this.$block = aVar;
    }

    @Override // kotlin.s.b.a
    public final R invoke() {
        return this.$block.invoke();
    }
}
