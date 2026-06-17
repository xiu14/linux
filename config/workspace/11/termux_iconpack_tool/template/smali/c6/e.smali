.class public final Lc6/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lj6/g0;


# instance fields
.field public final h:Lj6/r;

.field public i:Z

.field public final synthetic j:Lc6/g;


# direct methods
.method public constructor <init>(Lc6/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc6/e;->j:Lc6/g;

    .line 5
    .line 6
    new-instance v0, Lj6/r;

    .line 7
    .line 8
    iget-object p1, p1, Lc6/g;->d:Lj6/j;

    .line 9
    .line 10
    invoke-interface {p1}, Lj6/g0;->h()Lj6/k0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Lj6/r;-><init>(Lj6/k0;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lc6/e;->h:Lj6/r;

    .line 18
    .line 19
    return-void
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


# virtual methods
.method public final J(Lj6/i;J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lc6/e;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p1, Lj6/i;->i:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    move-wide v5, p2

    .line 10
    invoke-static/range {v1 .. v6}, Lx5/b;->b(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lc6/e;->j:Lc6/g;

    .line 14
    .line 15
    iget-object p2, p2, Lc6/g;->d:Lj6/j;

    .line 16
    .line 17
    invoke-interface {p2, p1, v5, v6}, Lj6/g0;->J(Lj6/i;J)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string p2, "closed"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
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

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc6/e;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lc6/e;->i:Z

    .line 8
    .line 9
    iget-object v0, p0, Lc6/e;->h:Lj6/r;

    .line 10
    .line 11
    iget-object v1, v0, Lj6/r;->e:Lj6/k0;

    .line 12
    .line 13
    sget-object v2, Lj6/k0;->d:Lj6/j0;

    .line 14
    .line 15
    iput-object v2, v0, Lj6/r;->e:Lj6/k0;

    .line 16
    .line 17
    invoke-virtual {v1}, Lj6/k0;->a()Lj6/k0;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lj6/k0;->b()Lj6/k0;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    iget-object v1, p0, Lc6/e;->j:Lc6/g;

    .line 25
    .line 26
    iput v0, v1, Lc6/g;->e:I

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc6/e;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lc6/e;->j:Lc6/g;

    .line 7
    .line 8
    iget-object v0, v0, Lc6/g;->d:Lj6/j;

    .line 9
    .line 10
    invoke-interface {v0}, Lj6/j;->flush()V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public final h()Lj6/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc6/e;->h:Lj6/r;

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
