.class public final Ll6/o;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ll6/e;


# instance fields
.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ll6/e;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6/o;->h:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Ll6/o;->i:Ll6/e;

    .line 7
    .line 8
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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


# virtual methods
.method public final b(Ll6/h;)V
    .locals 1

    .line 1
    new-instance v0, Lu2/u;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lu2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ll6/o;->i:Ll6/e;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ll6/e;->b(Ll6/h;)V

    .line 9
    .line 10
    .line 11
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final c0()Landroidx/appcompat/widget/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Ll6/o;->i:Ll6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ll6/e;->c0()Landroidx/appcompat/widget/a0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll6/o;->i:Ll6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ll6/e;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll6/o;->clone()Ll6/e;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll6/e;
    .locals 3

    .line 2
    new-instance v0, Ll6/o;

    iget-object v1, p0, Ll6/o;->i:Ll6/e;

    invoke-interface {v1}, Ll6/e;->clone()Ll6/e;

    move-result-object v1

    iget-object v2, p0, Ll6/o;->h:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v2, v1}, Ll6/o;-><init>(Ljava/util/concurrent/Executor;Ll6/e;)V

    return-object v0
.end method

.method public final p0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ll6/o;->i:Ll6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ll6/e;->p0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
