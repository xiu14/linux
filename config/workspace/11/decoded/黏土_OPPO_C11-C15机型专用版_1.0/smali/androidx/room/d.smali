.class public abstract Landroidx/room/d;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public abstract bind(Ly1/c;Ljava/lang/Object;)V
.end method

.method public abstract createQuery()Ljava/lang/String;
.end method

.method public final handle(Ly1/a;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/lang/Object;",
            ")I"
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
    const/4 p1, 0x0

    .line 9
    return p1

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/room/d;->createQuery()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p1, v0}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :try_start_0
    invoke-virtual {p0, v0, p2}, Landroidx/room/d;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ly1/c;->i0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-static {v0, p2}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Le6/l;->u(Ly1/a;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :catchall_1
    move-exception p2

    .line 36
    invoke-static {v0, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    throw p2
    .line 40
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

.method public final handleMultiple(Ly1/a;Ljava/lang/Iterable;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/room/d;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 2
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 3
    invoke-virtual {p0, v1, v2}, Landroidx/room/d;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 4
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 5
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 6
    invoke-static {p1}, Le6/l;->u(Ly1/a;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 7
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return v0

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

.method public final handleMultiple(Ly1/a;[Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/a;",
            "[",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/room/d;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ly1/a;->v0(Ljava/lang/String;)Ly1/c;

    move-result-object v1

    .line 9
    :try_start_0
    invoke-static {p2}, Lkotlin/jvm/internal/r;->c([Ljava/lang/Object;)Lk5/b;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-virtual {p2}, Lk5/b;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2}, Lk5/b;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {p0, v1, v2}, Landroidx/room/d;->bind(Ly1/c;Ljava/lang/Object;)V

    .line 11
    invoke-interface {v1}, Ly1/c;->i0()Z

    .line 12
    invoke-interface {v1}, Ly1/c;->reset()V

    .line 13
    invoke-static {p1}, Le6/l;->u(Ly1/a;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 14
    invoke-static {v1, p1}, La/a;->o(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return v0

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
