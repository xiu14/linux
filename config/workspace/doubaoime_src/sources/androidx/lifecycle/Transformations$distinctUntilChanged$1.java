package androidx.lifecycle;

import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;
import kotlin.s.c.v;

/* JADX INFO: Add missing generic type declarations: [X] */
/* loaded from: classes.dex */
final class Transformations$distinctUntilChanged$1<X> extends m implements l<X, o> {
    final /* synthetic */ v $firstTime;
    final /* synthetic */ MediatorLiveData<X> $outputLiveData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Transformations$distinctUntilChanged$1(MediatorLiveData<X> mediatorLiveData, v vVar) {
        super(1);
        this.$outputLiveData = mediatorLiveData;
        this.$firstTime = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.s.b.l
    public /* bridge */ /* synthetic */ o invoke(Object obj) {
        invoke2((Transformations$distinctUntilChanged$1<X>) obj);
        return o.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(X x) {
        X value = this.$outputLiveData.getValue();
        if (this.$firstTime.a || ((value == null && x != null) || !(value == null || kotlin.s.c.l.a(value, x)))) {
            this.$firstTime.a = false;
            this.$outputLiveData.setValue(x);
        }
    }
}
