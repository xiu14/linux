package com.lele.llmonitor.data;
final class BatteryRepository$schedulePersistLocked$1 extends jj3 implements h11 {
    int label;

    public BatteryRepository$schedulePersistLocked$1(n60 p2)
    {
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        this = new com.lele.llmonitor.data.BatteryRepository$schedulePersistLocked$1;
        this(p2);
        return this;
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.BatteryRepository$schedulePersistLocked$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p7)
    {
        int v0 = this.label;
        e80 v3 = e80.d;
        if (v0 == 0) {
            ib1.Q(p7);
            this.label = 1;
            if (n54.r(350, this) != v3) {
                this.label = 2;
                if (com.lele.llmonitor.data.BatteryRepository.access$persistSnapshot(com.lele.llmonitor.data.BatteryRepository.INSTANCE, this) == v3) {
                    return v3;
                }
            }
        } else {
            if (v0 == 1) {
                ib1.Q(p7);
            } else {
                if (v0 != 2) {
                    h.m("call to \'resume\' before \'invoke\' with coroutine");
                    return 0;
                } else {
                    ib1.Q(p7);
                }
            }
        }
        return bw3.a;
    }
}
