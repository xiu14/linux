.class public interface abstract Ldev/jahir/frames/data/db/FavoritesDao;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public abstract delete(Ldev/jahir/frames/data/models/Favorite;)V
.end method

.method public abstract deleteByUrl(Ljava/lang/String;)V
.end method

.method public abstract getAllFavorites()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFirstFavorite(Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getLastFavorite(Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getNextFavorite(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPreviousFavorite(Ljava/lang/String;Lt4/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insert(Ldev/jahir/frames/data/models/Favorite;)V
.end method

.method public abstract insertAll(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/jahir/frames/data/models/Favorite;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract nuke()V
.end method
