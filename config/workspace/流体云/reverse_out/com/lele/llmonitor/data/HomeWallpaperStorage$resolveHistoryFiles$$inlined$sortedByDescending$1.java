package com.lele.llmonitor.data;
public final class HomeWallpaperStorage$resolveHistoryFiles$$inlined$sortedByDescending$1 implements java.util.Comparator {

    public HomeWallpaperStorage$resolveHistoryFiles$$inlined$sortedByDescending$1()
    {
        return;
    }

    public final int compare(Object p3, Object p4)
    {
        return l02.m(Long.valueOf(((java.io.File) p4).lastModified()), Long.valueOf(((java.io.File) p3).lastModified()));
    }
}
