package com.lele.llmonitor.data.local;
public final class BatteryDao_Impl$1 extends xp0 {

    public BatteryDao_Impl$1()
    {
        return;
    }

    public void bind(oy2 p3, com.lele.llmonitor.data.local.BatteryEntity p4)
    {
        p3.getClass();
        p4.getClass();
        p3.g(p4.getId(), 1);
        p3.g(p4.getTimestamp(), 2);
        p3.g(((long) p4.getLevel()), 3);
        p3.c(((double) p4.getVoltage()), 4);
        p3.c(((double) p4.getCurrent()), 5);
        p3.c(((double) p4.getPower()), 6);
        p3.c(((double) p4.getTemperature()), 7);
        return;
    }

    public bridge synthetic void bind(oy2 p1, Object p2)
    {
        this.bind(p1, ((com.lele.llmonitor.data.local.BatteryEntity) p2));
        return;
    }

    public String createQuery()
    {
        return "INSERT OR ABORT INTO `battery_history` (`id`,`timestamp`,`level`,`voltage`,`current`,`power`,`temperature`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
    }
}
