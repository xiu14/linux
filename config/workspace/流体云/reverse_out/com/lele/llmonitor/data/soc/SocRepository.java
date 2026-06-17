package com.lele.llmonitor.data.soc;
public final class SocRepository {
    public static final int $stable = 0;
    private static final long CORE_FREQUENCY_REFRESH_INTERVAL_MS = 2500;
    private static final long CPU_MODEL_REFRESH_INTERVAL_MS = 300000;
    public static final com.lele.llmonitor.data.soc.SocRepository$Companion Companion;
    private final com.lele.llmonitor.data.soc.SocDataSource dataSource;

    static SocRepository()
    {
        com.lele.llmonitor.data.soc.SocRepository.Companion = new com.lele.llmonitor.data.soc.SocRepository$Companion(0);
        com.lele.llmonitor.data.soc.SocRepository.$stable = 8;
        return;
    }

    public SocRepository()
    {
        this(0, 1, 0);
        return;
    }

    public SocRepository(com.lele.llmonitor.data.soc.SocDataSource p1)
    {
        p1.getClass();
        this.dataSource = p1;
        return;
    }

    public synthetic SocRepository(com.lele.llmonitor.data.soc.SocDataSource p1, int p2, ic0 p3)
    {
        if ((p2 & 1) != 0) {
            p1 = new com.lele.llmonitor.data.soc.LinuxSocDataSource();
        }
        this(p1);
        return;
    }

    public static final synthetic com.lele.llmonitor.data.soc.SocDataSource access$getDataSource$p(com.lele.llmonitor.data.soc.SocRepository p0)
    {
        return p0.dataSource;
    }

    public static synthetic ov0 stream$default(com.lele.llmonitor.data.soc.SocRepository p0, long p1, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = 1500;
        }
        return p0.stream(p1);
    }

    public final ov0 stream(long p3)
    {
        ov0 v2_1 = new bb0;
        v2_1(3, new com.lele.llmonitor.data.soc.SocRepository$stream$1(this, p3, 0));
        return tg1.y(v2_1, bd0.f);
    }
}
