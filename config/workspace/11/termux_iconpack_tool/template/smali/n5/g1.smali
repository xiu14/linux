.class public final Ln5/g1;
.super Ln5/a0;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final l:Lt4/c;


# direct methods
.method public constructor <init>(Lt4/h;Ld5/p;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, p1, v0, v1}, Ln5/a0;-><init>(Lt4/h;ZI)V

    .line 4
    .line 5
    .line 6
    check-cast p2, Lv4/a;

    .line 7
    .line 8
    invoke-virtual {p2, p0, p0}, Lv4/a;->create(Ljava/lang/Object;Lt4/c;)Lt4/c;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ln5/g1;->l:Lt4/c;

    .line 13
    .line 14
    return-void
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
.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln5/g1;->l:Lt4/c;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Le6/l;->w(Lt4/c;)Lt4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 8
    .line 9
    invoke-static {v1, v0}, Ls5/b;->h(Ljava/lang/Object;Lt4/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    instance-of v1, v0, Ln5/c0;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Ln5/c0;

    .line 19
    .line 20
    iget-object v0, v0, Ln5/c0;->h:Ljava/lang/Throwable;

    .line 21
    .line 22
    :cond_0
    invoke-static {v0}, Le6/l;->i(Ljava/lang/Throwable;)Lp4/g;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0, v1}, Ln5/a;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    throw v0
    .line 30
    .line 31
    .line 32
    .line 33
.end method
