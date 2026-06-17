.class public final Ld6/p;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lb6/e;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:La6/n;

.field public final b:Lb6/g;

.field public final c:Ld6/o;

.field public volatile d:Ld6/w;

.field public final e:Lw5/v;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, ":scheme"

    .line 2
    .line 3
    const-string v11, ":authority"

    .line 4
    .line 5
    const-string v0, "connection"

    .line 6
    .line 7
    const-string v1, "host"

    .line 8
    .line 9
    const-string v2, "keep-alive"

    .line 10
    .line 11
    const-string v3, "proxy-connection"

    .line 12
    .line 13
    const-string v4, "te"

    .line 14
    .line 15
    const-string v5, "transfer-encoding"

    .line 16
    .line 17
    const-string v6, "encoding"

    .line 18
    .line 19
    const-string v7, "upgrade"

    .line 20
    .line 21
    const-string v8, ":method"

    .line 22
    .line 23
    const-string v9, ":path"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lx5/b;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Ld6/p;->g:Ljava/util/List;

    .line 34
    .line 35
    const-string v7, "encoding"

    .line 36
    .line 37
    const-string v8, "upgrade"

    .line 38
    .line 39
    const-string v1, "connection"

    .line 40
    .line 41
    const-string v2, "host"

    .line 42
    .line 43
    const-string v3, "keep-alive"

    .line 44
    .line 45
    const-string v4, "proxy-connection"

    .line 46
    .line 47
    const-string v5, "te"

    .line 48
    .line 49
    const-string v6, "transfer-encoding"

    .line 50
    .line 51
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lx5/b;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Ld6/p;->h:Ljava/util/List;

    .line 60
    .line 61
    return-void
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

.method public constructor <init>(Lw5/u;La6/n;Lb6/g;Ld6/o;)V
    .locals 1

    .line 1
    const-string v0, "http2Connection"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Ld6/p;->a:La6/n;

    .line 10
    .line 11
    iput-object p3, p0, Ld6/p;->b:Lb6/g;

    .line 12
    .line 13
    iput-object p4, p0, Ld6/p;->c:Ld6/o;

    .line 14
    .line 15
    iget-object p1, p1, Lw5/u;->y:Ljava/util/List;

    .line 16
    .line 17
    sget-object p2, Lw5/v;->m:Lw5/v;

    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p2, Lw5/v;->l:Lw5/v;

    .line 27
    .line 28
    :goto_0
    iput-object p2, p0, Ld6/p;->e:Lw5/v;

    .line 29
    .line 30
    return-void
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
.end method


# virtual methods
.method public final a(Lw5/z;)J
    .locals 2

    .line 1
    invoke-static {p1}, Lb6/f;->a(Lw5/z;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-static {p1}, Lx5/b;->i(Lw5/z;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
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

.method public final b(Landroidx/appcompat/widget/a0;J)Lj6/g0;
    .locals 0

    .line 1
    const-string p2, "request"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld6/p;->d:Ld6/w;

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ld6/w;->g()Ld6/t;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
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

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/p;->d:Ld6/w;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ld6/w;->g()Ld6/t;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ld6/t;->close()V

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

.method public final cancel()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ld6/p;->f:Z

    .line 3
    .line 4
    iget-object v0, p0, Ld6/p;->d:Ld6/w;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/16 v1, 0x9

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ld6/w;->e(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
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

.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/p;->c:Ld6/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld6/o;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final e(Landroidx/appcompat/widget/a0;)V
    .locals 14

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld6/p;->d:Ld6/w;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p1, Landroidx/appcompat/widget/a0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lw5/x;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object v3, p1, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lw5/n;

    .line 25
    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v3}, Lw5/n;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    add-int/lit8 v5, v5, 0x4

    .line 33
    .line 34
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Ld6/b;

    .line 38
    .line 39
    sget-object v6, Ld6/b;->f:Lj6/l;

    .line 40
    .line 41
    iget-object v7, p1, Landroidx/appcompat/widget/a0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {v5, v6, v7}, Ld6/b;-><init>(Lj6/l;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    new-instance v5, Ld6/b;

    .line 52
    .line 53
    sget-object v6, Ld6/b;->g:Lj6/l;

    .line 54
    .line 55
    iget-object v7, p1, Landroidx/appcompat/widget/a0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, Lw5/p;

    .line 58
    .line 59
    const-string v8, "url"

    .line 60
    .line 61
    invoke-static {v7, v8}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Lw5/p;->b()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v7}, Lw5/p;->d()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    if-eqz v9, :cond_2

    .line 73
    .line 74
    new-instance v10, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v8, 0x3f

    .line 83
    .line 84
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    :cond_2
    invoke-direct {v5, v6, v8}, Ld6/b;-><init>(Lj6/l;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    const-string v5, "Host"

    .line 101
    .line 102
    iget-object p1, p1, Landroidx/appcompat/widget/a0;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lw5/n;

    .line 105
    .line 106
    invoke-virtual {p1, v5}, Lw5/n;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-eqz p1, :cond_3

    .line 111
    .line 112
    new-instance v5, Ld6/b;

    .line 113
    .line 114
    sget-object v6, Ld6/b;->i:Lj6/l;

    .line 115
    .line 116
    invoke-direct {v5, v6, p1}, Ld6/b;-><init>(Lj6/l;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_3
    new-instance p1, Ld6/b;

    .line 123
    .line 124
    sget-object v5, Ld6/b;->h:Lj6/l;

    .line 125
    .line 126
    iget-object v6, v7, Lw5/p;->a:Ljava/lang/String;

    .line 127
    .line 128
    invoke-direct {p1, v5, v6}, Ld6/b;-><init>(Lj6/l;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Lw5/n;->size()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    const/4 v5, 0x0

    .line 139
    :goto_1
    if-ge v5, p1, :cond_6

    .line 140
    .line 141
    invoke-virtual {v3, v5}, Lw5/n;->g(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 146
    .line 147
    const-string v8, "US"

    .line 148
    .line 149
    invoke-static {v7, v8}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    const-string v7, "this as java.lang.String).toLowerCase(locale)"

    .line 157
    .line 158
    invoke-static {v6, v7}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    sget-object v7, Ld6/p;->g:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_4

    .line 168
    .line 169
    const-string v7, "te"

    .line 170
    .line 171
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-eqz v7, :cond_5

    .line 176
    .line 177
    invoke-virtual {v3, v5}, Lw5/n;->i(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    const-string v8, "trailers"

    .line 182
    .line 183
    invoke-static {v7, v8}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-eqz v7, :cond_5

    .line 188
    .line 189
    :cond_4
    new-instance v7, Ld6/b;

    .line 190
    .line 191
    invoke-virtual {v3, v5}, Lw5/n;->i(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    invoke-direct {v7, v6, v8}, Ld6/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_6
    iget-object v8, p0, Ld6/p;->c:Ld6/o;

    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    xor-int/lit8 v9, v0, 0x1

    .line 210
    .line 211
    iget-object p1, v8, Ld6/o;->D:Ld6/x;

    .line 212
    .line 213
    monitor-enter p1

    .line 214
    :try_start_0
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 215
    :try_start_1
    iget v3, v8, Ld6/o;->l:I

    .line 216
    .line 217
    const v5, 0x3fffffff    # 1.9999999f

    .line 218
    .line 219
    .line 220
    if-le v3, v5, :cond_7

    .line 221
    .line 222
    const/16 v3, 0x8

    .line 223
    .line 224
    invoke-virtual {v8, v3}, Ld6/o;->m(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :catchall_0
    move-exception v0

    .line 229
    goto/16 :goto_3

    .line 230
    .line 231
    :cond_7
    :goto_2
    iget-boolean v3, v8, Ld6/o;->m:Z

    .line 232
    .line 233
    if-nez v3, :cond_d

    .line 234
    .line 235
    iget v7, v8, Ld6/o;->l:I

    .line 236
    .line 237
    add-int/lit8 v3, v7, 0x2

    .line 238
    .line 239
    iput v3, v8, Ld6/o;->l:I

    .line 240
    .line 241
    new-instance v6, Ld6/w;

    .line 242
    .line 243
    const/4 v11, 0x0

    .line 244
    const/4 v10, 0x0

    .line 245
    invoke-direct/range {v6 .. v11}, Ld6/w;-><init>(ILd6/o;ZZLw5/n;)V

    .line 246
    .line 247
    .line 248
    if-eqz v0, :cond_8

    .line 249
    .line 250
    iget-wide v10, v8, Ld6/o;->A:J

    .line 251
    .line 252
    iget-wide v12, v8, Ld6/o;->B:J

    .line 253
    .line 254
    cmp-long v0, v10, v12

    .line 255
    .line 256
    if-gez v0, :cond_8

    .line 257
    .line 258
    iget-wide v10, v6, Ld6/w;->e:J

    .line 259
    .line 260
    iget-wide v12, v6, Ld6/w;->f:J

    .line 261
    .line 262
    cmp-long v0, v10, v12

    .line 263
    .line 264
    if-ltz v0, :cond_9

    .line 265
    .line 266
    :cond_8
    const/4 v1, 0x1

    .line 267
    :cond_9
    invoke-virtual {v6}, Ld6/w;->i()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eqz v0, :cond_a

    .line 272
    .line 273
    iget-object v0, v8, Ld6/o;->i:Ljava/util/LinkedHashMap;

    .line 274
    .line 275
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 280
    .line 281
    .line 282
    :cond_a
    :try_start_2
    monitor-exit v8

    .line 283
    iget-object v0, v8, Ld6/o;->D:Ld6/x;

    .line 284
    .line 285
    invoke-virtual {v0, v9, v7, v4}, Ld6/x;->m(ZILjava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 286
    .line 287
    .line 288
    monitor-exit p1

    .line 289
    if-eqz v1, :cond_b

    .line 290
    .line 291
    iget-object p1, v8, Ld6/o;->D:Ld6/x;

    .line 292
    .line 293
    invoke-virtual {p1}, Ld6/x;->flush()V

    .line 294
    .line 295
    .line 296
    :cond_b
    iput-object v6, p0, Ld6/p;->d:Ld6/w;

    .line 297
    .line 298
    iget-boolean p1, p0, Ld6/p;->f:Z

    .line 299
    .line 300
    if-nez p1, :cond_c

    .line 301
    .line 302
    iget-object p1, p0, Ld6/p;->d:Ld6/w;

    .line 303
    .line 304
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    iget-object p1, p1, Ld6/w;->k:Ld6/v;

    .line 308
    .line 309
    iget-object v0, p0, Ld6/p;->b:Lb6/g;

    .line 310
    .line 311
    iget v0, v0, Lb6/g;->g:I

    .line 312
    .line 313
    int-to-long v0, v0

    .line 314
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 315
    .line 316
    invoke-virtual {p1, v0, v1}, Lj6/k0;->g(J)Lj6/k0;

    .line 317
    .line 318
    .line 319
    iget-object p1, p0, Ld6/p;->d:Ld6/w;

    .line 320
    .line 321
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    iget-object p1, p1, Ld6/w;->l:Ld6/v;

    .line 325
    .line 326
    iget-object v0, p0, Ld6/p;->b:Lb6/g;

    .line 327
    .line 328
    iget v0, v0, Lb6/g;->h:I

    .line 329
    .line 330
    int-to-long v0, v0

    .line 331
    invoke-virtual {p1, v0, v1}, Lj6/k0;->g(J)Lj6/k0;

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_c
    iget-object p1, p0, Ld6/p;->d:Ld6/w;

    .line 336
    .line 337
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    const/16 v0, 0x9

    .line 341
    .line 342
    invoke-virtual {p1, v0}, Ld6/w;->e(I)V

    .line 343
    .line 344
    .line 345
    new-instance p1, Ljava/io/IOException;

    .line 346
    .line 347
    const-string v0, "Canceled"

    .line 348
    .line 349
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw p1

    .line 353
    :catchall_1
    move-exception v0

    .line 354
    goto :goto_4

    .line 355
    :cond_d
    :try_start_3
    new-instance v0, Ld6/a;

    .line 356
    .line 357
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 358
    .line 359
    .line 360
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 361
    :goto_3
    :try_start_4
    monitor-exit v8

    .line 362
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 363
    :goto_4
    monitor-exit p1

    .line 364
    throw v0
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
.end method

.method public final f(Z)Lw5/y;
    .locals 11

    .line 1
    iget-object v0, p0, Ld6/p;->d:Ld6/w;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, Ld6/w;->k:Ld6/v;

    .line 7
    .line 8
    invoke-virtual {v1}, Lj6/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    :goto_0
    :try_start_1
    iget-object v1, v0, Ld6/w;->g:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget v1, v0, Ld6/w;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 32
    .line 33
    .line 34
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    :try_start_4
    iget-object v1, v0, Ld6/w;->k:Ld6/v;

    .line 44
    .line 45
    invoke-virtual {v1}, Ld6/v;->k()V

    .line 46
    .line 47
    .line 48
    iget-object v1, v0, Ld6/w;->g:Ljava/util/ArrayDeque;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Ld6/w;->g:Ljava/util/ArrayDeque;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    const-string v2, "headersQueue.removeFirst()"

    .line 63
    .line 64
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    check-cast v1, Lw5/n;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 68
    .line 69
    monitor-exit v0

    .line 70
    iget-object v0, p0, Ld6/p;->e:Lw5/v;

    .line 71
    .line 72
    const-string v2, "protocol"

    .line 73
    .line 74
    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    const/16 v3, 0x14

    .line 80
    .line 81
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lw5/n;->size()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    move-object v7, v4

    .line 91
    const/4 v6, 0x0

    .line 92
    :goto_1
    if-ge v6, v3, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1, v6}, Lw5/n;->g(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-virtual {v1, v6}, Lw5/n;->i(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    const-string v10, ":status"

    .line 103
    .line 104
    invoke-static {v8, v10}, Lkotlin/jvm/internal/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_1

    .line 109
    .line 110
    new-instance v7, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v8, "HTTP/1.1 "

    .line 113
    .line 114
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-static {v7}, Le6/l;->A(Ljava/lang/String;)Lb6/i;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    goto :goto_2

    .line 129
    :cond_1
    sget-object v10, Ld6/p;->h:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v10, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    if-nez v10, :cond_2

    .line 136
    .line 137
    const-string v10, "name"

    .line 138
    .line 139
    invoke-static {v8, v10}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v10, "value"

    .line 143
    .line 144
    invoke-static {v9, v10}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    invoke-static {v9}, Ll5/e;->I0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_3
    if-eqz v7, :cond_5

    .line 165
    .line 166
    new-instance v1, Lw5/y;

    .line 167
    .line 168
    invoke-direct {v1}, Lw5/y;-><init>()V

    .line 169
    .line 170
    .line 171
    iput-object v0, v1, Lw5/y;->b:Lw5/v;

    .line 172
    .line 173
    iget v0, v7, Lb6/i;->b:I

    .line 174
    .line 175
    iput v0, v1, Lw5/y;->c:I

    .line 176
    .line 177
    iget-object v0, v7, Lb6/i;->d:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Ljava/lang/String;

    .line 180
    .line 181
    iput-object v0, v1, Lw5/y;->d:Ljava/lang/String;

    .line 182
    .line 183
    new-array v0, v5, [Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, [Ljava/lang/String;

    .line 190
    .line 191
    new-instance v2, Lp3/j;

    .line 192
    .line 193
    invoke-direct {v2}, Lp3/j;-><init>()V

    .line 194
    .line 195
    .line 196
    iget-object v3, v2, Lp3/j;->a:Ljava/util/ArrayList;

    .line 197
    .line 198
    const-string v5, "<this>"

    .line 199
    .line 200
    invoke-static {v3, v5}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    const-string v5, "elements"

    .line 204
    .line 205
    invoke-static {v0, v5}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v0}, Lq4/h;->K([Ljava/lang/Object;)Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 213
    .line 214
    .line 215
    iput-object v2, v1, Lw5/y;->f:Lp3/j;

    .line 216
    .line 217
    if-eqz p1, :cond_4

    .line 218
    .line 219
    iget p1, v1, Lw5/y;->c:I

    .line 220
    .line 221
    const/16 v0, 0x64

    .line 222
    .line 223
    if-ne p1, v0, :cond_4

    .line 224
    .line 225
    return-object v4

    .line 226
    :cond_4
    return-object v1

    .line 227
    :cond_5
    new-instance p1, Ljava/net/ProtocolException;

    .line 228
    .line 229
    const-string v0, "Expected \':status\' header not present"

    .line 230
    .line 231
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p1

    .line 235
    :catchall_1
    move-exception p1

    .line 236
    goto :goto_5

    .line 237
    :cond_6
    :try_start_5
    iget-object p1, v0, Ld6/w;->n:Ljava/io/IOException;

    .line 238
    .line 239
    if-eqz p1, :cond_7

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_7
    new-instance p1, Ld6/c0;

    .line 243
    .line 244
    iget v1, v0, Ld6/w;->m:I

    .line 245
    .line 246
    invoke-static {v1}, Landroidx/appcompat/app/b;->s(I)V

    .line 247
    .line 248
    .line 249
    invoke-direct {p1, v1}, Ld6/c0;-><init>(I)V

    .line 250
    .line 251
    .line 252
    :goto_3
    throw p1

    .line 253
    :goto_4
    iget-object v1, v0, Ld6/w;->k:Ld6/v;

    .line 254
    .line 255
    invoke-virtual {v1}, Ld6/v;->k()V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :goto_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 260
    throw p1

    .line 261
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 262
    .line 263
    const-string v0, "stream wasn\'t created"

    .line 264
    .line 265
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw p1
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
.end method

.method public final g(Lw5/z;)Lj6/i0;
    .locals 0

    .line 1
    iget-object p1, p0, Ld6/p;->d:Ld6/w;

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Ld6/w;->i:Ld6/u;

    .line 7
    .line 8
    return-object p1
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

.method public final h()La6/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ld6/p;->a:La6/n;

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
