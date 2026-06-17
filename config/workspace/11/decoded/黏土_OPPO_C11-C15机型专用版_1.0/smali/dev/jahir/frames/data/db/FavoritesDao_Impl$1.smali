.class public final Ldev/jahir/frames/data/db/FavoritesDao_Impl$1;
.super Landroidx/room/e;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldev/jahir/frames/data/db/FavoritesDao_Impl;-><init>(Landroidx/room/r0;)V
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
.method public bind(Ly1/c;Ldev/jahir/frames/data/models/Favorite;)V
    .locals 1

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Ldev/jahir/frames/data/models/Favorite;->getUrl()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ly1/c;->S(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ly1/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ldev/jahir/frames/data/models/Favorite;

    invoke-virtual {p0, p1, p2}, Ldev/jahir/frames/data/db/FavoritesDao_Impl$1;->bind(Ly1/c;Ldev/jahir/frames/data/models/Favorite;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `favorites` (`url`) VALUES (?)"

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
