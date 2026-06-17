.class public abstract Lq5/u;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:La1/u;

.field public static final b:La1/u;

.field public static final c:La1/u;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La1/u;

    .line 2
    .line 3
    const-string v1, "NO_VALUE"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, La1/u;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lq5/u;->a:La1/u;

    .line 10
    .line 11
    new-instance v0, La1/u;

    .line 12
    .line 13
    const-string v1, "NONE"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La1/u;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lq5/u;->b:La1/u;

    .line 19
    .line 20
    new-instance v0, La1/u;

    .line 21
    .line 22
    const-string v1, "PENDING"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, La1/u;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lq5/u;->c:La1/u;

    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static final a([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    .line 1
    long-to-int p2, p1

    .line 2
    array-length p1, p0

    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    and-int/2addr p1, p2

    .line 6
    aput-object p3, p0, p1

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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static final b(Lr1/j;Lq5/h;Lv4/c;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, Lq5/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lq5/j;

    .line 7
    .line 8
    iget v1, v0, Lq5/j;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lq5/j;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lq5/j;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lv4/c;-><init>(Lt4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lq5/j;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Lq5/j;->j:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lq5/j;->h:Lkotlin/jvm/internal/o;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p2, Lkotlin/jvm/internal/o;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    :try_start_1
    new-instance v2, Lq5/e;

    .line 61
    .line 62
    invoke-direct {v2, p1, p2}, Lq5/e;-><init>(Lq5/h;Lkotlin/jvm/internal/o;)V

    .line 63
    .line 64
    .line 65
    iput-object p2, v0, Lq5/j;->h:Lkotlin/jvm/internal/o;

    .line 66
    .line 67
    iput v3, v0, Lq5/j;->j:I

    .line 68
    .line 69
    invoke-virtual {p0, v2, v0}, Lr1/j;->b(Lq5/h;Lt4/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    if-ne p0, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 77
    return-object p0

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    move-object p0, p2

    .line 80
    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Ljava/lang/Throwable;

    .line 83
    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-nez p2, :cond_6

    .line 91
    .line 92
    :cond_4
    invoke-interface {v0}, Lt4/c;->getContext()Lt4/h;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    sget-object v0, Ln5/x0;->h:Ln5/x0;

    .line 97
    .line 98
    invoke-interface {p2, v0}, Lt4/h;->get(Lt4/g;)Lt4/f;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Ln5/y0;

    .line 103
    .line 104
    if-eqz p2, :cond_7

    .line 105
    .line 106
    invoke-interface {p2}, Ln5/y0;->isCancelled()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-interface {p2}, Ln5/y0;->u()Ljava/util/concurrent/CancellationException;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    if-eqz p2, :cond_7

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-nez p2, :cond_6

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_6
    throw p1

    .line 127
    :cond_7
    :goto_3
    if-nez p0, :cond_8

    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_8
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    .line 131
    .line 132
    if-eqz p2, :cond_9

    .line 133
    .line 134
    invoke-static {p0, p1}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    throw p0

    .line 138
    :cond_9
    invoke-static {p1, p0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    throw p1
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static final c(Lq5/g;)Lq5/g;
    .locals 1

    .line 1
    instance-of v0, p0, Lq5/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Lq5/f;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    new-instance v0, Lq5/f;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lq5/f;-><init>(Lq5/g;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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

.method public static final d(Lq5/h;Lp5/u;ZLv4/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lq5/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lq5/i;

    .line 7
    .line 8
    iget v1, v0, Lq5/i;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lq5/i;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lq5/i;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Lv4/c;-><init>(Lt4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lq5/i;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Lq5/i;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-ne v2, v4, :cond_2

    .line 39
    .line 40
    iget-boolean p2, v0, Lq5/i;->k:Z

    .line 41
    .line 42
    iget-object p0, v0, Lq5/i;->j:Lp5/b;

    .line 43
    .line 44
    iget-object p1, v0, Lq5/i;->i:Lp5/u;

    .line 45
    .line 46
    iget-object v2, v0, Lq5/i;->h:Lq5/h;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object p3, p0

    .line 52
    move-object p0, v2

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_3
    iget-boolean p2, v0, Lq5/i;->k:Z

    .line 66
    .line 67
    iget-object p0, v0, Lq5/i;->j:Lp5/b;

    .line 68
    .line 69
    iget-object p1, v0, Lq5/i;->i:Lp5/u;

    .line 70
    .line 71
    iget-object v2, v0, Lq5/i;->h:Lq5/h;

    .line 72
    .line 73
    :try_start_1
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-static {p3}, Le6/l;->H(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :try_start_2
    invoke-interface {p1}, Lp5/u;->iterator()Lp5/b;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    :goto_1
    iput-object p0, v0, Lq5/i;->h:Lq5/h;

    .line 85
    .line 86
    iput-object p1, v0, Lq5/i;->i:Lp5/u;

    .line 87
    .line 88
    iput-object p3, v0, Lq5/i;->j:Lp5/b;

    .line 89
    .line 90
    iput-boolean p2, v0, Lq5/i;->k:Z

    .line 91
    .line 92
    iput v5, v0, Lq5/i;->m:I

    .line 93
    .line 94
    invoke-virtual {p3, v0}, Lp5/b;->b(Lq5/i;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-ne v2, v1, :cond_5

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    move-object v7, v2

    .line 102
    move-object v2, p0

    .line 103
    move-object p0, p3

    .line 104
    move-object p3, v7

    .line 105
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    if-eqz p3, :cond_9

    .line 112
    .line 113
    iget-object p3, p0, Lp5/b;->h:Ljava/lang/Object;

    .line 114
    .line 115
    sget-object v6, Lp5/g;->p:La1/u;

    .line 116
    .line 117
    if-eq p3, v6, :cond_8

    .line 118
    .line 119
    iput-object v6, p0, Lp5/b;->h:Ljava/lang/Object;

    .line 120
    .line 121
    sget-object v6, Lp5/g;->l:La1/u;

    .line 122
    .line 123
    if-eq p3, v6, :cond_6

    .line 124
    .line 125
    iput-object v2, v0, Lq5/i;->h:Lq5/h;

    .line 126
    .line 127
    iput-object p1, v0, Lq5/i;->i:Lp5/u;

    .line 128
    .line 129
    iput-object p0, v0, Lq5/i;->j:Lp5/b;

    .line 130
    .line 131
    iput-boolean p2, v0, Lq5/i;->k:Z

    .line 132
    .line 133
    iput v4, v0, Lq5/i;->m:I

    .line 134
    .line 135
    invoke-interface {v2, p3, v0}, Lq5/h;->c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    if-ne p3, v1, :cond_1

    .line 140
    .line 141
    :goto_3
    return-object v1

    .line 142
    :cond_6
    iget-object p0, p0, Lp5/b;->j:Lp5/e;

    .line 143
    .line 144
    invoke-virtual {p0}, Lp5/e;->p()Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-nez p0, :cond_7

    .line 149
    .line 150
    new-instance p0, Lp5/n;

    .line 151
    .line 152
    const-string p3, "Channel was closed"

    .line 153
    .line 154
    invoke-direct {p0, p3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    sget p3, Ls5/t;->a:I

    .line 158
    .line 159
    throw p0

    .line 160
    :cond_8
    const-string p0, "`hasNext()` has not been invoked"

    .line 161
    .line 162
    new-instance p3, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    invoke-direct {p3, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 168
    :cond_9
    if-eqz p2, :cond_a

    .line 169
    .line 170
    invoke-interface {p1, v3}, Lp5/u;->b(Ljava/util/concurrent/CancellationException;)V

    .line 171
    .line 172
    .line 173
    :cond_a
    sget-object p0, Lp4/k;->a:Lp4/k;

    .line 174
    .line 175
    return-object p0

    .line 176
    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 177
    :catchall_1
    move-exception p3

    .line 178
    if-eqz p2, :cond_d

    .line 179
    .line 180
    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    .line 181
    .line 182
    if-eqz p2, :cond_b

    .line 183
    .line 184
    move-object v3, p0

    .line 185
    check-cast v3, Ljava/util/concurrent/CancellationException;

    .line 186
    .line 187
    :cond_b
    if-nez v3, :cond_c

    .line 188
    .line 189
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 190
    .line 191
    const-string p2, "Channel was consumed, consumer had failed"

    .line 192
    .line 193
    invoke-direct {v3, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 197
    .line 198
    .line 199
    :cond_c
    invoke-interface {p1, v3}, Lp5/u;->b(Ljava/util/concurrent/CancellationException;)V

    .line 200
    .line 201
    .line 202
    :cond_d
    throw p3
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method

.method public static final e(Lq2/k;Lv4/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lr5/c;->b:La1/u;

    .line 2
    .line 3
    instance-of v1, p1, Lq5/o;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lq5/o;

    .line 9
    .line 10
    iget v2, v1, Lq5/o;->k:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lq5/o;->k:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lq5/o;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Lv4/c;-><init>(Lt4/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Lq5/o;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lu4/a;->h:Lu4/a;

    .line 30
    .line 31
    iget v3, v1, Lq5/o;->k:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-ne v3, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v1, Lq5/o;->i:Lq5/n;

    .line 39
    .line 40
    iget-object v2, v1, Lq5/o;->h:Lkotlin/jvm/internal/o;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catch Lr5/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p1}, Le6/l;->H(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lkotlin/jvm/internal/o;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p1, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 65
    .line 66
    new-instance v3, Lq5/n;

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-direct {v3, v5, p1}, Lq5/n;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    iput-object p1, v1, Lq5/o;->h:Lkotlin/jvm/internal/o;

    .line 73
    .line 74
    iput-object v3, v1, Lq5/o;->i:Lq5/n;

    .line 75
    .line 76
    iput v4, v1, Lq5/o;->k:I

    .line 77
    .line 78
    invoke-virtual {p0, v3, v1}, Lq2/k;->b(Lq5/h;Lt4/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_1
    .catch Lr5/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    if-ne p0, v2, :cond_3

    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_3
    move-object v2, p1

    .line 86
    goto :goto_2

    .line 87
    :catch_1
    move-exception p0

    .line 88
    move-object v2, p1

    .line 89
    move-object p1, p0

    .line 90
    move-object p0, v3

    .line 91
    :goto_1
    iget-object v3, p1, Lr5/a;->h:Lq5/n;

    .line 92
    .line 93
    if-ne v3, p0, :cond_5

    .line 94
    .line 95
    invoke-interface {v1}, Lt4/c;->getContext()Lt4/h;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Ln5/x;->g(Lt4/h;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    iget-object p0, v2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 103
    .line 104
    if-eq p0, v0, :cond_4

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 108
    .line 109
    const-string p1, "Expected at least one element"

    .line 110
    .line 111
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0

    .line 115
    :cond_5
    throw p1
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
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method
