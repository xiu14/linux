package androidx.lifecycle;

import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* JADX INFO: Add missing generic type declarations: [Y] */
/* loaded from: classes.dex */
final class Transformations$switchMap$2$onChanged$1<Y> extends m implements l<Y, o> {
    final /* synthetic */ MediatorLiveData<Y> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transformations$switchMap$2$onChanged$1(MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ o invoke(Object obj) {
        invoke2((Transformations$switchMap$2$onChanged$1<Y>) obj);
        return o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Y y) {
        this.$result.setValue(y);
    }
}
