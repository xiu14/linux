package com.lele.llmonitor.data;
final class HomeWallpaperManager$deleteHistoryWallpaper$1 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    final synthetic String $fileName;
    int label;

    public HomeWallpaperManager$deleteHistoryWallpaper$1(android.content.Context p1, String p2, n60 p3)
    {
        this.$context = p1;
        this.$fileName = p2;
        super(2, p3);
        return;
    }

    public final n60 create(Object p2, n60 p3)
    {
        return new com.lele.llmonitor.data.HomeWallpaperManager$deleteHistoryWallpaper$1(this.$context, this.$fileName, p3);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperManager$deleteHistoryWallpaper$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p4)
    {
        android.content.Context v0_0 = this.label;
        if (v0_0 == null) {
            ib1.Q(p4);
            android.content.Context v0_1 = this.$context;
            String v2 = this.$fileName;
            this.label = 1;
            e80 v4_1 = e80.d;
            if (com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.deleteHistoryWallpaper(v0_1, v2, this) == v4_1) {
                return v4_1;
            }
        } else {
            if (v0_0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p4);
            }
        }
        com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE.refreshState();
        com.lele.llmonitor.data.SettingsManager.INSTANCE.refreshLaunchAppearanceSnapshot();
        return bw3.a;
    }
}
