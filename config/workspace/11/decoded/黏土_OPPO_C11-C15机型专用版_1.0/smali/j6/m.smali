.class public final Lj6/m;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lj6/i0;


# instance fields
.field public final h:Lj6/u;

.field public i:J

.field public j:Z


# direct methods
.method public constructor <init>(Lj6/u;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj6/m;->h:Lj6/u;

    .line 5
    .line 6
    iput-wide p2, p0, Lj6/m;->i:J

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
.end method


# virtual methods
.method public final U(Lj6/i;J)J
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "sink"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-boolean v4, v1, Lj6/m;->j:Z

    .line 13
    .line 14
    if-nez v4, :cond_8

    .line 15
    .line 16
    iget-object v4, v1, Lj6/m;->h:Lj6/u;

    .line 17
    .line 18
    iget-wide v5, v1, Lj6/m;->i:J

    .line 19
    .line 20
    const-wide/16 v7, 0x0

    .line 21
    .line 22
    cmp-long v9, v2, v7

    .line 23
    .line 24
    if-ltz v9, :cond_7

    .line 25
    .line 26
    add-long/2addr v2, v5

    .line 27
    move-wide v7, v5

    .line 28
    :goto_0
    cmp-long v11, v7, v2

    .line 29
    .line 30
    if-gez v11, :cond_4

    .line 31
    .line 32
    const/4 v11, 0x1

    .line 33
    invoke-virtual {v0, v11}, Lj6/i;->z0(I)Lj6/d0;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    iget-object v12, v11, Lj6/d0;->a:[B

    .line 38
    .line 39
    iget v13, v11, Lj6/d0;->c:I

    .line 40
    .line 41
    sub-long v14, v2, v7

    .line 42
    .line 43
    const-wide/16 p2, -0x1

    .line 44
    .line 45
    rsub-int v9, v13, 0x2000

    .line 46
    .line 47
    int-to-long v9, v9

    .line 48
    invoke-static {v14, v15, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v9

    .line 52
    long-to-int v10, v9

    .line 53
    monitor-enter v4

    .line 54
    :try_start_0
    const-string v9, "array"

    .line 55
    .line 56
    invoke-static {v12, v9}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v9, v4, Lj6/u;->k:Ljava/io/RandomAccessFile;

    .line 60
    .line 61
    invoke-virtual {v9, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 62
    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    :goto_1
    if-ge v9, v10, :cond_1

    .line 66
    .line 67
    iget-object v15, v4, Lj6/u;->k:Ljava/io/RandomAccessFile;

    .line 68
    .line 69
    sub-int v14, v10, v9

    .line 70
    .line 71
    invoke-virtual {v15, v12, v13, v14}, Ljava/io/RandomAccessFile;->read([BII)I

    .line 72
    .line 73
    .line 74
    move-result v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    const/4 v15, -0x1

    .line 76
    if-ne v14, v15, :cond_0

    .line 77
    .line 78
    if-nez v9, :cond_1

    .line 79
    .line 80
    monitor-exit v4

    .line 81
    const/4 v9, -0x1

    .line 82
    :goto_2
    const/4 v15, -0x1

    .line 83
    goto :goto_3

    .line 84
    :cond_0
    add-int/2addr v9, v14

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    goto :goto_4

    .line 88
    :cond_1
    monitor-exit v4

    .line 89
    goto :goto_2

    .line 90
    :goto_3
    if-ne v9, v15, :cond_3

    .line 91
    .line 92
    iget v2, v11, Lj6/d0;->b:I

    .line 93
    .line 94
    iget v3, v11, Lj6/d0;->c:I

    .line 95
    .line 96
    if-ne v2, v3, :cond_2

    .line 97
    .line 98
    invoke-virtual {v11}, Lj6/d0;->a()Lj6/d0;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iput-object v2, v0, Lj6/i;->h:Lj6/d0;

    .line 103
    .line 104
    invoke-static {v11}, Lj6/e0;->a(Lj6/d0;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    cmp-long v0, v5, v7

    .line 108
    .line 109
    if-nez v0, :cond_5

    .line 110
    .line 111
    move-wide/from16 v7, p2

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_3
    iget v10, v11, Lj6/d0;->c:I

    .line 115
    .line 116
    add-int/2addr v10, v9

    .line 117
    iput v10, v11, Lj6/d0;->c:I

    .line 118
    .line 119
    int-to-long v9, v9

    .line 120
    add-long/2addr v7, v9

    .line 121
    iget-wide v11, v0, Lj6/i;->i:J

    .line 122
    .line 123
    add-long/2addr v11, v9

    .line 124
    iput-wide v11, v0, Lj6/i;->i:J

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :goto_4
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    throw v0

    .line 129
    :cond_4
    const-wide/16 p2, -0x1

    .line 130
    .line 131
    :cond_5
    sub-long/2addr v7, v5

    .line 132
    :goto_5
    cmp-long v0, v7, p2

    .line 133
    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    iget-wide v2, v1, Lj6/m;->i:J

    .line 137
    .line 138
    add-long/2addr v2, v7

    .line 139
    iput-wide v2, v1, Lj6/m;->i:J

    .line 140
    .line 141
    :cond_6
    return-wide v7

    .line 142
    :cond_7
    const-string v0, "byteCount < 0: "

    .line 143
    .line 144
    invoke-static {v0, v2, v3}, Landroidx/appcompat/app/b;->m(Ljava/lang/String;J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v2

    .line 158
    :cond_8
    const-string v0, "closed"

    .line 159
    .line 160
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v2
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

.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lj6/m;->h:Lj6/u;

    .line 2
    .line 3
    iget-boolean v1, p0, Lj6/m;->j:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lj6/m;->j:Z

    .line 10
    .line 11
    iget-object v1, v0, Lj6/u;->j:Ljava/util/concurrent/locks/ReentrantLock;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget v2, v0, Lj6/u;->i:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    iput v2, v0, Lj6/u;->i:I

    .line 21
    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    iget-boolean v2, v0, Lj6/u;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    monitor-enter v0

    .line 33
    :try_start_1
    iget-object v1, v0, Lj6/u;->k:Ljava/io/RandomAccessFile;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw v1

    .line 43
    :catchall_1
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 50
    .line 51
    .line 52
    throw v0
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

.method public final h()Lj6/k0;
    .locals 1

    .line 1
    sget-object v0, Lj6/k0;->d:Lj6/j0;

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
