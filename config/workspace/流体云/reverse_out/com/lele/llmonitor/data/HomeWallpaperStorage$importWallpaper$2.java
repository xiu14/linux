package com.lele.llmonitor.data;
final class HomeWallpaperStorage$importWallpaper$2 extends jj3 implements h11 {
    final synthetic android.content.Context $context;
    final synthetic boolean $deleteSourceAfterImport;
    final synthetic android.net.Uri $sourceUri;
    int label;

    public HomeWallpaperStorage$importWallpaper$2(android.content.Context p1, android.net.Uri p2, boolean p3, n60 p4)
    {
        this.$context = p1;
        this.$sourceUri = p2;
        this.$deleteSourceAfterImport = p3;
        super(2, p4);
        return;
    }

    public final n60 create(Object p3, n60 p4)
    {
        return new com.lele.llmonitor.data.HomeWallpaperStorage$importWallpaper$2(this.$context, this.$sourceUri, this.$deleteSourceAfterImport, p4);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.HomeWallpaperStorage$importWallpaper$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p4)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p4);
            com.lele.llmonitor.data.HomeWallpaperStorage v4_1 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE;
            com.lele.llmonitor.data.HomeWallpaperStorage.access$ensureWallpaperDirectories(v4_1, this.$context);
            boolean v0_2 = com.lele.llmonitor.data.HomeWallpaperStorage.access$createHistoryFile(v4_1, this.$context);
            if (com.lele.llmonitor.data.HomeWallpaperStorage.access$copyUriToFile(v4_1, this.$context, this.$sourceUri, v0_2)) {
                if (com.lele.llmonitor.data.HomeWallpaperStorage.access$replaceCurrentWallpaper(v4_1, this.$context, v0_2)) {
                    com.lele.llmonitor.data.HomeWallpaperStorage.access$pruneHistory(v4_1, this.$context);
                    if (this.$deleteSourceAfterImport) {
                        com.lele.llmonitor.data.HomeWallpaperStorage.access$deleteLocalFileUri(v4_1, this.$sourceUri);
                    }
                    return Boolean.TRUE;
                } else {
                    v0_2.delete();
                    if (this.$deleteSourceAfterImport) {
                        com.lele.llmonitor.data.HomeWallpaperStorage.access$deleteLocalFileUri(v4_1, this.$sourceUri);
                    }
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
    }
}
