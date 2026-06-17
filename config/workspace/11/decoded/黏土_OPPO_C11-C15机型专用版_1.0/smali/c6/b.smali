.class public final Lc6/b;
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
    iput-object p1, p0, Lc6/b;->j:Lc6/g;

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
    iput-object v0, p0, Lc6/b;->h:Lj6/r;

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
    .locals 4

    .line 1
    iget-object v0, p0, Lc6/b;->j:Lc6/g;

    .line 2
    .line 3
    iget-object v0, v0, Lc6/g;->d:Lj6/j;

    .line 4
    .line 5
    iget-boolean v1, p0, Lc6/b;->i:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    cmp-long v3, p2, v1

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {v0, p2, p3}, Lj6/j;->o(J)Lj6/j;

    .line 17
    .line 18
    .line 19
    const-string v1, "\r\n"

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lj6/j;->k0(Ljava/lang/String;)Lj6/j;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1, p2, p3}, Lj6/g0;->J(Lj6/i;J)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Lj6/j;->k0(Ljava/lang/String;)Lj6/j;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string p2, "closed"

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
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

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lc6/b;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lc6/b;->i:Z

    .line 10
    .line 11
    iget-object v0, p0, Lc6/b;->j:Lc6/g;

    .line 12
    .line 13
    iget-object v0, v0, Lc6/g;->d:Lj6/j;

    .line 14
    .line 15
    const-string v1, "0\r\n\r\n"

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lj6/j;->k0(Ljava/lang/String;)Lj6/j;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lc6/b;->h:Lj6/r;

    .line 21
    .line 22
    iget-object v1, v0, Lj6/r;->e:Lj6/k0;

    .line 23
    .line 24
    sget-object v2, Lj6/k0;->d:Lj6/j0;

    .line 25
    .line 26
    iput-object v2, v0, Lj6/r;->e:Lj6/k0;

    .line 27
    .line 28
    invoke-virtual {v1}, Lj6/k0;->a()Lj6/k0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lj6/k0;->b()Lj6/k0;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lc6/b;->j:Lc6/g;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iput v1, v0, Lc6/g;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    throw v0
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
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lc6/b;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lc6/b;->j:Lc6/g;

    .line 9
    .line 10
    iget-object v0, v0, Lc6/g;->d:Lj6/j;

    .line 11
    .line 12
    invoke-interface {v0}, Lj6/j;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    throw v0
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
    iget-object v0, p0, Lc6/b;->h:Lj6/r;

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
