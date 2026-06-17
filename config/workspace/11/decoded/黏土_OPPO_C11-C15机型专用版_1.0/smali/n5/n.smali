.class public final Ln5/n;
.super Ln5/f1;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ln5/m;


# virtual methods
.method public final U(Lv4/h;)Ljava/lang/Object;
    .locals 3

    .line 1
    :cond_0
    sget-object v0, Ln5/f1;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ln5/u0;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    instance-of p1, v0, Ln5/p;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    invoke-static {v0}, Ln5/x;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    check-cast v0, Ln5/p;

    .line 21
    .line 22
    iget-object p1, v0, Ln5/p;->a:Ljava/lang/Throwable;

    .line 23
    .line 24
    throw p1

    .line 25
    :cond_2
    invoke-virtual {p0, v0}, Ln5/f1;->Q(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ltz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Ln5/c1;

    .line 32
    .line 33
    invoke-static {p1}, Le6/l;->w(Lt4/c;)Lt4/c;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1, p0}, Ln5/c1;-><init>(Lt4/c;Ln5/n;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ln5/h;->s()V

    .line 41
    .line 42
    .line 43
    new-instance p1, Ln5/j;

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    invoke-direct {p1, v1, v0}, Ln5/j;-><init>(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-static {p0, v1, p1}, Ln5/x;->o(Ln5/y0;ZLn5/b1;)Ln5/i0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v1, Ln5/e;

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    invoke-direct {v1, v2, p1}, Ln5/e;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ln5/h;->v(Ln5/k1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ln5/h;->r()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 68
    .line 69
    :goto_0
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 70
    .line 71
    return-object p1
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
.end method
