.class public final Lq2/k;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lq5/g;


# instance fields
.field public final synthetic h:I

.field public final i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lq2/k;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lq2/k;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
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
.method public final b(Lq5/h;Lt4/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lq2/k;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq2/k;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/room/q;

    .line 9
    .line 10
    new-instance v1, Lq5/n;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, v2, p1}, Lq5/n;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p2}, Landroidx/room/q;->b(Lq5/h;Lt4/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lu4/a;->h:Lu4/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 26
    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_0
    instance-of v0, p2, Lq5/a;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, Lq5/a;

    .line 34
    .line 35
    iget v1, v0, Lq5/a;->k:I

    .line 36
    .line 37
    const/high16 v2, -0x80000000

    .line 38
    .line 39
    and-int v3, v1, v2

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    sub-int/2addr v1, v2

    .line 44
    iput v1, v0, Lq5/a;->k:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance v0, Lq5/a;

    .line 48
    .line 49
    invoke-direct {v0, p0, p2}, Lq5/a;-><init>(Lq2/k;Lt4/c;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object p2, v0, Lq5/a;->i:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 55
    .line 56
    iget v2, v0, Lq5/a;->k:I

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    if-ne v2, v3, :cond_2

    .line 62
    .line 63
    iget-object p1, v0, Lq5/a;->h:Lr5/p;

    .line 64
    .line 65
    :try_start_0
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lv4/c;->releaseIntercepted()V

    .line 69
    .line 70
    .line 71
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p2, v0

    .line 76
    goto :goto_4

    .line 77
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_3
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance p2, Lr5/p;

    .line 89
    .line 90
    invoke-interface {v0}, Lt4/c;->getContext()Lt4/h;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {p2, p1, v2}, Lr5/p;-><init>(Lq5/h;Lt4/h;)V

    .line 95
    .line 96
    .line 97
    :try_start_1
    iput-object p2, v0, Lq5/a;->h:Lr5/p;

    .line 98
    .line 99
    iput v3, v0, Lq5/a;->k:I

    .line 100
    .line 101
    iget-object p1, p0, Lq2/k;->i:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Landroidx/room/k1;

    .line 104
    .line 105
    invoke-virtual {p1, p2, v0}, Landroidx/room/k1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :goto_3
    move-object v7, p2

    .line 110
    move-object p2, p1

    .line 111
    move-object p1, v7

    .line 112
    goto :goto_4

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    move-object p1, v0

    .line 115
    goto :goto_3

    .line 116
    :goto_4
    invoke-virtual {p1}, Lv4/c;->releaseIntercepted()V

    .line 117
    .line 118
    .line 119
    throw p2

    .line 120
    :pswitch_1
    iget-object v0, p0, Lq2/k;->i:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v2, v0

    .line 123
    check-cast v2, [Lq5/g;

    .line 124
    .line 125
    new-instance v3, La6/m;

    .line 126
    .line 127
    const/4 v0, 0x2

    .line 128
    invoke-direct {v3, v0, v2}, La6/m;-><init>(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-instance v4, Lq2/j;

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    const/4 v1, 0x3

    .line 135
    invoke-direct {v4, v1, v0}, Lv4/h;-><init>(ILt4/c;)V

    .line 136
    .line 137
    .line 138
    new-instance v1, Lr5/j;

    .line 139
    .line 140
    const/4 v6, 0x0

    .line 141
    move-object v5, p1

    .line 142
    invoke-direct/range {v1 .. v6}, Lr5/j;-><init>([Lq5/g;La6/m;Lq2/j;Lq5/h;Lt4/c;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, Lr5/l;

    .line 146
    .line 147
    invoke-interface {p2}, Lt4/c;->getContext()Lt4/h;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-direct {p1, p2, v0}, Ls5/r;-><init>(Lt4/c;Lt4/h;)V

    .line 152
    .line 153
    .line 154
    const/4 p2, 0x1

    .line 155
    invoke-static {p1, p2, p1, v1}, Lq3/a;->Z(Ls5/r;ZLs5/r;Ld5/p;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    sget-object p2, Lu4/a;->h:Lu4/a;

    .line 160
    .line 161
    sget-object v0, Lp4/k;->a:Lp4/k;

    .line 162
    .line 163
    if-ne p1, p2, :cond_4

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_4
    move-object p1, v0

    .line 167
    :goto_5
    if-ne p1, p2, :cond_5

    .line 168
    .line 169
    move-object v0, p1

    .line 170
    :cond_5
    return-object v0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
