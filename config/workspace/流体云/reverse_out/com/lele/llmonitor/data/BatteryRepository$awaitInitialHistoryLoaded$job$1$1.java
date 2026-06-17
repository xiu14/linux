package com.lele.llmonitor.data;
final class BatteryRepository$awaitInitialHistoryLoaded$job$1$1 extends jj3 implements h11 {
    int label;

    public BatteryRepository$awaitInitialHistoryLoaded$job$1$1(n60 p2)
    {
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        this = new com.lele.llmonitor.data.BatteryRepository$awaitInitialHistoryLoaded$job$1$1;
        this(p2);
        return this;
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.BatteryRepository$awaitInitialHistoryLoaded$job$1$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p3)
    {
        int v0 = this.label;
        if (v0 == 0) {
            ib1.Q(p3);
            this.label = 1;
            e80 v3_2 = e80.d;
            if (com.lele.llmonitor.data.BatteryRepository.access$runInitialHistoryLoad(com.lele.llmonitor.data.BatteryRepository.INSTANCE, this) == v3_2) {
                return v3_2;
            }
        } else {
            if (v0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p3);
            }
        }
        return bw3.a;
    }
}
