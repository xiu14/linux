package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.s.c.g;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements kotlin.e<VM> {
    private VM cached;
    private final kotlin.s.b.a<CreationExtras> extrasProducer;
    private final kotlin.s.b.a<ViewModelProvider.Factory> factoryProducer;
    private final kotlin.s.b.a<ViewModelStore> storeProducer;
    private final kotlin.reflect.c<VM> viewModelClass;

    /* renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    static final class AnonymousClass1 extends m implements kotlin.s.b.a<CreationExtras.Empty> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.s.b.a
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(kotlin.reflect.c<VM> cVar, kotlin.s.b.a<? extends ViewModelStore> aVar, kotlin.s.b.a<? extends ViewModelProvider.Factory> aVar2) {
        this(cVar, aVar, aVar2, null, 8, null);
        l.f(cVar, "viewModelClass");
        l.f(aVar, "storeProducer");
        l.f(aVar2, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(kotlin.reflect.c<VM> cVar, kotlin.s.b.a<? extends ViewModelStore> aVar, kotlin.s.b.a<? extends ViewModelProvider.Factory> aVar2, kotlin.s.b.a<? extends CreationExtras> aVar3) {
        l.f(cVar, "viewModelClass");
        l.f(aVar, "storeProducer");
        l.f(aVar2, "factoryProducer");
        l.f(aVar3, "extrasProducer");
        this.viewModelClass = cVar;
        this.storeProducer = aVar;
        this.factoryProducer = aVar2;
        this.extrasProducer = aVar3;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // kotlin.e
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(r.O(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(kotlin.reflect.c cVar, kotlin.s.b.a aVar, kotlin.s.b.a aVar2, kotlin.s.b.a aVar3, int i, g gVar) {
        this(cVar, aVar, aVar2, (i & 8) != 0 ? AnonymousClass1.INSTANCE : aVar3);
    }
}
