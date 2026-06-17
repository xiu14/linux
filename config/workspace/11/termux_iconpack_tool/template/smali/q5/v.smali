.class public final Lq5/v;
.super Lr5/d;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:J

.field public b:Ln5/h;


# virtual methods
.method public final a(Lr5/b;)Z
    .locals 5

    .line 1
    check-cast p1, Lq5/t;

    .line 2
    .line 3
    iget-wide v0, p0, Lq5/v;->a:J

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-ltz v4, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    iget-wide v0, p1, Lq5/t;->m:J

    .line 14
    .line 15
    iget-wide v2, p1, Lq5/t;->n:J

    .line 16
    .line 17
    cmp-long v4, v0, v2

    .line 18
    .line 19
    if-gez v4, :cond_1

    .line 20
    .line 21
    iput-wide v0, p1, Lq5/t;->n:J

    .line 22
    .line 23
    :cond_1
    iput-wide v0, p0, Lq5/v;->a:J

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1
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

.method public final b(Lr5/b;)[Lt4/c;
    .locals 4

    .line 1
    check-cast p1, Lq5/t;

    .line 2
    .line 3
    iget-wide v0, p0, Lq5/v;->a:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    iput-wide v2, p0, Lq5/v;->a:J

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-object v2, p0, Lq5/v;->b:Ln5/h;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lq5/t;->t(J)[Lt4/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
