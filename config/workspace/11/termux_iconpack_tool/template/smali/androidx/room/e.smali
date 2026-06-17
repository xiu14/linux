.class public abstract Landroidx/room/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public abstract bind(Ly1/c;Ljava/lang/Object;)V
.end method

.method public abstract createQuery()Ljava/lang/String;
.end method

.method public final insert(Ly1/a;Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object p1

    .line 12
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {p0, p1, v0}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 14
    invoke-interface {p1}, Ly1/c;->i0()Z

    .line 15
    invoke-interface {p1}, Ly1/c;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    .line 16
    invoke-static {p1, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final insert(Ly1/a;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object p1

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, p2}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 3
    invoke-interface {p1}, Ly1/c;->i0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, 0x0

    .line 4
    invoke-static {p1, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final insert(Ly1/a;[Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object p1

    .line 6
    :try_start_0
    invoke-static {p2}, Lkotlin/jvm/internal/r;->c([Ljava/lang/Object;)Lk5/b;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-virtual {p2}, Lk5/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lk5/b;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 8
    invoke-interface {p1}, Ly1/c;->i0()Z

    .line 9
    invoke-interface {p1}, Ly1/c;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    .line 10
    invoke-static {p1, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final insertAndReturnId(Ly1/a;Ljava/lang/Object;)J
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/lang/Object;",
            ")J"
        }
    .end annotation

    .line 1
    const-string v0, "connection"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const-wide/16 p1, -0x1

    .line 9
    .line 10
    return-wide p1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :try_start_0
    invoke-virtual {p0, v0, p2}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ly1/c;->i0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-static {v0, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Le6/l;->s(Ly1/a;)J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    :catchall_1
    move-exception p2

    .line 37
    invoke-static {v0, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw p2
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final insertAndReturnIdsArray(Ly1/a;Ljava/util/Collection;)[J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/util/Collection<",
            "Ljava/lang/Object;",
            ">;)[J"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 1
    new-array p1, v0, [J

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 3
    :try_start_0
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    new-array v3, v2, [J

    :goto_0
    if-ge v0, v2, :cond_2

    .line 4
    invoke-static {v0, p2}, Lq4/i;->q0(ILjava/util/Collection;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 5
    invoke-virtual {p0, v1, v4}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 6
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 7
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 8
    invoke-static {p1}, Le6/l;->s(Ly1/a;)J

    move-result-wide v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const-wide/16 v4, -0x1

    .line 9
    :goto_1
    aput-wide v4, v3, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 10
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v3

    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final insertAndReturnIdsArray(Ly1/a;[Ljava/lang/Object;)[J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "[",
            "Ljava/lang/Object;",
            ")[J"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 11
    new-array p1, v0, [J

    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 13
    :try_start_0
    array-length v2, p2

    new-array v3, v2, [J

    :goto_0
    if-ge v0, v2, :cond_2

    .line 14
    aget-object v4, p2, v0

    if-eqz v4, :cond_1

    .line 15
    invoke-virtual {p0, v1, v4}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 16
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 17
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 18
    invoke-static {p1}, Le6/l;->s(Ly1/a;)J

    move-result-wide v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const-wide/16 v4, -0x1

    .line 19
    :goto_1
    aput-wide v4, v3, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 20
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v3

    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final insertAndReturnIdsArrayBox(Ly1/a;Ljava/util/Collection;)[Ljava/lang/Long;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/util/Collection<",
            "Ljava/lang/Object;",
            ">;)[",
            "Ljava/lang/Long;"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 1
    new-array p1, v0, [Ljava/lang/Long;

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 3
    :try_start_0
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    new-array v3, v2, [Ljava/lang/Long;

    :goto_0
    if-ge v0, v2, :cond_2

    .line 4
    invoke-static {v0, p2}, Lq4/i;->q0(ILjava/util/Collection;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 5
    invoke-virtual {p0, v1, v4}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 6
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 7
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 8
    invoke-static {p1}, Le6/l;->s(Ly1/a;)J

    move-result-wide v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const-wide/16 v4, -0x1

    .line 9
    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 10
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v3

    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final insertAndReturnIdsArrayBox(Ly1/a;[Ljava/lang/Object;)[Ljava/lang/Long;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "[",
            "Ljava/lang/Object;",
            ")[",
            "Ljava/lang/Long;"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 11
    new-array p1, v0, [Ljava/lang/Long;

    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 13
    :try_start_0
    array-length v2, p2

    new-array v3, v2, [Ljava/lang/Long;

    :goto_0
    if-ge v0, v2, :cond_2

    .line 14
    aget-object v4, p2, v0

    if-eqz v4, :cond_1

    .line 15
    invoke-virtual {p0, v1, v4}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 16
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 17
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 18
    invoke-static {p1}, Le6/l;->s(Ly1/a;)J

    move-result-wide v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const-wide/16 v4, -0x1

    .line 19
    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 20
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-object v3

    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final insertAndReturnIdsList(Ly1/a;Ljava/util/Collection;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/util/Collection<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 13
    sget-object p1, Lq4/r;->h:Lq4/r;

    return-object p1

    .line 14
    :cond_0
    invoke-static {}, Lq3/a;->v()Lr4/c;

    move-result-object v0

    .line 15
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 16
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 17
    invoke-virtual {p0, v1, v2}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 18
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 19
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 20
    invoke-static {p1}, Le6/l;->s(Ly1/a;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Lr4/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const-wide/16 v2, -0x1

    .line 21
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Lr4/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 22
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 23
    invoke-static {v0}, Lq3/a;->d(Lr4/c;)Lr4/c;

    move-result-object p1

    return-object p1

    .line 24
    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final insertAndReturnIdsList(Ly1/a;[Ljava/lang/Object;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 1
    sget-object p1, Lq4/r;->h:Lq4/r;

    return-object p1

    .line 2
    :cond_0
    invoke-static {}, Lq3/a;->v()Lr4/c;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Landroidx/room/e;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 4
    :try_start_0
    array-length v2, p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, p2, v3

    if-eqz v4, :cond_1

    .line 5
    invoke-virtual {p0, v1, v4}, Landroidx/room/e;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 6
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 7
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 8
    invoke-static {p1}, Le6/l;->s(Ly1/a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Lr4/c;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const-wide/16 v4, -0x1

    .line 9
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Lr4/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 10
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 11
    invoke-static {v0}, Lq3/a;->d(Lr4/c;)Lr4/c;

    move-result-object p1

    return-object p1

    .line 12
    :goto_2
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method
