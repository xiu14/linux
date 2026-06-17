package com.lele.llmonitor.data;
final class BatteryRepository$clearAll$2 extends jj3 implements h11 {
    int label;

    public BatteryRepository$clearAll$2(n60 p2)
    {
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        this = new com.lele.llmonitor.data.BatteryRepository$clearAll$2;
        this(p2);
        return this;
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.BatteryRepository$clearAll$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p2)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p2);
            com.lele.llmonitor.data.BatteryRepository.INSTANCE.getLatestHistory().clear();
            com.lele.llmonitor.data.BatteryRepository.access$setLastEmitTime$p(0);
            bw3 v1_3 = com.lele.llmonitor.data.BatteryRepository.access$getPersistJob$p();
            if (v1_3 == null) {
                return 0;
            } else {
                v1_3.k(0);
                return bw3.a;
            }
        }
    }
}
