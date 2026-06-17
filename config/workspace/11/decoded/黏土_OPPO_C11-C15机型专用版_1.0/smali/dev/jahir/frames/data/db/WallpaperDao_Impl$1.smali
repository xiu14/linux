.class public final Ldev/jahir/frames/data/db/WallpaperDao_Impl$1;
.super Landroidx/room/e;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/frames/data/db/WallpaperDao_Impl;-><init>(Landroidx/room/r0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/e;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public bind(Ly1/c;Ldev/jahir/frames/data/models/Wallpaper;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ly1/c;->S(ILjava/lang/String;)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ly1/c;->S(ILjava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getAuthor()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    .line 5
    invoke-interface {p1, v1}, Ly1/c;->d(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {p1, v1, v0}, Ly1/c;->S(ILjava/lang/String;)V

    .line 7
    :goto_0
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getThumbnail()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    .line 8
    invoke-interface {p1, v1}, Ly1/c;->d(I)V

    goto :goto_1

    .line 9
    :cond_1
    invoke-interface {p1, v1, v0}, Ly1/c;->S(ILjava/lang/String;)V

    .line 10
    :goto_1
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getCollections()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    .line 11
    invoke-interface {p1, v1}, Ly1/c;->d(I)V

    goto :goto_2

    .line 12
    :cond_2
    invoke-interface {p1, v1, v0}, Ly1/c;->S(ILjava/lang/String;)V

    .line 13
    :goto_2
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getDimensions()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_3

    .line 14
    invoke-interface {p1, v1}, Ly1/c;->d(I)V

    goto :goto_3

    .line 15
    :cond_3
    invoke-interface {p1, v1, v0}, Ly1/c;->S(ILjava/lang/String;)V

    .line 16
    :goto_3
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getCopyright()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_4

    .line 17
    invoke-interface {p1, v1}, Ly1/c;->d(I)V

    goto :goto_4

    .line 18
    :cond_4
    invoke-interface {p1, v1, v0}, Ly1/c;->S(ILjava/lang/String;)V

    .line 19
    :goto_4
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getDownloadable()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    const/16 v1, 0x8

    if-nez v0, :cond_6

    .line 21
    invoke-interface {p1, v1}, Ly1/c;->d(I)V

    goto :goto_6

    .line 22
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ly1/c;->i(IJ)V

    .line 23
    :goto_6
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Wallpaper;->getSize()Ljava/lang/Long;

    move-result-object p2

    const/16 v0, 0x9

    if-nez p2, :cond_7

    .line 24
    invoke-interface {p1, v0}, Ly1/c;->d(I)V

    return-void

    .line 25
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ly1/c;->i(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ly1/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldev/jahir/frames/data/models/Wallpaper;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/frames/data/db/WallpaperDao_Impl$1;->bind(Ly1/c;Ldev/jahir/frames/data/models/Wallpaper;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `wallpapers` (`name`,`url`,`author`,`thumbnail`,`collections`,`dimensions`,`copyright`,`downloadable`,`size`) VALUES (?,?,?,?,?,?,?,?,?)"

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
