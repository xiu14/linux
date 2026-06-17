package com.lele.llmonitor.data.local;
public interface BatteryDao {

    public abstract Object clearOldData();

    public abstract Object deleteAll();

    public abstract ov0 getRecentHistory();

    public abstract Object getStaticHistory();

    public abstract Object insert();
}
