.class public final Landroidx/room/p;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lq5/h;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/room/p;->h:I

    iput-object p2, p0, Landroidx/room/p;->i:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/room/p;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lq5/h;Ld5/p;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/room/p;->h:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/p;->i:Ljava/lang/Object;

    check-cast p2, Lv4/h;

    iput-object p2, p0, Landroidx/room/p;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Landroidx/room/p;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lq5/p;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lq5/p;

    .line 12
    .line 13
    iget v1, v0, Lq5/p;->i:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lq5/p;->i:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lq5/p;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lq5/p;-><init>(Landroidx/room/p;Lt4/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lq5/p;->h:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 33
    .line 34
    iget v2, v0, Lq5/p;->i:I

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p1, v0, Lq5/p;->l:Lq5/h;

    .line 57
    .line 58
    iget-object v2, v0, Lq5/p;->k:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Landroidx/room/p;->i:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, Lq5/h;

    .line 70
    .line 71
    iget-object v2, p0, Landroidx/room/p;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lv4/h;

    .line 74
    .line 75
    iput-object p1, v0, Lq5/p;->k:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p2, v0, Lq5/p;->l:Lq5/h;

    .line 78
    .line 79
    iput v4, v0, Lq5/p;->i:I

    .line 80
    .line 81
    invoke-interface {v2, p1, v0}, Ld5/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-ne v2, v1, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move-object v2, p1

    .line 89
    move-object p1, p2

    .line 90
    :goto_1
    const/4 p2, 0x0

    .line 91
    iput-object p2, v0, Lq5/p;->k:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p2, v0, Lq5/p;->l:Lq5/h;

    .line 94
    .line 95
    iput v3, v0, Lq5/p;->i:I

    .line 96
    .line 97
    invoke-interface {p1, v2, v0}, Lq5/h;->c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-ne p1, v1, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    :goto_2
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 105
    .line 106
    :goto_3
    return-object v1

    .line 107
    :pswitch_0
    check-cast p1, Lq2/c;

    .line 108
    .line 109
    iget-object p2, p0, Landroidx/room/p;->i:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p2, Lq2/g;

    .line 112
    .line 113
    iget-object v0, p0, Landroidx/room/p;->j:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, Lu2/p;

    .line 116
    .line 117
    invoke-interface {p2, v0, p1}, Lq2/g;->d(Lu2/p;Lq2/c;)V

    .line 118
    .line 119
    .line 120
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_1
    instance-of v0, p2, Landroidx/room/o;

    .line 124
    .line 125
    if-eqz v0, :cond_6

    .line 126
    .line 127
    move-object v0, p2

    .line 128
    check-cast v0, Landroidx/room/o;

    .line 129
    .line 130
    iget v1, v0, Landroidx/room/o;->i:I

    .line 131
    .line 132
    const/high16 v2, -0x80000000

    .line 133
    .line 134
    and-int v3, v1, v2

    .line 135
    .line 136
    if-eqz v3, :cond_6

    .line 137
    .line 138
    sub-int/2addr v1, v2

    .line 139
    iput v1, v0, Landroidx/room/o;->i:I

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    new-instance v0, Landroidx/room/o;

    .line 143
    .line 144
    invoke-direct {v0, p0, p2}, Landroidx/room/o;-><init>(Landroidx/room/p;Lt4/c;)V

    .line 145
    .line 146
    .line 147
    :goto_4
    iget-object p2, v0, Landroidx/room/o;->h:Ljava/lang/Object;

    .line 148
    .line 149
    sget-object v1, Lu4/a;->h:Lu4/a;

    .line 150
    .line 151
    iget v2, v0, Landroidx/room/o;->i:I

    .line 152
    .line 153
    const/4 v3, 0x1

    .line 154
    if-eqz v2, :cond_8

    .line 155
    .line 156
    if-ne v2, v3, :cond_7

    .line 157
    .line 158
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 165
    .line 166
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_8
    invoke-static {p2}, Le6/l;->H(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    iget-object p2, p0, Landroidx/room/p;->i:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p2, Lq5/h;

    .line 176
    .line 177
    check-cast p1, Ljava/util/Set;

    .line 178
    .line 179
    new-instance v2, Lr4/i;

    .line 180
    .line 181
    invoke-direct {v2}, Lr4/i;-><init>()V

    .line 182
    .line 183
    .line 184
    iget-object v4, p0, Landroidx/room/p;->j:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v4, [Ljava/lang/String;

    .line 187
    .line 188
    array-length v5, v4

    .line 189
    const/4 v6, 0x0

    .line 190
    :goto_5
    if-ge v6, v5, :cond_b

    .line 191
    .line 192
    aget-object v7, v4, v6

    .line 193
    .line 194
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    :cond_9
    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-eqz v9, :cond_a

    .line 203
    .line 204
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    check-cast v9, Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v7, v9}, Ll5/m;->f0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    if-eqz v9, :cond_9

    .line 215
    .line 216
    invoke-virtual {v2, v7}, Lr4/i;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_b
    invoke-static {v2}, La/a;->j(Lr4/i;)Lr4/i;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iget-object v2, p1, Lr4/i;->h:Lr4/f;

    .line 228
    .line 229
    invoke-virtual {v2}, Lr4/f;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_c

    .line 234
    .line 235
    const/4 p1, 0x0

    .line 236
    :cond_c
    if-eqz p1, :cond_d

    .line 237
    .line 238
    iput v3, v0, Landroidx/room/o;->i:I

    .line 239
    .line 240
    invoke-interface {p2, p1, v0}, Lq5/h;->c(Ljava/lang/Object;Lt4/c;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-ne p1, v1, :cond_d

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_d
    :goto_7
    sget-object v1, Lp4/k;->a:Lp4/k;

    .line 248
    .line 249
    :goto_8
    return-object v1

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
