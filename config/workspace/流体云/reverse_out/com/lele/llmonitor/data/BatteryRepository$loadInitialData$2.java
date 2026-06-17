package com.lele.llmonitor.data;
final class BatteryRepository$loadInitialData$2 extends jj3 implements h11 {
    final synthetic java.util.List $merged;
    int I$0;
    int I$1;
    int label;

    public BatteryRepository$loadInitialData$2(java.util.List p1, n60 p2)
    {
        this.$merged = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        return new com.lele.llmonitor.data.BatteryRepository$loadInitialData$2(this.$merged, p2);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.BatteryRepository$loadInitialData$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p7)
    {
        int v0_1;
        Object v7_2;
        int v0_0 = this.label;
        bw3 v1 = bw3.a;
        if (v0_0 == 0) {
            ib1.Q(p7);
            if (!this.$merged.isEmpty()) {
                com.lele.llmonitor.data.BatteryRepository.INSTANCE.getLatestHistory().clear();
                v7_2 = 0;
            } else {
                return v1;
            }
        } else {
            if (v0_0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                v0_1 = this.I$0;
                ib1.Q(p7);
                v7_2 = v0_1;
            }
        }
        if (v7_2 >= this.$merged.size()) {
            com.lele.llmonitor.data.BatteryRepository v6_3 = com.lele.llmonitor.data.BatteryRepository.INSTANCE;
            com.lele.llmonitor.data.BatteryRepository.access$trimToCapacityLocked(v6_3);
            com.lele.llmonitor.data.BatteryRepository.access$schedulePersistLocked(v6_3);
            return v1;
        } else {
            v0_1 = Math.min((v7_2 + 120), this.$merged.size());
            e80 v3_2 = com.lele.llmonitor.data.BatteryRepository.INSTANCE;
            v3_2.getLatestHistory().addAll(this.$merged.subList(v7_2, v0_1));
            com.lele.llmonitor.data.BatteryRepository.access$trimToCapacityLocked(v3_2);
            if (v0_1 >= this.$merged.size()) {
            } else {
                this.I$0 = v0_1;
                this.I$1 = v0_1;
                this.label = 1;
                e80 v3_3 = e80.d;
                if (df2.b0(this) != v3_3) {
                } else {
                    return v3_3;
                }
            }
        }
    }
}
