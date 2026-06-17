.class public interface abstract Ldev/jahir/frames/data/db/WallpaperDao;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public abstract delete(Ldev/jahir/frames/data/models/Wallpaper;)V
.end method

.method public abstract deleteByUrl(Ljava/lang/String;)V
.end method

.method public abstract getAllWallpapers()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFirstWallpaper(Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getFirstWallpaperInCollection(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getLastWallpaper(Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getLastWallpaperInCollection(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getNextWallpaper(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getNextWallpaperInCollection(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPreviousWallpaper(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPreviousWallpaperInCollection(Ljava/lang/String;Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getWallpaperByUrl(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insert(Ldev/jahir/frames/data/models/Wallpaper;)V
.end method

.method public abstract insertAll(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Wallpaper;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract nuke()V
.end method
