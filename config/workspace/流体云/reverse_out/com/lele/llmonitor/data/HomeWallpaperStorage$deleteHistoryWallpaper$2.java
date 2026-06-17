package com.lele.llmonitor.data;
final class HomeWallpaperStorage$deleteHistoryWallpaper$2 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    final synthetic String $historyFileName;
    int label;

    public HomeWallpaperStorage$deleteHistoryWallpaper$2(android.content.Context p1, String p2, n60 p3)
    {
        this.$context = p1;
        this.$historyFileName = p2;
        super(2, p3);
        return;
    }

    public final n60 create(Object p2, n60 p3)
    {
        return new com.lele.llmonitor.data.HomeWallpaperStorage$deleteHistoryWallpaper$2(this.$context, this.$historyFileName, p3);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperStorage$deleteHistoryWallpaper$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p4)
    {
        Object v1_0 = 0;
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p4);
            java.util.Iterator v4_3 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE;
            com.lele.llmonitor.data.HomeWallpaperStorage.access$ensureWallpaperDirectories(v4_3, this.$context);
            Boolean v3_1 = this.$historyFileName;
            java.util.Iterator v4_2 = com.lele.llmonitor.data.HomeWallpaperStorage.resolveHistoryFiles$default(v4_3, this.$context, 0, 2, 0).iterator();
            while (v4_2.hasNext()) {
                Object v0_3 = v4_2.next();
                if (ni1.o(((java.io.File) v0_3).getName(), v3_1)) {
                    v1_0 = v0_3;
                    break;
                }
            }
            Object v1_1 = ((java.io.File) v1_0);
            if (v1_1 != null) {
                return Boolean.valueOf(v1_1.delete());
            } else {
                return Boolean.FALSE;
            }
        }
    }
}
