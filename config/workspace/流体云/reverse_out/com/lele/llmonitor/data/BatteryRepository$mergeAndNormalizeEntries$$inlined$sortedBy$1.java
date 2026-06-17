package com.lele.llmonitor.data;
public final class BatteryRepository$mergeAndNormalizeEntries$$inlined$sortedBy$1 implements java.util.Comparator {

    public BatteryRepository$mergeAndNormalizeEntries$$inlined$sortedBy$1()
    {
        return;
    }

    public final int compare(Object p1, Object p2)
    {
        return l02.m(Long.valueOf(((com.lele.llmonitor.data.local.BatteryEntity) p1).getTimestamp()), Long.valueOf(((com.lele.llmonitor.data.local.BatteryEntity) p2).getTimestamp()));
    }
}
