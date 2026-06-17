.class public final Lr5/h;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lq5/h;


# instance fields
.field public final synthetic h:Lp5/e;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lp5/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr5/h;->h:Lp5/e;

    .line 5
    .line 6
    iput p2, p0, Lr5/h;->i:I

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
.method public final c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lr5/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lr5/g;

    .line 7
    .line 8
    iget v1, v0, Lr5/g;->j:I

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
    iput v1, v0, Lr5/g;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lr5/g;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lr5/g;-><init>(Lr5/h;Lt4/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lr5/g;->h:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 28
    .line 29
    iget v2, v0, Lr5/g;->j:I

    .line 30
    .line 31
    sget-object v3, Lp4/k;->a:Lp4/k;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v5, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Lq4/u;

    .line 61
    .line 62
    iget v2, p0, Lr5/h;->i:I

    .line 63
    .line 64
    invoke-direct {p2, v2, p1}, Lq4/u;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput v5, v0, Lr5/g;->j:I

    .line 68
    .line 69
    iget-object p1, p0, Lr5/h;->h:Lp5/e;

    .line 70
    .line 71
    invoke-interface {p1, p2, v0}, Lp5/v;->j(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v1, :cond_4

    .line 76
    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_4
    :goto_1
    iput v4, v0, Lr5/g;->j:I

    .line 80
    .line 81
    invoke-interface {v0}, Lt4/c;->getContext()Lt4/h;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Ln5/x;->g(Lt4/h;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, Le6/l;->w(Lt4/c;)Lt4/c;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    instance-of v0, p2, Ls5/g;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    check-cast p2, Ls5/g;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const/4 p2, 0x0

    .line 100
    :goto_2
    if-nez p2, :cond_6

    .line 101
    .line 102
    :goto_3
    move-object p1, v3

    .line 103
    goto/16 :goto_8

    .line 104
    .line 105
    :cond_6
    iget-object v0, p2, Ls5/g;->k:Ln5/r;

    .line 106
    .line 107
    invoke-static {v0, p1}, Ls5/b;->j(Ln5/r;Lt4/h;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    iput-object v3, p2, Ls5/g;->m:Ljava/lang/Object;

    .line 114
    .line 115
    iput v5, p2, Ln5/e0;->j:I

    .line 116
    .line 117
    invoke-virtual {v0, p1, p2}, Ln5/r;->N(Lt4/h;Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_7
    new-instance v2, Ln5/v1;

    .line 122
    .line 123
    sget-object v4, Ln5/v1;->i:Ln5/x0;

    .line 124
    .line 125
    invoke-direct {v2, v4}, Lt4/a;-><init>(Lt4/g;)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, v2}, Lt4/h;->plus(Lt4/h;)Lt4/h;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    iput-object v3, p2, Ls5/g;->m:Ljava/lang/Object;

    .line 133
    .line 134
    iput v5, p2, Ln5/e0;->j:I

    .line 135
    .line 136
    invoke-virtual {v0, p1, p2}, Ln5/r;->N(Lt4/h;Ljava/lang/Runnable;)V

    .line 137
    .line 138
    .line 139
    iget-boolean p1, v2, Ln5/v1;->h:Z

    .line 140
    .line 141
    if-eqz p1, :cond_b

    .line 142
    .line 143
    invoke-static {}, Ln5/n1;->a()Ln5/p0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object v0, p1, Ln5/p0;->k:Lq4/g;

    .line 148
    .line 149
    if-eqz v0, :cond_8

    .line 150
    .line 151
    invoke-virtual {v0}, Lq4/g;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    goto :goto_4

    .line 156
    :cond_8
    const/4 v0, 0x1

    .line 157
    :goto_4
    if-eqz v0, :cond_9

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_9
    iget-wide v6, p1, Ln5/p0;->i:J

    .line 161
    .line 162
    const-wide v8, 0x100000000L

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    cmp-long v0, v6, v8

    .line 168
    .line 169
    if-ltz v0, :cond_a

    .line 170
    .line 171
    const/4 v0, 0x1

    .line 172
    goto :goto_5

    .line 173
    :cond_a
    const/4 v0, 0x0

    .line 174
    :goto_5
    if-eqz v0, :cond_c

    .line 175
    .line 176
    iput-object v3, p2, Ls5/g;->m:Ljava/lang/Object;

    .line 177
    .line 178
    iput v5, p2, Ln5/e0;->j:I

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Ln5/p0;->h0(Ln5/e0;)V

    .line 181
    .line 182
    .line 183
    :cond_b
    :goto_6
    move-object p1, v1

    .line 184
    goto :goto_8

    .line 185
    :cond_c
    invoke-virtual {p1, v5}, Ln5/p0;->x0(Z)V

    .line 186
    .line 187
    .line 188
    :try_start_0
    invoke-virtual {p2}, Ln5/e0;->run()V

    .line 189
    .line 190
    .line 191
    :cond_d
    invoke-virtual {p1}, Ln5/p0;->z0()Z

    .line 192
    .line 193
    .line 194
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    if-nez v0, :cond_d

    .line 196
    .line 197
    :goto_7
    invoke-virtual {p1, v5}, Ln5/p0;->e0(Z)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    :try_start_1
    invoke-virtual {p2, v0}, Ln5/e0;->h(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :catchall_1
    move-exception p2

    .line 207
    invoke-virtual {p1, v5}, Ln5/p0;->e0(Z)V

    .line 208
    .line 209
    .line 210
    throw p2

    .line 211
    :goto_8
    sget-object p2, Lu4/a;->h:Lu4/a;

    .line 212
    .line 213
    if-ne p1, p2, :cond_e

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_e
    move-object p1, v3

    .line 217
    :goto_9
    if-ne p1, v1, :cond_f

    .line 218
    .line 219
    :goto_a
    return-object v1

    .line 220
    :cond_f
    return-object v3
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
