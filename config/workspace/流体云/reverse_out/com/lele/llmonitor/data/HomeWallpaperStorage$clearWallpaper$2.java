package com.lele.llmonitor.data;
final class HomeWallpaperStorage$clearWallpaper$2 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    int label;

    public HomeWallpaperStorage$clearWallpaper$2(android.content.Context p1, n60 p2)
    {
        this.$context = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        return new com.lele.llmonitor.data.HomeWallpaperStorage$clearWallpaper$2(this.$context, p2);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperStorage$clearWallpaper$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p2)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p2);
            com.lele.llmonitor.data.HomeWallpaperStorage v2_1 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE;
            v2_1.resolveWallpaperFile(this.$context).delete();
            return Boolean.valueOf(v2_1.resolveStartupPreviewFile(this.$context).delete());
        }
    }
}
