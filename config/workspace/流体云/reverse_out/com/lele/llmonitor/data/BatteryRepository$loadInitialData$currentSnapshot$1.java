package com.lele.llmonitor.data;
final class BatteryRepository$loadInitialData$currentSnapshot$1 extends jj3 implements h11 {
    int label;

    public BatteryRepository$loadInitialData$currentSnapshot$1(n60 p2)
    {
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        this = new com.lele.llmonitor.data.BatteryRepository$loadInitialData$currentSnapshot$1;
        this(p2);
        return this;
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.BatteryRepository$loadInitialData$currentSnapshot$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p1)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p1);
            int v0_7 = com.lele.llmonitor.data.BatteryRepository.INSTANCE.getLatestHistory();
            v0_7.getClass();
            return jn.D(v0_7).c;
        }
    }
}
