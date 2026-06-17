package com.lele.llmonitor.data;
final class HomeWallpaperManager$importWallpaper$2 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    final synthetic boolean $deleteSourceAfterImport;
    final synthetic d11 $onCompleted;
    final synthetic android.net.Uri $uri;
    int label;

    public HomeWallpaperManager$importWallpaper$2(android.content.Context p1, android.net.Uri p2, boolean p3, d11 p4, n60 p5)
    {
        this.$context = p1;
        this.$uri = p2;
        this.$deleteSourceAfterImport = p3;
        this.$onCompleted = p4;
        super(2, p5);
        return;
    }

    public final n60 create(Object p7, n60 p8)
    {
        return new com.lele.llmonitor.data.HomeWallpaperManager$importWallpaper$2(this.$context, this.$uri, this.$deleteSourceAfterImport, this.$onCompleted, p8);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperManager$importWallpaper$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p5)
    {
        com.lele.llmonitor.data.HomeWallpaperManager v0_0 = this.label;
        if (v0_0 == null) {
            ib1.Q(p5);
            com.lele.llmonitor.data.HomeWallpaperManager v0_3 = this.$context;
            android.net.Uri v2 = this.$uri;
            boolean v3 = this.$deleteSourceAfterImport;
            this.label = 1;
            p5 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.importWallpaper(v0_3, v2, v3, this);
            com.lele.llmonitor.data.HomeWallpaperManager v0_1 = e80.d;
            if (p5 == v0_1) {
                return v0_1;
            }
        } else {
            if (v0_0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p5);
            }
        }
        Boolean v5_2 = ((Boolean) p5).booleanValue();
        if (v5_2 != null) {
            com.lele.llmonitor.data.HomeWallpaperManager v0_2 = com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE;
            v0_2.refreshState();
            v0_2.setEnabled(1);
        }
        this.$onCompleted.invoke(Boolean.valueOf(v5_2));
        return bw3.a;
    }
}
