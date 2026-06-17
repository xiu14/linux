package com.lele.llmonitor.data;
final class BatteryRepository$emitNewEntry$2 extends jj3 implements h11 {
    final synthetic com.lele.llmonitor.data.local.BatteryEntity $entry;
    int label;

    public BatteryRepository$emitNewEntry$2(com.lele.llmonitor.data.local.BatteryEntity p1, n60 p2)
    {
        this.$entry = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        return new com.lele.llmonitor.data.BatteryRepository$emitNewEntry$2(this.$entry, p2);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.BatteryRepository$emitNewEntry$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p7)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p7);
            com.lele.llmonitor.data.BatteryRepository v7_1 = com.lele.llmonitor.data.BatteryRepository.INSTANCE;
            float v0_2 = ((com.lele.llmonitor.data.local.BatteryEntity) yw.H0(v7_1.getLatestHistory()));
            bw3 v1 = bw3.a;
            if ((v0_2 == 0) || ((v0_2.getTimestamp() != this.$entry.getTimestamp()) || ((v0_2.getLevel() != this.$entry.getLevel()) || ((v0_2.getVoltage() != this.$entry.getVoltage()) || ((v0_2.getCurrent() != this.$entry.getCurrent()) || ((v0_2.getPower() != this.$entry.getPower()) || (v0_2.getTemperature() != this.$entry.getTemperature()))))))) {
                v7_1.getLatestHistory().add(this.$entry);
                com.lele.llmonitor.data.BatteryRepository.access$trimToCapacityLocked(v7_1);
                com.lele.llmonitor.data.BatteryRepository.access$schedulePersistLocked(v7_1);
                return v1;
            } else {
                return v1;
            }
        }
    }
}
