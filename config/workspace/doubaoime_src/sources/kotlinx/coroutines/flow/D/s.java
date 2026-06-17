package kotlinx.coroutines.flow.D;

import kotlin.r.f;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.InterfaceC0820p;

/* loaded from: classes2.dex */
final class s extends kotlin.s.c.m implements kotlin.s.b.p<Integer, f.b, Integer> {
    final /* synthetic */ q<?> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(q<?> qVar) {
        super(2);
        this.a = qVar;
    }

    @Override // kotlin.s.b.p
    public Integer invoke(Integer num, f.b bVar) {
        int intValue = num.intValue();
        f.b bVar2 = bVar;
        f.c<?> key = bVar2.getKey();
        f.b bVar3 = this.a.b.get(key);
        if (key != InterfaceC0817m0.H) {
            return Integer.valueOf(bVar2 != bVar3 ? Integer.MIN_VALUE : intValue + 1);
        }
        InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) bVar3;
        InterfaceC0817m0 interfaceC0817m02 = (InterfaceC0817m0) bVar2;
        while (true) {
            if (interfaceC0817m02 != null) {
                if (interfaceC0817m02 == interfaceC0817m0 || !(interfaceC0817m02 instanceof kotlinx.coroutines.N0.v)) {
                    break;
                }
                InterfaceC0820p W = ((kotlinx.coroutines.N0.v) interfaceC0817m02).W();
                interfaceC0817m02 = W != null ? W.getParent() : null;
            } else {
                interfaceC0817m02 = null;
                break;
            }
        }
        if (interfaceC0817m02 == interfaceC0817m0) {
            if (interfaceC0817m0 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0817m02 + ", expected child of " + interfaceC0817m0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
