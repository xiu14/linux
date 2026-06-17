.class public final La6/g;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lw5/e;

.field public volatile i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic j:La6/j;


# direct methods
.method public constructor <init>(La6/j;Lw5/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La6/g;->j:La6/j;

    .line 5
    .line 6
    iput-object p2, p0, La6/g;->h:Lw5/e;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La6/g;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    return-void
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
.method public final run()V
    .locals 8

    .line 1
    const-string v0, "Callback failure for "

    .line 2
    .line 3
    const-string v1, "canceled due to "

    .line 4
    .line 5
    iget-object v2, p0, La6/g;->j:La6/j;

    .line 6
    .line 7
    iget-object v2, v2, La6/j;->i:Landroidx/appcompat/widget/a0;

    .line 8
    .line 9
    iget-object v2, v2, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lw5/p;

    .line 12
    .line 13
    invoke-virtual {v2}, Lw5/p;->g()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "OkHttp "

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, La6/g;->j:La6/j;

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v4, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    iget-object v2, v3, La6/j;->k:La6/i;

    .line 37
    .line 38
    invoke-virtual {v2}, Lj6/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    :try_start_1
    invoke-virtual {v3}, La6/j;->h()Lw5/z;

    .line 43
    .line 44
    .line 45
    move-result-object v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 46
    const/4 v6, 0x1

    .line 47
    :try_start_2
    iget-object v7, p0, La6/g;->h:Lw5/e;

    .line 48
    .line 49
    invoke-interface {v7, v2}, Lw5/e;->f(Lw5/z;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_3
    iget-object v0, v3, La6/j;->h:Lw5/u;

    .line 53
    .line 54
    :goto_0
    iget-object v0, v0, Lw5/u;->h:Lu2/n;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Lu2/n;->d(La6/g;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_5

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_7

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    const/4 v2, 0x1

    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception v1

    .line 66
    const/4 v2, 0x1

    .line 67
    goto :goto_3

    .line 68
    :catchall_2
    move-exception v0

    .line 69
    :goto_1
    :try_start_4
    invoke-virtual {v3}, La6/j;->cancel()V

    .line 70
    .line 71
    .line 72
    if-nez v2, :cond_0

    .line 73
    .line 74
    new-instance v2, Ljava/io/IOException;

    .line 75
    .line 76
    new-instance v6, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, La6/g;->h:Lw5/e;

    .line 95
    .line 96
    invoke-interface {v1, v3, v2}, Lw5/e;->c(La6/j;Ljava/io/IOException;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_3
    move-exception v0

    .line 101
    goto :goto_6

    .line 102
    :cond_0
    :goto_2
    throw v0

    .line 103
    :catch_1
    move-exception v1

    .line 104
    :goto_3
    if-eqz v2, :cond_1

    .line 105
    .line 106
    sget-object v2, Le6/n;->a:Le6/n;

    .line 107
    .line 108
    sget-object v2, Le6/n;->a:Le6/n;

    .line 109
    .line 110
    new-instance v6, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v3}, La6/j;->a(La6/j;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    const/4 v2, 0x4

    .line 130
    invoke-static {v0, v2, v1}, Le6/n;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_1
    iget-object v0, p0, La6/g;->h:Lw5/e;

    .line 135
    .line 136
    invoke-interface {v0, v3, v1}, Lw5/e;->c(La6/j;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 137
    .line 138
    .line 139
    :goto_4
    :try_start_5
    iget-object v0, v3, La6/j;->h:Lw5/u;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :goto_5
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :goto_6
    :try_start_6
    iget-object v1, v3, La6/j;->h:Lw5/u;

    .line 147
    .line 148
    iget-object v1, v1, Lw5/u;->h:Lu2/n;

    .line 149
    .line 150
    invoke-virtual {v1, p0}, Lu2/n;->d(La6/g;)V

    .line 151
    .line 152
    .line 153
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 154
    :goto_7
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
