package com.lele.llmonitor.data;
final class BatteryRepository$loadInitialData$merged$1 extends jj3 implements h11 {
    final synthetic java.util.List $currentSnapshot;
    final synthetic java.util.List $data;
    final synthetic java.util.List $persisted;
    int label;

    public BatteryRepository$loadInitialData$merged$1(java.util.List p1, java.util.List p2, java.util.List p3, n60 p4)
    {
        this.$currentSnapshot = p1;
        this.$data = p2;
        this.$persisted = p3;
        super(2, p4);
        return;
    }

    public final n60 create(Object p3, n60 p4)
    {
        return new com.lele.llmonitor.data.BatteryRepository$loadInitialData$merged$1(this.$currentSnapshot, this.$data, this.$persisted, p4);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.BatteryRepository$loadInitialData$merged$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p5)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p5);
            java.util.List v1 = this.$data;
            int v4_1 = this.$persisted;
            java.util.List[] v2_1 = new java.util.List[3];
            v2_1[0] = this.$currentSnapshot;
            v2_1[1] = v1;
            v2_1[2] = v4_1;
            return com.lele.llmonitor.data.BatteryRepository.access$mergeAndNormalizeEntries(com.lele.llmonitor.data.BatteryRepository.INSTANCE, v2_1);
        }
    }
}
