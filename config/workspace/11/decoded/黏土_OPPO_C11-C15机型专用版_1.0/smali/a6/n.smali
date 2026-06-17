.class public final La6/n;
.super Ld6/h;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final b:Lw5/c0;

.field public c:Ljava/net/Socket;

.field public d:Ljava/net/Socket;

.field public e:Lw5/m;

.field public f:Lw5/v;

.field public g:Ld6/o;

.field public h:Lj6/c0;

.field public i:Lj6/b0;

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:J


# direct methods
.method public constructor <init>(La6/p;Lw5/c0;)V
    .locals 1

    .line 1
    const-string v0, "connectionPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "route"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, La6/n;->b:Lw5/c0;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput p1, p0, La6/n;->o:I

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La6/n;->p:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-wide p1, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide p1, p0, La6/n;->q:J

    .line 32
    .line 33
    return-void
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

.method public static d(Lw5/u;Lw5/c0;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "failedRoute"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "failure"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lw5/c0;->b:Ljava/net/Proxy;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p1, Lw5/c0;->a:Lw5/a;

    .line 22
    .line 23
    iget-object v1, v0, Lw5/a;->g:Ljava/net/ProxySelector;

    .line 24
    .line 25
    iget-object v0, v0, Lw5/a;->h:Lw5/p;

    .line 26
    .line 27
    invoke-virtual {v0}, Lw5/p;->h()Ljava/net/URI;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v2, p1, Lw5/c0;->b:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object p0, p0, Lw5/u;->F:La1/q;

    .line 41
    .line 42
    monitor-enter p0

    .line 43
    :try_start_0
    iget-object p2, p0, La1/q;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1
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


# virtual methods
.method public final declared-synchronized a(Ld6/o;Ld6/b0;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string p1, "settings"

    .line 3
    .line 4
    invoke-static {p2, p1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget p1, p2, Ld6/b0;->a:I

    .line 8
    .line 9
    and-int/lit8 p1, p1, 0x10

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p2, Ld6/b0;->b:[I

    .line 14
    .line 15
    const/4 p2, 0x4

    .line 16
    aget p1, p1, p2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    :goto_0
    iput p1, p0, La6/n;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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

.method public final b(Ld6/w;)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Ld6/w;->c(ILjava/io/IOException;)V

    .line 5
    .line 6
    .line 7
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final c(IIIZLa6/j;)V
    .locals 7

    .line 1
    const-string v0, "inetSocketAddress"

    .line 2
    .line 3
    iget-object v1, p0, La6/n;->f:Lw5/v;

    .line 4
    .line 5
    if-nez v1, :cond_e

    .line 6
    .line 7
    iget-object v1, p0, La6/n;->b:Lw5/c0;

    .line 8
    .line 9
    iget-object v1, v1, Lw5/c0;->a:Lw5/a;

    .line 10
    .line 11
    iget-object v1, v1, Lw5/a;->j:Ljava/util/List;

    .line 12
    .line 13
    new-instance v2, La6/b;

    .line 14
    .line 15
    invoke-direct {v2, v1}, La6/b;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, La6/n;->b:Lw5/c0;

    .line 19
    .line 20
    iget-object v3, v3, Lw5/c0;->a:Lw5/a;

    .line 21
    .line 22
    iget-object v4, v3, Lw5/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    sget-object v3, Lw5/j;->f:Lw5/j;

    .line 27
    .line 28
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, La6/n;->b:Lw5/c0;

    .line 35
    .line 36
    iget-object v1, v1, Lw5/c0;->a:Lw5/a;

    .line 37
    .line 38
    iget-object v1, v1, Lw5/a;->h:Lw5/p;

    .line 39
    .line 40
    iget-object v1, v1, Lw5/p;->d:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v3, Le6/n;->a:Le6/n;

    .line 43
    .line 44
    sget-object v3, Le6/n;->a:Le6/n;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Le6/n;->h(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, La6/q;

    .line 54
    .line 55
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 56
    .line 57
    const-string p3, "CLEARTEXT communication to "

    .line 58
    .line 59
    const-string p4, " not permitted by network security policy"

    .line 60
    .line 61
    invoke-static {p3, v1, p4}, Landroidx/appcompat/app/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p1, p2}, La6/q;-><init>(Ljava/io/IOException;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_1
    new-instance p1, La6/q;

    .line 73
    .line 74
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 75
    .line 76
    const-string p3, "CLEARTEXT communication not enabled for client"

    .line 77
    .line 78
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, p2}, La6/q;-><init>(Ljava/io/IOException;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_2
    iget-object v1, v3, Lw5/a;->i:Ljava/util/List;

    .line 86
    .line 87
    sget-object v3, Lw5/v;->m:Lw5/v;

    .line 88
    .line 89
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_d

    .line 94
    .line 95
    :goto_0
    const/4 v1, 0x0

    .line 96
    move-object v3, v1

    .line 97
    :goto_1
    const/4 v4, 0x1

    .line 98
    :try_start_0
    iget-object v5, p0, La6/n;->b:Lw5/c0;

    .line 99
    .line 100
    iget-object v6, v5, Lw5/c0;->a:Lw5/a;

    .line 101
    .line 102
    iget-object v6, v6, Lw5/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 103
    .line 104
    if-eqz v6, :cond_3

    .line 105
    .line 106
    iget-object v5, v5, Lw5/c0;->b:Ljava/net/Proxy;

    .line 107
    .line 108
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    sget-object v6, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 113
    .line 114
    if-ne v5, v6, :cond_3

    .line 115
    .line 116
    const/4 v5, 0x1

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    const/4 v5, 0x0

    .line 119
    :goto_2
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0, p1, p2, p3, p5}, La6/n;->f(IIILa6/j;)V

    .line 122
    .line 123
    .line 124
    iget-object v5, p0, La6/n;->c:Ljava/net/Socket;

    .line 125
    .line 126
    if-nez v5, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :catch_0
    move-exception v5

    .line 130
    goto :goto_5

    .line 131
    :cond_4
    invoke-virtual {p0, p1, p2, p5}, La6/n;->e(IILa6/j;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-virtual {p0, v2, p5}, La6/n;->g(La6/b;La6/j;)V

    .line 135
    .line 136
    .line 137
    iget-object v5, p0, La6/n;->b:Lw5/c0;

    .line 138
    .line 139
    iget-object v5, v5, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 140
    .line 141
    invoke-static {v5, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    .line 143
    .line 144
    :goto_3
    iget-object p1, p0, La6/n;->b:Lw5/c0;

    .line 145
    .line 146
    iget-object p2, p1, Lw5/c0;->a:Lw5/a;

    .line 147
    .line 148
    iget-object p2, p2, Lw5/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 149
    .line 150
    if-eqz p2, :cond_7

    .line 151
    .line 152
    iget-object p1, p1, Lw5/c0;->b:Ljava/net/Proxy;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 159
    .line 160
    if-ne p1, p2, :cond_7

    .line 161
    .line 162
    iget-object p1, p0, La6/n;->c:Ljava/net/Socket;

    .line 163
    .line 164
    if-eqz p1, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    new-instance p1, La6/q;

    .line 168
    .line 169
    new-instance p2, Ljava/net/ProtocolException;

    .line 170
    .line 171
    const-string p3, "Too many tunnel connections attempted: 21"

    .line 172
    .line 173
    invoke-direct {p2, p3}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {p1, p2}, La6/q;-><init>(Ljava/io/IOException;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_7
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 181
    .line 182
    .line 183
    move-result-wide p1

    .line 184
    iput-wide p1, p0, La6/n;->q:J

    .line 185
    .line 186
    return-void

    .line 187
    :goto_5
    iget-object v6, p0, La6/n;->d:Ljava/net/Socket;

    .line 188
    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    invoke-static {v6}, Lx5/b;->d(Ljava/net/Socket;)V

    .line 192
    .line 193
    .line 194
    :cond_8
    iget-object v6, p0, La6/n;->c:Ljava/net/Socket;

    .line 195
    .line 196
    if-eqz v6, :cond_9

    .line 197
    .line 198
    invoke-static {v6}, Lx5/b;->d(Ljava/net/Socket;)V

    .line 199
    .line 200
    .line 201
    :cond_9
    iput-object v1, p0, La6/n;->d:Ljava/net/Socket;

    .line 202
    .line 203
    iput-object v1, p0, La6/n;->c:Ljava/net/Socket;

    .line 204
    .line 205
    iput-object v1, p0, La6/n;->h:Lj6/c0;

    .line 206
    .line 207
    iput-object v1, p0, La6/n;->i:Lj6/b0;

    .line 208
    .line 209
    iput-object v1, p0, La6/n;->e:Lw5/m;

    .line 210
    .line 211
    iput-object v1, p0, La6/n;->f:Lw5/v;

    .line 212
    .line 213
    iput-object v1, p0, La6/n;->g:Ld6/o;

    .line 214
    .line 215
    iput v4, p0, La6/n;->o:I

    .line 216
    .line 217
    iget-object v6, p0, La6/n;->b:Lw5/c0;

    .line 218
    .line 219
    iget-object v6, v6, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 220
    .line 221
    invoke-static {v6, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    if-nez v3, :cond_a

    .line 225
    .line 226
    new-instance v3, La6/q;

    .line 227
    .line 228
    invoke-direct {v3, v5}, La6/q;-><init>(Ljava/io/IOException;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_a
    iget-object v6, v3, La6/q;->h:Ljava/io/IOException;

    .line 233
    .line 234
    invoke-static {v6, v5}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    iput-object v5, v3, La6/q;->i:Ljava/io/IOException;

    .line 238
    .line 239
    :goto_6
    if-eqz p4, :cond_c

    .line 240
    .line 241
    iput-boolean v4, v2, La6/b;->d:Z

    .line 242
    .line 243
    iget-boolean v4, v2, La6/b;->c:Z

    .line 244
    .line 245
    if-eqz v4, :cond_c

    .line 246
    .line 247
    instance-of v4, v5, Ljava/net/ProtocolException;

    .line 248
    .line 249
    if-nez v4, :cond_c

    .line 250
    .line 251
    instance-of v4, v5, Ljava/io/InterruptedIOException;

    .line 252
    .line 253
    if-nez v4, :cond_c

    .line 254
    .line 255
    instance-of v4, v5, Ljavax/net/ssl/SSLHandshakeException;

    .line 256
    .line 257
    if-eqz v4, :cond_b

    .line 258
    .line 259
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    instance-of v4, v4, Ljava/security/cert/CertificateException;

    .line 264
    .line 265
    if-nez v4, :cond_c

    .line 266
    .line 267
    :cond_b
    instance-of v4, v5, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 268
    .line 269
    if-nez v4, :cond_c

    .line 270
    .line 271
    instance-of v4, v5, Ljavax/net/ssl/SSLException;

    .line 272
    .line 273
    if-eqz v4, :cond_c

    .line 274
    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :cond_c
    throw v3

    .line 278
    :cond_d
    new-instance p1, La6/q;

    .line 279
    .line 280
    new-instance p2, Ljava/net/UnknownServiceException;

    .line 281
    .line 282
    const-string p3, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 283
    .line 284
    invoke-direct {p2, p3}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {p1, p2}, La6/q;-><init>(Ljava/io/IOException;)V

    .line 288
    .line 289
    .line 290
    throw p1

    .line 291
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    const-string p2, "already connected"

    .line 294
    .line 295
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw p1
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
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
.end method

.method public final e(IILa6/j;)V
    .locals 3

    .line 1
    iget-object p3, p0, La6/n;->b:Lw5/c0;

    .line 2
    .line 3
    iget-object v0, p3, Lw5/c0;->b:Ljava/net/Proxy;

    .line 4
    .line 5
    iget-object p3, p3, Lw5/c0;->a:Lw5/a;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v2, La6/k;->a:[I

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    aget v1, v2, v1

    .line 22
    .line 23
    :goto_0
    const/4 v2, 0x1

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/net/Socket;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p3, p3, Lw5/a;->b:Ljavax/net/SocketFactory;

    .line 36
    .line 37
    invoke-virtual {p3}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-static {p3}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    iput-object p3, p0, La6/n;->c:Ljava/net/Socket;

    .line 45
    .line 46
    iget-object v0, p0, La6/n;->b:Lw5/c0;

    .line 47
    .line 48
    iget-object v0, v0, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    const-string v1, "inetSocketAddress"

    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    sget-object p2, Le6/n;->a:Le6/n;

    .line 59
    .line 60
    sget-object p2, Le6/n;->a:Le6/n;

    .line 61
    .line 62
    iget-object v0, p0, La6/n;->b:Lw5/c0;

    .line 63
    .line 64
    iget-object v0, v0, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 65
    .line 66
    invoke-virtual {p2, p3, v0, p1}, Le6/n;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 67
    .line 68
    .line 69
    :try_start_1
    invoke-static {p3}, Le6/l;->G(Ljava/net/Socket;)Lj6/d;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, La6/n;->h:Lj6/c0;

    .line 78
    .line 79
    invoke-static {p3}, Le6/l;->E(Ljava/net/Socket;)Lj6/c;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Le6/l;->c(Lj6/g0;)Lj6/b0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, La6/n;->i:Lj6/b0;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 88
    .line 89
    return-void

    .line 90
    :catch_0
    move-exception p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    const-string p3, "throw with null exception"

    .line 96
    .line 97
    invoke-static {p2, p3}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_2

    .line 102
    .line 103
    return-void

    .line 104
    :cond_2
    new-instance p2, Ljava/io/IOException;

    .line 105
    .line 106
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw p2

    .line 110
    :catch_1
    move-exception p1

    .line 111
    new-instance p2, Ljava/net/ConnectException;

    .line 112
    .line 113
    new-instance p3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v0, "Failed to connect to "

    .line 116
    .line 117
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, La6/n;->b:Lw5/c0;

    .line 121
    .line 122
    iget-object v0, v0, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 123
    .line 124
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 135
    .line 136
    .line 137
    throw p2
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

.method public final f(IIILa6/j;)V
    .locals 9

    .line 1
    new-instance v0, Landroidx/lifecycle/a1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/a1;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La6/n;->b:Lw5/c0;

    .line 7
    .line 8
    iget-object v2, v1, Lw5/c0;->a:Lw5/a;

    .line 9
    .line 10
    iget-object v2, v2, Lw5/a;->h:Lw5/p;

    .line 11
    .line 12
    const-string v3, "url"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, v0, Landroidx/lifecycle/a1;->i:Ljava/lang/Object;

    .line 18
    .line 19
    const-string v2, "CONNECT"

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v2, v3}, Landroidx/lifecycle/a1;->i(Ljava/lang/String;Lw5/x;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, v1, Lw5/c0;->a:Lw5/a;

    .line 26
    .line 27
    iget-object v2, v1, Lw5/a;->h:Lw5/p;

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    invoke-static {v2, v4}, Lx5/b;->u(Lw5/p;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v5, "Host"

    .line 35
    .line 36
    invoke-virtual {v0, v5, v2}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v2, "Proxy-Connection"

    .line 40
    .line 41
    const-string v5, "Keep-Alive"

    .line 42
    .line 43
    invoke-virtual {v0, v2, v5}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v2, "User-Agent"

    .line 47
    .line 48
    const-string v5, "okhttp/4.12.0"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v5}, Landroidx/lifecycle/a1;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/lifecycle/a1;->c()Landroidx/appcompat/widget/a0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v2, Lp3/j;

    .line 58
    .line 59
    invoke-direct {v2}, Lp3/j;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v5, "Proxy-Authenticate"

    .line 63
    .line 64
    invoke-static {v5}, Lq3/a;->l(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v6, "OkHttp-Preemptive"

    .line 68
    .line 69
    invoke-static {v6, v5}, Lq3/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v5}, Lp3/j;->f(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v5, v6}, Lp3/j;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lp3/j;->e()Lw5/n;

    .line 79
    .line 80
    .line 81
    iget-object v2, v1, Lw5/a;->f:Lw5/b;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lw5/p;

    .line 89
    .line 90
    invoke-virtual {p0, p1, p2, p4}, La6/n;->e(IILa6/j;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string p4, "CONNECT "

    .line 96
    .line 97
    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v4}, Lx5/b;->u(Lw5/p;Z)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p4, " HTTP/1.1"

    .line 108
    .line 109
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object p4, p0, La6/n;->h:Lj6/c0;

    .line 117
    .line 118
    invoke-static {p4}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v2, p0, La6/n;->i:Lj6/b0;

    .line 122
    .line 123
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    new-instance v4, Lc6/g;

    .line 127
    .line 128
    invoke-direct {v4, v3, p0, p4, v2}, Lc6/g;-><init>(Lw5/u;La6/n;Lj6/c0;Lj6/b0;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, p4, Lj6/c0;->h:Lj6/i0;

    .line 132
    .line 133
    invoke-interface {v3}, Lj6/i0;->h()Lj6/k0;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    int-to-long v5, p2

    .line 138
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 139
    .line 140
    invoke-virtual {v3, v5, v6}, Lj6/k0;->g(J)Lj6/k0;

    .line 141
    .line 142
    .line 143
    iget-object p2, v2, Lj6/b0;->h:Lj6/g0;

    .line 144
    .line 145
    invoke-interface {p2}, Lj6/g0;->h()Lj6/k0;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    int-to-long v5, p3

    .line 150
    invoke-virtual {p2, v5, v6}, Lj6/k0;->g(J)Lj6/k0;

    .line 151
    .line 152
    .line 153
    iget-object p2, v0, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p2, Lw5/n;

    .line 156
    .line 157
    invoke-virtual {v4, p2, p1}, Lc6/g;->j(Lw5/n;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4}, Lc6/g;->c()V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    invoke-virtual {v4, p1}, Lc6/g;->f(Z)Lw5/y;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iput-object v0, p1, Lw5/y;->a:Landroidx/appcompat/widget/a0;

    .line 172
    .line 173
    invoke-virtual {p1}, Lw5/y;->a()Lw5/z;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget p2, p1, Lw5/z;->k:I

    .line 178
    .line 179
    invoke-static {p1}, Lx5/b;->i(Lw5/z;)J

    .line 180
    .line 181
    .line 182
    move-result-wide v5

    .line 183
    const-wide/16 v7, -0x1

    .line 184
    .line 185
    cmp-long p1, v5, v7

    .line 186
    .line 187
    if-nez p1, :cond_0

    .line 188
    .line 189
    goto :goto_0

    .line 190
    :cond_0
    invoke-virtual {v4, v5, v6}, Lc6/g;->i(J)Lc6/d;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const p3, 0x7fffffff

    .line 195
    .line 196
    .line 197
    invoke-static {p1, p3}, Lx5/b;->s(Lj6/i0;I)Z

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Lc6/d;->close()V

    .line 201
    .line 202
    .line 203
    :goto_0
    const/16 p1, 0xc8

    .line 204
    .line 205
    if-eq p2, p1, :cond_2

    .line 206
    .line 207
    const/16 p1, 0x197

    .line 208
    .line 209
    if-ne p2, p1, :cond_1

    .line 210
    .line 211
    iget-object p1, v1, Lw5/a;->f:Lw5/b;

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance p1, Ljava/io/IOException;

    .line 217
    .line 218
    const-string p2, "Failed to authenticate with proxy"

    .line 219
    .line 220
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw p1

    .line 224
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 225
    .line 226
    const-string p3, "Unexpected response code for CONNECT: "

    .line 227
    .line 228
    invoke-static {p2, p3}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw p1

    .line 236
    :cond_2
    iget-object p1, p4, Lj6/c0;->i:Lj6/i;

    .line 237
    .line 238
    invoke-virtual {p1}, Lj6/i;->u()Z

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-eqz p1, :cond_3

    .line 243
    .line 244
    iget-object p1, v2, Lj6/b0;->i:Lj6/i;

    .line 245
    .line 246
    invoke-virtual {p1}, Lj6/i;->u()Z

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-eqz p1, :cond_3

    .line 251
    .line 252
    return-void

    .line 253
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 254
    .line 255
    const-string p2, "TLS tunnel buffered too many bytes!"

    .line 256
    .line 257
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw p1
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

.method public final g(La6/b;La6/j;)V
    .locals 11

    .line 1
    sget-object p2, Lw5/v;->j:Lw5/v;

    .line 2
    .line 3
    iget-object v0, p0, La6/n;->b:Lw5/c0;

    .line 4
    .line 5
    iget-object v0, v0, Lw5/c0;->a:Lw5/a;

    .line 6
    .line 7
    iget-object v1, v0, Lw5/a;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object p1, v0, Lw5/a;->i:Ljava/util/List;

    .line 12
    .line 13
    sget-object v0, Lw5/v;->m:Lw5/v;

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, La6/n;->c:Ljava/net/Socket;

    .line 22
    .line 23
    iput-object p1, p0, La6/n;->d:Ljava/net/Socket;

    .line 24
    .line 25
    iput-object v0, p0, La6/n;->f:Lw5/v;

    .line 26
    .line 27
    invoke-virtual {p0}, La6/n;->m()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, La6/n;->c:Ljava/net/Socket;

    .line 32
    .line 33
    iput-object p1, p0, La6/n;->d:Ljava/net/Socket;

    .line 34
    .line 35
    iput-object p2, p0, La6/n;->f:Lw5/v;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string v2, "Hostname "

    .line 39
    .line 40
    const-string v3, "\n              |Hostname "

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, p0, La6/n;->c:Ljava/net/Socket;

    .line 47
    .line 48
    iget-object v6, v0, Lw5/a;->h:Lw5/p;

    .line 49
    .line 50
    iget-object v7, v6, Lw5/p;->d:Ljava/lang/String;

    .line 51
    .line 52
    iget v6, v6, Lw5/p;->e:I

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    invoke-virtual {v1, v5, v7, v6, v8}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v5, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    .line 60
    .line 61
    invoke-static {v1, v5}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    :try_start_1
    invoke-virtual {p1, v1}, La6/b;->a(Ljavax/net/ssl/SSLSocket;)Lw5/j;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-boolean v5, p1, Lw5/j;->b:Z

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    sget-object v5, Le6/n;->a:Le6/n;

    .line 75
    .line 76
    sget-object v5, Le6/n;->a:Le6/n;

    .line 77
    .line 78
    iget-object v6, v0, Lw5/a;->h:Lw5/p;

    .line 79
    .line 80
    iget-object v6, v6, Lw5/p;->d:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v7, v0, Lw5/a;->i:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {v5, v1, v6, v7}, Le6/n;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    move-object v4, v1

    .line 90
    goto/16 :goto_1

    .line 91
    .line 92
    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const-string v6, "sslSocketSession"

    .line 100
    .line 101
    invoke-static {v5, v6}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v5}, Le6/l;->p(Ljavax/net/ssl/SSLSession;)Lw5/m;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iget-object v7, v0, Lw5/a;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 109
    .line 110
    invoke-static {v7}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v8, v0, Lw5/a;->h:Lw5/p;

    .line 114
    .line 115
    iget-object v8, v8, Lw5/p;->d:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v7, v8, v5}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    const/4 v7, 0x0

    .line 122
    if-nez v5, :cond_4

    .line 123
    .line 124
    invoke-virtual {v6}, Lw5/m;->a()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-nez p2, :cond_3

    .line 133
    .line 134
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 139
    .line 140
    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 144
    .line 145
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 146
    .line 147
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v0, Lw5/a;->h:Lw5/p;

    .line 153
    .line 154
    iget-object v0, v0, Lw5/p;->d:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string v0, " not verified:\n              |    certificate: "

    .line 160
    .line 161
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    sget-object v0, Lw5/f;->c:Lw5/f;

    .line 165
    .line 166
    invoke-static {p1}, La/a;->P(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, "\n              |    DN: "

    .line 174
    .line 175
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v0, "\n              |    subjectAltNames: "

    .line 190
    .line 191
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const/4 v0, 0x7

    .line 195
    invoke-static {p1, v0}, Li6/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const/4 v3, 0x2

    .line 200
    invoke-static {p1, v3}, Li6/c;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {v0, p1}, Lq4/i;->z0(Ljava/util/List;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string p1, "\n              "

    .line 212
    .line 213
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p1}, Ll5/f;->b0(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw p2

    .line 228
    :cond_3
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 229
    .line 230
    new-instance p2, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v0, Lw5/a;->h:Lw5/p;

    .line 236
    .line 237
    iget-object v0, v0, Lw5/p;->d:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v0, " not verified (no certificates)"

    .line 243
    .line 244
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw p1

    .line 255
    :cond_4
    iget-object v2, v0, Lw5/a;->e:Lw5/f;

    .line 256
    .line 257
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    new-instance v3, Lw5/m;

    .line 261
    .line 262
    iget-object v5, v6, Lw5/m;->a:Lw5/d0;

    .line 263
    .line 264
    iget-object v8, v6, Lw5/m;->b:Lw5/h;

    .line 265
    .line 266
    iget-object v9, v6, Lw5/m;->c:Ljava/util/List;

    .line 267
    .line 268
    new-instance v10, La6/l;

    .line 269
    .line 270
    invoke-direct {v10, v2, v6, v0, v7}, La6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 271
    .line 272
    .line 273
    invoke-direct {v3, v5, v8, v9, v10}, Lw5/m;-><init>(Lw5/d0;Lw5/h;Ljava/util/List;Ld5/a;)V

    .line 274
    .line 275
    .line 276
    iput-object v3, p0, La6/n;->e:Lw5/m;

    .line 277
    .line 278
    iget-object v0, v0, Lw5/a;->h:Lw5/p;

    .line 279
    .line 280
    iget-object v0, v0, Lw5/p;->d:Ljava/lang/String;

    .line 281
    .line 282
    new-instance v3, La6/m;

    .line 283
    .line 284
    invoke-direct {v3, v7, p0}, La6/m;-><init>(ILjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v0, v3}, Lw5/f;->a(Ljava/lang/String;Ld5/a;)V

    .line 288
    .line 289
    .line 290
    iget-boolean p1, p1, Lw5/j;->b:Z

    .line 291
    .line 292
    if-eqz p1, :cond_5

    .line 293
    .line 294
    sget-object p1, Le6/n;->a:Le6/n;

    .line 295
    .line 296
    sget-object p1, Le6/n;->a:Le6/n;

    .line 297
    .line 298
    invoke-virtual {p1, v1}, Le6/n;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    :cond_5
    iput-object v1, p0, La6/n;->d:Ljava/net/Socket;

    .line 303
    .line 304
    invoke-static {v1}, Le6/l;->G(Ljava/net/Socket;)Lj6/d;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-static {p1}, Le6/l;->d(Lj6/i0;)Lj6/c0;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iput-object p1, p0, La6/n;->h:Lj6/c0;

    .line 313
    .line 314
    invoke-static {v1}, Le6/l;->E(Ljava/net/Socket;)Lj6/c;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-static {p1}, Le6/l;->c(Lj6/g0;)Lj6/b0;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    iput-object p1, p0, La6/n;->i:Lj6/b0;

    .line 323
    .line 324
    if-eqz v4, :cond_6

    .line 325
    .line 326
    invoke-static {v4}, Le6/d;->l(Ljava/lang/String;)Lw5/v;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    :cond_6
    iput-object p2, p0, La6/n;->f:Lw5/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 331
    .line 332
    sget-object p1, Le6/n;->a:Le6/n;

    .line 333
    .line 334
    sget-object p1, Le6/n;->a:Le6/n;

    .line 335
    .line 336
    invoke-virtual {p1, v1}, Le6/n;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 337
    .line 338
    .line 339
    iget-object p1, p0, La6/n;->f:Lw5/v;

    .line 340
    .line 341
    sget-object p2, Lw5/v;->l:Lw5/v;

    .line 342
    .line 343
    if-ne p1, p2, :cond_7

    .line 344
    .line 345
    invoke-virtual {p0}, La6/n;->m()V

    .line 346
    .line 347
    .line 348
    :cond_7
    return-void

    .line 349
    :catchall_1
    move-exception p1

    .line 350
    :goto_1
    if-eqz v4, :cond_8

    .line 351
    .line 352
    sget-object p2, Le6/n;->a:Le6/n;

    .line 353
    .line 354
    sget-object p2, Le6/n;->a:Le6/n;

    .line 355
    .line 356
    invoke-virtual {p2, v4}, Le6/n;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 357
    .line 358
    .line 359
    :cond_8
    if-eqz v4, :cond_9

    .line 360
    .line 361
    invoke-static {v4}, Lx5/b;->d(Ljava/net/Socket;)V

    .line 362
    .line 363
    .line 364
    :cond_9
    throw p1
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

.method public final declared-synchronized h()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, La6/n;->m:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, La6/n;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
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

.method public final i(Lw5/a;Ljava/util/List;)Z
    .locals 9

    .line 1
    iget-object v0, p1, Lw5/a;->h:Lw5/p;

    .line 2
    .line 3
    sget-object v1, Lx5/b;->a:[B

    .line 4
    .line 5
    iget-object v1, p0, La6/n;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, p0, La6/n;->o:I

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-ge v1, v2, :cond_9

    .line 15
    .line 16
    iget-boolean v1, p0, La6/n;->j:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, La6/n;->b:Lw5/c0;

    .line 23
    .line 24
    iget-object v2, v1, Lw5/c0;->a:Lw5/a;

    .line 25
    .line 26
    iget-object v4, v1, Lw5/c0;->a:Lw5/a;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Lw5/a;->a(Lw5/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto/16 :goto_1

    .line 35
    .line 36
    :cond_1
    iget-object v2, v0, Lw5/p;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v5, v0, Lw5/p;->d:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v6, v4, Lw5/a;->h:Lw5/p;

    .line 41
    .line 42
    iget-object v6, v6, Lw5/p;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v6}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v6, 0x1

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    return v6

    .line 52
    :cond_2
    iget-object v2, p0, La6/n;->g:Ld6/o;

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_3
    if-eqz p2, :cond_9

    .line 59
    .line 60
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    goto/16 :goto_1

    .line 67
    .line 68
    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_9

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lw5/c0;

    .line 83
    .line 84
    iget-object v7, v2, Lw5/c0;->b:Ljava/net/Proxy;

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    sget-object v8, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 91
    .line 92
    if-ne v7, v8, :cond_5

    .line 93
    .line 94
    iget-object v7, v1, Lw5/c0;->b:Ljava/net/Proxy;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    if-ne v7, v8, :cond_5

    .line 101
    .line 102
    iget-object v7, v1, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 103
    .line 104
    iget-object v2, v2, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 105
    .line 106
    invoke-static {v7, v2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_5

    .line 111
    .line 112
    iget-object p2, p1, Lw5/a;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 113
    .line 114
    sget-object v1, Li6/c;->a:Li6/c;

    .line 115
    .line 116
    if-eq p2, v1, :cond_6

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_6
    sget-object p2, Lx5/b;->a:[B

    .line 120
    .line 121
    iget-object p2, v4, Lw5/a;->h:Lw5/p;

    .line 122
    .line 123
    iget v0, v0, Lw5/p;->e:I

    .line 124
    .line 125
    iget v1, p2, Lw5/p;->e:I

    .line 126
    .line 127
    if-eq v0, v1, :cond_7

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_7
    iget-object p2, p2, Lw5/p;->d:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v5, p2}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_8
    iget-boolean p2, p0, La6/n;->k:Z

    .line 140
    .line 141
    if-nez p2, :cond_9

    .line 142
    .line 143
    iget-object p2, p0, La6/n;->e:Lw5/m;

    .line 144
    .line 145
    if-eqz p2, :cond_9

    .line 146
    .line 147
    invoke-virtual {p2}, Lw5/m;->a()Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_9

    .line 156
    .line 157
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    const-string v0, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 162
    .line 163
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    check-cast p2, Ljava/security/cert/X509Certificate;

    .line 167
    .line 168
    invoke-static {v5, p2}, Li6/c;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 169
    .line 170
    .line 171
    move-result p2

    .line 172
    if-eqz p2, :cond_9

    .line 173
    .line 174
    :goto_0
    :try_start_0
    iget-object p1, p1, Lw5/a;->e:Lw5/f;

    .line 175
    .line 176
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object p2, p0, La6/n;->e:Lw5/m;

    .line 180
    .line 181
    invoke-static {p2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2}, Lw5/m;->a()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    const-string v0, "hostname"

    .line 189
    .line 190
    invoke-static {v5, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const-string v0, "peerCertificates"

    .line 194
    .line 195
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    new-instance v0, La6/l;

    .line 199
    .line 200
    const/4 v1, 0x3

    .line 201
    invoke-direct {v0, p1, p2, v5, v1}, La6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, v5, v0}, Lw5/f;->a(Ljava/lang/String;Ld5/a;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    .line 206
    .line 207
    return v6

    .line 208
    :catch_0
    :cond_9
    :goto_1
    return v3
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

.method public final j(Z)Z
    .locals 9

    .line 1
    sget-object v0, Lx5/b;->a:[B

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, La6/n;->c:Ljava/net/Socket;

    .line 8
    .line 9
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, La6/n;->d:Ljava/net/Socket;

    .line 13
    .line 14
    invoke-static {v3}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, La6/n;->h:Lj6/c0;

    .line 18
    .line 19
    invoke-static {v4}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v5, 0x0

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v2, p0, La6/n;->g:Ld6/o;

    .line 49
    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, v0, v1}, Ld6/o;->c(J)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    return p1

    .line 57
    :cond_1
    monitor-enter p0

    .line 58
    :try_start_0
    iget-wide v6, p0, La6/n;->q:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    .line 60
    sub-long/2addr v0, v6

    .line 61
    monitor-exit p0

    .line 62
    const-wide v6, 0x2540be400L

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    const/4 v2, 0x1

    .line 68
    cmp-long v8, v0, v6

    .line 69
    .line 70
    if-ltz v8, :cond_2

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    :try_start_1
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    .line 75
    .line 76
    .line 77
    move-result p1
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    :try_start_2
    invoke-virtual {v3, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Lj6/c0;->a()Z

    .line 82
    .line 83
    .line 84
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 85
    xor-int/2addr v0, v2

    .line 86
    :try_start_3
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 87
    .line 88
    .line 89
    return v0

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 92
    .line 93
    .line 94
    throw v0
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 95
    :catch_0
    const/4 v5, 0x1

    .line 96
    :catch_1
    return v5

    .line 97
    :cond_2
    return v2

    .line 98
    :catchall_1
    move-exception p1

    .line 99
    monitor-exit p0

    .line 100
    throw p1

    .line 101
    :cond_3
    :goto_0
    return v5
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

.method public final k(Lw5/u;Lb6/g;)Lb6/e;
    .locals 6

    .line 1
    iget v0, p2, Lb6/g;->g:I

    .line 2
    .line 3
    iget-object v1, p0, La6/n;->d:Ljava/net/Socket;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, La6/n;->h:Lj6/c0;

    .line 9
    .line 10
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, La6/n;->i:Lj6/b0;

    .line 14
    .line 15
    invoke-static {v3}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, p0, La6/n;->g:Ld6/o;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    new-instance v0, Ld6/p;

    .line 23
    .line 24
    invoke-direct {v0, p1, p0, p2, v4}, Ld6/p;-><init>(Lw5/u;La6/n;Lb6/g;Ld6/o;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    invoke-virtual {v1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v2, Lj6/c0;->h:Lj6/i0;

    .line 32
    .line 33
    invoke-interface {v1}, Lj6/i0;->h()Lj6/k0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    int-to-long v4, v0

    .line 38
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 39
    .line 40
    invoke-virtual {v1, v4, v5}, Lj6/k0;->g(J)Lj6/k0;

    .line 41
    .line 42
    .line 43
    iget-object v0, v3, Lj6/b0;->h:Lj6/g0;

    .line 44
    .line 45
    invoke-interface {v0}, Lj6/g0;->h()Lj6/k0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget p2, p2, Lb6/g;->h:I

    .line 50
    .line 51
    int-to-long v4, p2

    .line 52
    invoke-virtual {v0, v4, v5}, Lj6/k0;->g(J)Lj6/k0;

    .line 53
    .line 54
    .line 55
    new-instance p2, Lc6/g;

    .line 56
    .line 57
    invoke-direct {p2, p1, p0, v2, v3}, Lc6/g;-><init>(Lw5/u;La6/n;Lj6/c0;Lj6/b0;)V

    .line 58
    .line 59
    .line 60
    return-object p2
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

.method public final declared-synchronized l()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, La6/n;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0
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

.method public final m()V
    .locals 8

    .line 1
    iget-object v0, p0, La6/n;->d:Ljava/net/Socket;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La6/n;->h:Lj6/c0;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La6/n;->i:Lj6/b0;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Landroidx/appcompat/widget/a0;

    .line 21
    .line 22
    sget-object v5, Lz5/c;->i:Lz5/c;

    .line 23
    .line 24
    invoke-direct {v4, v5}, Landroidx/appcompat/widget/a0;-><init>(Lz5/c;)V

    .line 25
    .line 26
    .line 27
    iget-object v6, p0, La6/n;->b:Lw5/c0;

    .line 28
    .line 29
    iget-object v6, v6, Lw5/c0;->a:Lw5/a;

    .line 30
    .line 31
    iget-object v6, v6, Lw5/a;->h:Lw5/p;

    .line 32
    .line 33
    iget-object v6, v6, Lw5/p;->d:Ljava/lang/String;

    .line 34
    .line 35
    const-string v7, "peerName"

    .line 36
    .line 37
    invoke-static {v6, v7}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, v4, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    sget-object v7, Lx5/b;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const/16 v7, 0x20

    .line 53
    .line 54
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v6, "<set-?>"

    .line 65
    .line 66
    invoke-static {v0, v6}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, v4, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 70
    .line 71
    iput-object v1, v4, Landroidx/appcompat/widget/a0;->e:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v2, v4, Landroidx/appcompat/widget/a0;->f:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p0, v4, Landroidx/appcompat/widget/a0;->g:Ljava/lang/Object;

    .line 76
    .line 77
    new-instance v0, Ld6/o;

    .line 78
    .line 79
    invoke-direct {v0, v4}, Ld6/o;-><init>(Landroidx/appcompat/widget/a0;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La6/n;->g:Ld6/o;

    .line 83
    .line 84
    sget-object v1, Ld6/o;->G:Ld6/b0;

    .line 85
    .line 86
    iget v2, v1, Ld6/b0;->a:I

    .line 87
    .line 88
    and-int/lit8 v2, v2, 0x10

    .line 89
    .line 90
    if-eqz v2, :cond_0

    .line 91
    .line 92
    iget-object v1, v1, Ld6/b0;->b:[I

    .line 93
    .line 94
    const/4 v2, 0x4

    .line 95
    aget v1, v1, v2

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const v1, 0x7fffffff

    .line 99
    .line 100
    .line 101
    :goto_0
    iput v1, p0, La6/n;->o:I

    .line 102
    .line 103
    iget-object v1, v0, Ld6/o;->D:Ld6/x;

    .line 104
    .line 105
    const-string v2, ">> CONNECTION "

    .line 106
    .line 107
    monitor-enter v1

    .line 108
    :try_start_0
    iget-boolean v4, v1, Ld6/x;->k:Z

    .line 109
    .line 110
    if-nez v4, :cond_3

    .line 111
    .line 112
    sget-object v4, Ld6/x;->m:Ljava/util/logging/Logger;

    .line 113
    .line 114
    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 115
    .line 116
    invoke-virtual {v4, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_1

    .line 121
    .line 122
    new-instance v6, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sget-object v2, Ld6/f;->a:Lj6/l;

    .line 128
    .line 129
    invoke-virtual {v2}, Lj6/l;->g()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    new-array v6, v3, [Ljava/lang/Object;

    .line 141
    .line 142
    invoke-static {v2, v6}, Lx5/b;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v4, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catchall_0
    move-exception v0

    .line 151
    goto :goto_2

    .line 152
    :cond_1
    :goto_1
    iget-object v2, v1, Ld6/x;->h:Lj6/j;

    .line 153
    .line 154
    sget-object v4, Ld6/f;->a:Lj6/l;

    .line 155
    .line 156
    invoke-interface {v2, v4}, Lj6/j;->B(Lj6/l;)Lj6/j;

    .line 157
    .line 158
    .line 159
    iget-object v2, v1, Ld6/x;->h:Lj6/j;

    .line 160
    .line 161
    invoke-interface {v2}, Lj6/j;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    .line 163
    .line 164
    monitor-exit v1

    .line 165
    iget-object v1, v0, Ld6/o;->D:Ld6/x;

    .line 166
    .line 167
    iget-object v2, v0, Ld6/o;->w:Ld6/b0;

    .line 168
    .line 169
    invoke-virtual {v1, v2}, Ld6/x;->z(Ld6/b0;)V

    .line 170
    .line 171
    .line 172
    iget-object v1, v0, Ld6/o;->w:Ld6/b0;

    .line 173
    .line 174
    invoke-virtual {v1}, Ld6/b0;->a()I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    const v2, 0xffff

    .line 179
    .line 180
    .line 181
    if-eq v1, v2, :cond_2

    .line 182
    .line 183
    iget-object v4, v0, Ld6/o;->D:Ld6/x;

    .line 184
    .line 185
    sub-int/2addr v1, v2

    .line 186
    int-to-long v1, v1

    .line 187
    invoke-virtual {v4, v3, v1, v2}, Ld6/x;->E(IJ)V

    .line 188
    .line 189
    .line 190
    :cond_2
    invoke-virtual {v5}, Lz5/c;->e()Lz5/b;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iget-object v2, v0, Ld6/o;->j:Ljava/lang/String;

    .line 195
    .line 196
    iget-object v0, v0, Ld6/o;->E:Ld6/k;

    .line 197
    .line 198
    new-instance v3, La6/o;

    .line 199
    .line 200
    const/4 v4, 0x2

    .line 201
    invoke-direct {v3, v2, v0, v4}, La6/o;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 202
    .line 203
    .line 204
    const-wide/16 v4, 0x0

    .line 205
    .line 206
    invoke-virtual {v1, v3, v4, v5}, Lz5/b;->c(Lz5/a;J)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_3
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    .line 211
    .line 212
    const-string v2, "closed"

    .line 213
    .line 214
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v0

    .line 218
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    throw v0
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
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Connection{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La6/n;->b:Lw5/c0;

    .line 9
    .line 10
    iget-object v2, v1, Lw5/c0;->a:Lw5/a;

    .line 11
    .line 12
    iget-object v2, v2, Lw5/a;->h:Lw5/p;

    .line 13
    .line 14
    iget-object v2, v2, Lw5/p;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x3a

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lw5/c0;->a:Lw5/a;

    .line 25
    .line 26
    iget-object v2, v2, Lw5/a;->h:Lw5/p;

    .line 27
    .line 28
    iget v2, v2, Lw5/p;->e:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ", proxy="

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lw5/c0;->b:Ljava/net/Proxy;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " hostAddress="

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lw5/c0;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, " cipherSuite="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La6/n;->e:Lw5/m;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Lw5/m;->b:Lw5/h;

    .line 63
    .line 64
    if-nez v1, :cond_1

    .line 65
    .line 66
    :cond_0
    const-string v1, "none"

    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, " protocol="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La6/n;->f:Lw5/v;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 v1, 0x7d

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0
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
