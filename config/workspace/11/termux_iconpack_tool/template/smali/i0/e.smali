.class public final Li0/e;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public a:Z

.field public b:Lg2/h;

.field public c:Z


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Li0/e;->a:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception v0

    .line 9
    goto :goto_2

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Li0/e;->a:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Li0/e;->c:Z

    .line 14
    .line 15
    iget-object v0, p0, Li0/e;->b:Lg2/h;

    .line 16
    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    :try_start_1
    iget-object v2, v0, Lg2/h;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/lang/Runnable;

    .line 24
    .line 25
    iget-object v3, v0, Lg2/h;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lg2/y;

    .line 28
    .line 29
    iget-object v0, v0, Lg2/h;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Runnable;

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3}, Lg2/y;->cancel()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception v0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :goto_0
    monitor-enter p0

    .line 49
    :try_start_2
    iput-boolean v1, p0, Li0/e;->c:Z

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 52
    .line 53
    .line 54
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 55
    throw v0

    .line 56
    :catchall_2
    move-exception v0

    .line 57
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 58
    throw v0

    .line 59
    :cond_2
    :goto_1
    monitor-enter p0

    .line 60
    :try_start_4
    iput-boolean v1, p0, Li0/e;->c:Z

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 63
    .line 64
    .line 65
    monitor-exit p0

    .line 66
    return-void

    .line 67
    :catchall_3
    move-exception v0

    .line 68
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 69
    throw v0

    .line 70
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 71
    throw v0
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
