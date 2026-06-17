package com.lele.llmonitor.data;
final class HomeWallpaperManager$refreshState$1$resolvedHistory$1 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    final synthetic java.io.File $currentFile;
    int label;

    public HomeWallpaperManager$refreshState$1$resolvedHistory$1(android.content.Context p1, java.io.File p2, n60 p3)
    {
        this.$context = p1;
        this.$currentFile = p2;
        super(2, p3);
        return;
    }

    public final n60 create(Object p2, n60 p3)
    {
        return new com.lele.llmonitor.data.HomeWallpaperManager$refreshState$1$resolvedHistory$1(this.$context, this.$currentFile, p3);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperManager$refreshState$1$resolvedHistory$1) this.create(p1, p2)).invokeSuspend(bw3.a);
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
            return com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.resolveHistoryFiles(this.$context, this.$currentFile);
        }
    }
}
