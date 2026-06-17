.class public final Landroidx/room/n;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Landroidx/room/r0;

.field public final b:[Ljava/lang/String;

.field public final c:Landroidx/room/s1;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/concurrent/locks/ReentrantLock;

.field public final f:Landroidx/room/j;

.field public final g:Landroidx/room/j;

.field public final h:Lu2/e;

.field public i:Landroid/content/Intent;

.field public j:Landroidx/room/v;

.field public final k:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Landroidx/room/r0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/room/n;->a:Landroidx/room/r0;

    .line 5
    .line 6
    move-object v8, p4

    .line 7
    iput-object v8, p0, Landroidx/room/n;->b:[Ljava/lang/String;

    .line 8
    .line 9
    new-instance v9, Landroidx/room/s1;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/room/r0;->getUseTempTrackingTable$room_runtime_release()Z

    .line 12
    .line 13
    .line 14
    move-result v10

    .line 15
    new-instance v0, Landroidx/room/m;

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    const-class v3, Landroidx/room/n;

    .line 21
    .line 22
    const-string v4, "notifyInvalidatedObservers"

    .line 23
    .line 24
    const-string v5, "notifyInvalidatedObservers(Ljava/util/Set;)V"

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    invoke-direct/range {v0 .. v7}, Landroidx/room/m;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    move-object v1, p1

    .line 31
    move-object v2, p2

    .line 32
    move-object v3, p3

    .line 33
    move-object v6, v0

    .line 34
    move-object v4, v8

    .line 35
    move-object v0, v9

    .line 36
    move v5, v10

    .line 37
    invoke-direct/range {v0 .. v6}, Landroidx/room/s1;-><init>(Landroidx/room/r0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;ZLandroidx/room/m;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Landroidx/room/n;->c:Landroidx/room/s1;

    .line 41
    .line 42
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Landroidx/room/n;->d:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v2, p0, Landroidx/room/n;->e:Ljava/util/concurrent/locks/ReentrantLock;

    .line 55
    .line 56
    new-instance v2, Landroidx/room/j;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {v2, p0, v3}, Landroidx/room/j;-><init>(Landroidx/room/n;I)V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Landroidx/room/n;->f:Landroidx/room/j;

    .line 63
    .line 64
    new-instance v2, Landroidx/room/j;

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    invoke-direct {v2, p0, v3}, Landroidx/room/j;-><init>(Landroidx/room/n;I)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Landroidx/room/n;->g:Landroidx/room/j;

    .line 71
    .line 72
    new-instance v2, Lu2/e;

    .line 73
    .line 74
    invoke-direct {v2, p1}, Lu2/e;-><init>(Landroidx/room/r0;)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, Landroidx/room/n;->h:Lu2/e;

    .line 78
    .line 79
    new-instance v1, Ljava/lang/Object;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Landroidx/room/n;->k:Ljava/lang/Object;

    .line 85
    .line 86
    new-instance v1, Landroidx/room/j;

    .line 87
    .line 88
    const/4 v2, 0x2

    .line 89
    invoke-direct {v1, p0, v2}, Landroidx/room/j;-><init>(Landroidx/room/n;I)V

    .line 90
    .line 91
    .line 92
    iput-object v1, v0, Landroidx/room/s1;->k:Ld5/a;

    .line 93
    .line 94
    return-void
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
.method public final a(Landroidx/room/k;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/room/n;->d:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/room/k;->a:[Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/room/n;->c:Landroidx/room/s1;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Landroidx/room/s1;->g([Ljava/lang/String;)Lp4/f;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v3, v1, Lp4/f;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, [Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, v1, Lp4/f;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, [I

    .line 18
    .line 19
    new-instance v4, Landroidx/room/b0;

    .line 20
    .line 21
    invoke-direct {v4, p1, v1, v3}, Landroidx/room/b0;-><init>(Landroidx/room/k;[I[Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, Landroidx/room/n;->e:Ljava/util/concurrent/locks/ReentrantLock;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    invoke-static {v0, p1}, Lq4/v;->T(Ljava/util/LinkedHashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroidx/room/b0;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Landroidx/room/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    :goto_0
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 51
    .line 52
    .line 53
    if-nez p1, :cond_1

    .line 54
    .line 55
    iget-object p1, v2, Landroidx/room/s1;->h:Landroidx/room/z;

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Landroidx/room/z;->c([I)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_1
    const/4 p1, 0x0

    .line 66
    return p1

    .line 67
    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 68
    .line 69
    .line 70
    throw p1
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
.end method

.method public final b(Landroidx/room/k;)V
    .locals 2

    .line 1
    const-string v0, "observer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/room/n;->e:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Landroidx/room/n;->d:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroidx/room/b0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/room/b0;->b:[I

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/room/n;->c:Landroidx/room/s1;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string v1, "tableIds"

    .line 32
    .line 33
    invoke-static {p1, v1}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Landroidx/room/s1;->h:Landroidx/room/z;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroidx/room/z;->d([I)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    new-instance p1, Landroidx/room/l;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {p1, p0, v0, v1}, Landroidx/room/l;-><init>(Landroidx/room/n;Lt4/c;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Le6/d;->O(Ld5/p;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 57
    .line 58
    .line 59
    throw p1
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
.end method

.method public final c(Lv4/h;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/n;->a:Landroidx/room/r0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/room/r0;->inCompatibilityMode$room_runtime_release()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/room/r0;->isOpenInternal()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/room/n;->c:Landroidx/room/s1;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/room/s1;->f(Lv4/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, Lu4/a;->h:Lu4/a;

    .line 23
    .line 24
    if-ne p1, v0, :cond_1

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    :goto_0
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 28
    .line 29
    return-object p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
