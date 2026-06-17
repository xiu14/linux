package com.lele.llmonitor.data;
final class HomeWallpaperStorage$applyWallpaperFromHistory$2 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    final synthetic String $historyFileName;
    int label;

    public HomeWallpaperStorage$applyWallpaperFromHistory$2(android.content.Context p1, String p2, n60 p3)
    {
        this.$context = p1;
        this.$historyFileName = p2;
        super(2, p3);
        return;
    }

    public final n60 create(Object p2, n60 p3)
    {
        return new com.lele.llmonitor.data.HomeWallpaperStorage$applyWallpaperFromHistory$2(this.$context, this.$historyFileName, p3);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperStorage$applyWallpaperFromHistory$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p5)
    {
        Object v1_0 = 0;
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p5);
            com.lele.llmonitor.data.HomeWallpaperStorage v5_4 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE;
            com.lele.llmonitor.data.HomeWallpaperStorage.access$ensureWallpaperDirectories(v5_4, this.$context);
            boolean v0_2 = this.$historyFileName;
            com.lele.llmonitor.data.HomeWallpaperStorage v5_2 = com.lele.llmonitor.data.HomeWallpaperStorage.resolveHistoryFiles$default(v5_4, this.$context, 0, 2, 0).iterator();
            while (v5_2.hasNext()) {
                long v2_2 = v5_2.next();
                if (ni1.o(((java.io.File) v2_2).getName(), v0_2)) {
                    v1_0 = v2_2;
                    break;
                }
            }
            Object v1_1 = ((java.io.File) v1_0);
            if (v1_1 != null) {
                com.lele.llmonitor.data.HomeWallpaperStorage v5_3 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE;
                if (com.lele.llmonitor.data.HomeWallpaperStorage.access$replaceCurrentWallpaper(v5_3, this.$context, v1_1)) {
                    v1_1.setLastModified(System.currentTimeMillis());
                    com.lele.llmonitor.data.HomeWallpaperStorage.access$pruneHistory(v5_3, this.$context);
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
    }
}
