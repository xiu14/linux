.class public abstract Ll2/d0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public final a(Ll2/u;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lq3/a;->Q(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lm2/r;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Lm2/o;

    .line 15
    .line 16
    invoke-direct {v1, v0, p1}, Lm2/o;-><init>(Lm2/r;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, v1, Lm2/o;->e:Z

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    iget-object p1, v0, Lm2/r;->b:Ll2/a;

    .line 24
    .line 25
    iget-object p1, p1, Ll2/a;->m:Ll2/a0;

    .line 26
    .line 27
    iget-object v0, v0, Lm2/r;->d:Lw2/a;

    .line 28
    .line 29
    check-cast v0, Lu2/i;

    .line 30
    .line 31
    iget-object v0, v0, Lu2/i;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Landroidx/room/c1;

    .line 34
    .line 35
    new-instance v2, La2/e;

    .line 36
    .line 37
    const/16 v3, 0x18

    .line 38
    .line 39
    invoke-direct {v2, v3, v1}, La2/e;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v1, "EnqueueRunnable_KEEP"

    .line 43
    .line 44
    invoke-static {p1, v1, v0, v2}, Lq3/a;->P(Ll2/a0;Ljava/lang/String;Landroidx/room/c1;Ld5/a;)Ll2/a0;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    sget-object v0, Lm2/o;->f:Ljava/lang/String;

    .line 53
    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v3, "Already enqueued work ids ("

    .line 57
    .line 58
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v3, ", "

    .line 62
    .line 63
    iget-object v1, v1, Lm2/o;->c:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ")"

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1, v0, v1}, Ll2/t;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    return-void

    .line 85
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    const-string v0, "enqueue needs at least one WorkRequest."

    .line 88
    .line 89
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
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

.method public abstract b(Ljava/util/UUID;)Landroidx/lifecycle/h0;
.end method

.method public abstract c()Ll2/a0;
.end method
