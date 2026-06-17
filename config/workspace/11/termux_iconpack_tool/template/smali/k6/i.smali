.class public final Lk6/i;
.super Lkotlin/jvm/internal/k;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ld5/p;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lj6/c0;

.field public final synthetic j:Lkotlin/jvm/internal/o;

.field public final synthetic k:Lkotlin/jvm/internal/o;

.field public final synthetic l:Lkotlin/jvm/internal/o;


# direct methods
.method public constructor <init>(Lj6/c0;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk6/i;->h:I

    .line 1
    iput-object p1, p0, Lk6/i;->i:Lj6/c0;

    iput-object p2, p0, Lk6/i;->j:Lkotlin/jvm/internal/o;

    iput-object p3, p0, Lk6/i;->k:Lkotlin/jvm/internal/o;

    iput-object p4, p0, Lk6/i;->l:Lkotlin/jvm/internal/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/o;Lj6/c0;Lkotlin/jvm/internal/o;Lkotlin/jvm/internal/o;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk6/i;->h:I

    .line 2
    iput-object p1, p0, Lk6/i;->j:Lkotlin/jvm/internal/o;

    iput-object p2, p0, Lk6/i;->i:Lj6/c0;

    iput-object p3, p0, Lk6/i;->k:Lkotlin/jvm/internal/o;

    iput-object p4, p0, Lk6/i;->l:Lkotlin/jvm/internal/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lk6/i;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    check-cast p2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const/16 p2, 0x5455

    .line 19
    .line 20
    if-ne p1, p2, :cond_a

    .line 21
    .line 22
    const-string p1, "bad zip: extended timestamp extra too short"

    .line 23
    .line 24
    const-wide/16 v2, 0x1

    .line 25
    .line 26
    cmp-long p2, v0, v2

    .line 27
    .line 28
    if-ltz p2, :cond_9

    .line 29
    .line 30
    iget-object p2, p0, Lk6/i;->i:Lj6/c0;

    .line 31
    .line 32
    invoke-virtual {p2}, Lj6/c0;->readByte()B

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    and-int/lit8 v5, v4, 0x1

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    if-ne v5, v7, :cond_0

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v5, 0x0

    .line 45
    :goto_0
    and-int/lit8 v8, v4, 0x2

    .line 46
    .line 47
    const/4 v9, 0x2

    .line 48
    if-ne v8, v9, :cond_1

    .line 49
    .line 50
    const/4 v8, 0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v8, 0x0

    .line 53
    :goto_1
    const/4 v9, 0x4

    .line 54
    and-int/2addr v4, v9

    .line 55
    if-ne v4, v9, :cond_2

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    :cond_2
    if-eqz v5, :cond_3

    .line 59
    .line 60
    const-wide/16 v2, 0x5

    .line 61
    .line 62
    :cond_3
    const-wide/16 v9, 0x4

    .line 63
    .line 64
    if-eqz v8, :cond_4

    .line 65
    .line 66
    add-long/2addr v2, v9

    .line 67
    :cond_4
    if-eqz v6, :cond_5

    .line 68
    .line 69
    add-long/2addr v2, v9

    .line 70
    :cond_5
    cmp-long v4, v0, v2

    .line 71
    .line 72
    if-ltz v4, :cond_8

    .line 73
    .line 74
    if-eqz v5, :cond_6

    .line 75
    .line 76
    invoke-virtual {p2}, Lj6/c0;->c()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object v0, p0, Lk6/i;->j:Lkotlin/jvm/internal/o;

    .line 85
    .line 86
    iput-object p1, v0, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 87
    .line 88
    :cond_6
    if-eqz v8, :cond_7

    .line 89
    .line 90
    invoke-virtual {p2}, Lj6/c0;->c()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object v0, p0, Lk6/i;->k:Lkotlin/jvm/internal/o;

    .line 99
    .line 100
    iput-object p1, v0, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 101
    .line 102
    :cond_7
    if-eqz v6, :cond_a

    .line 103
    .line 104
    invoke-virtual {p2}, Lj6/c0;->c()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object p2, p0, Lk6/i;->l:Lkotlin/jvm/internal/o;

    .line 113
    .line 114
    iput-object p1, p2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_8
    new-instance p2, Ljava/io/IOException;

    .line 118
    .line 119
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p2

    .line 123
    :cond_9
    new-instance p2, Ljava/io/IOException;

    .line 124
    .line 125
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p2

    .line 129
    :cond_a
    :goto_2
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 130
    .line 131
    return-object p1

    .line 132
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    check-cast p2, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    const/4 p2, 0x1

    .line 145
    if-ne p1, p2, :cond_d

    .line 146
    .line 147
    iget-object p1, p0, Lk6/i;->j:Lkotlin/jvm/internal/o;

    .line 148
    .line 149
    iget-object p2, p1, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 150
    .line 151
    if-nez p2, :cond_c

    .line 152
    .line 153
    const-wide/16 v2, 0x18

    .line 154
    .line 155
    cmp-long p2, v0, v2

    .line 156
    .line 157
    if-nez p2, :cond_b

    .line 158
    .line 159
    iget-object p2, p0, Lk6/i;->i:Lj6/c0;

    .line 160
    .line 161
    invoke-virtual {p2}, Lj6/c0;->e()J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, p1, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 170
    .line 171
    invoke-virtual {p2}, Lj6/c0;->e()J

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget-object v0, p0, Lk6/i;->k:Lkotlin/jvm/internal/o;

    .line 180
    .line 181
    iput-object p1, v0, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 182
    .line 183
    invoke-virtual {p2}, Lj6/c0;->e()J

    .line 184
    .line 185
    .line 186
    move-result-wide p1

    .line 187
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object p2, p0, Lk6/i;->l:Lkotlin/jvm/internal/o;

    .line 192
    .line 193
    iput-object p1, p2, Lkotlin/jvm/internal/o;->h:Ljava/lang/Object;

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 197
    .line 198
    const-string p2, "bad zip: NTFS extra attribute tag 0x0001 size != 24"

    .line 199
    .line 200
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p1

    .line 204
    :cond_c
    new-instance p1, Ljava/io/IOException;

    .line 205
    .line 206
    const-string p2, "bad zip: NTFS extra attribute tag 0x0001 repeated"

    .line 207
    .line 208
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_d
    :goto_3
    sget-object p1, Lp4/k;->a:Lp4/k;

    .line 213
    .line 214
    return-object p1

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
